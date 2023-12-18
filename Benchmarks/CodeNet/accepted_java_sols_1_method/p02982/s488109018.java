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

        long N = sc.nextLong();
        long D = sc.nextLong();
        // long K = sc.nextLong();
        double[][] X = new double[(int) N][(int) D];

        int cnt = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < D; j++) {
                X[i][j] = sc.nextDouble();
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                boolean flag = true;
                double tmp = 0;
                for (int k = 0; k < D; k++) {
                    tmp += (X[i][k] - X[j][k]) * (X[i][k] - X[j][k]);
                }
                double ret = Math.sqrt(tmp);
                if (ret % 1.0 > 0.0001) {
                    flag = false;
                }
                cnt += flag ? 1 : 0;
            }
        }

        System.out.println(cnt);
    }
}