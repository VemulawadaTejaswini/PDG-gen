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

        int cnt = 0;
        int placeNum = String.valueOf(N).length();
        for (int i = 1; i < placeNum; i++) {
            if (i % 2 == 1) cnt += 9 * Math.pow(10, i - 1);
        }

        if (placeNum % 2 == 1) cnt += N - Math.pow(10, placeNum - 1) + 1;

        System.out.println(cnt);

    }
}