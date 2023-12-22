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

        long N = sc.nextLong();

        boolean canDivide = false;

        for (int i = 1; i < 10; i++) {
            if (N % i == 0 && N / i < 10) {
                canDivide = true;
                break;
            }
        }

        System.out.println(canDivide ? "Yes" : "No");
    }
}