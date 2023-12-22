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
        long K = sc.nextLong();

        int result = 0;
        for (int i = 0; i < N; i++) {
            long height = sc.nextLong();
            result += height >= K ? 1 : 0;
        }

        System.out.println(result);
    }
}