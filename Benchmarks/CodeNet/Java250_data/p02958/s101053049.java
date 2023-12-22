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

        // long N = sc.nextLong();
        // long K = sc.nextLong();
        int N = sc.nextInt();

        int[] P = new int[N];
        int[] P2 = new int[N];

        for (int i = 0; i < N; i++) {
            int tmp = sc.nextInt();
            P[i] = tmp;
            P2[i] = tmp;
        }

        Arrays.sort(P2);

        int cnt = 0;
        for (int i = 0; i < P2.length; i++) {
            if (P[i] != P2[i]) cnt++;
        }


        System.out.println(cnt <= 2 ? "YES" : "NO");
    }
}