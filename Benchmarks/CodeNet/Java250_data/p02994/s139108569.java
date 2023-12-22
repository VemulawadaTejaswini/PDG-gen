// package app;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Stream;

public class Main {

    public static void main(final String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        // long u = sc.nextLong();
        // long D = sc.nextLong();
        // long K = sc.nextLong();

        int N = sc.nextInt();
        int L = sc.nextInt();

        int excludeApple = 0;
        if (0 < L)
            excludeApple = 1;
        else
            excludeApple = Math.min(N, Math.abs(-1 + L));

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            if (excludeApple == i)
                continue;

            sum += i - 1 + L;
        }

        System.out.println(sum);
    }
}