package com.youcc.seckill.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 秒杀系统启动类
 **/
@SpringBootApplication
@MapperScan("com.youcc.seckill.common.domain.mapper")
@ComponentScan({"com.youcc.seckill.*"}) // 多模块项目中，必需手动指定扫描 com.quanxiaoha.seckill 包下面的所有类
public class SeckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeckillApplication.class, args);
    }
}