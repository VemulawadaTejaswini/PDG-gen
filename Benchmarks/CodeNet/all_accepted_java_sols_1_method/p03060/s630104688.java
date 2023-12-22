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

        // String S = sc.next();
        // long u = sc.nextLong();

        int N = sc.nextInt();

        int[] V = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            V[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }

        int benefit = 0;
        for (int i = 0; i < N; i++) {
            if (V[i] > C[i]) {
                benefit += V[i] - C[i];
            }
        }

        System.out.println(benefit);
    }
}