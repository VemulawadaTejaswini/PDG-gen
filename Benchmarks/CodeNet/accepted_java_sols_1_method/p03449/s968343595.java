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

        int[][] route = new int[2][N];
        for (int i = 0; i < 2; i++) {
            route[i] = new int[N];
            for(int j = 0; j < N; j++) {
                route[i][j] = sc.nextInt();
            }
        }

        int maxCandy = Integer.MIN_VALUE;
        for (int i = 0; i < N; i++) {
            int tmp = 0;
            int h = 0;
            for (int j = 0; j < N; j++) {
                tmp += route[h][j];
                if (i == j){
                    h++;
                    tmp += route[h][j];
                }
            }
            maxCandy = Math.max(maxCandy, tmp);
        }

        System.out.println(maxCandy);
    }
}