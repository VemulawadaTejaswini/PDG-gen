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
        int[] d = new int[(int)N];

        for (int i = 0; i < N; i++) {
            d[i] = sc.nextInt();
        }

        long result = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                result += d[i] * d[j];
            }
        }

        System.out.println(result);
    }
}