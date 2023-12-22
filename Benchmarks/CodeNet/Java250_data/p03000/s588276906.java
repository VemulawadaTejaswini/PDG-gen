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
        int X = sc.nextInt();

        int[] L = new int[N + 1];

        for (int i = 1; i < N + 1; i++) {
            L[i] = sc.nextInt();
        }

        int boundCnt = 1;
        int distance = 0;
        for (int i = 1; i < N + 1; i++) {
            distance += L[i];
            if (distance > X) break;
            boundCnt++;
        }


        System.out.println(boundCnt);
    }
}