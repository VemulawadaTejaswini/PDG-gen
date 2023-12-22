// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();
        long N = sc.nextLong();

        boolean exceedHP = false;
        long score = 0;
        for (int i = 0; i < N; i++) {
            score += sc.nextLong();
            if (H <= score) {
                exceedHP = true;
                break;
            }
        }

        System.out.println(exceedHP ? "Yes" : "No");



    }
}