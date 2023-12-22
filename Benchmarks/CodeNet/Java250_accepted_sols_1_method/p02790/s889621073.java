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

        long a = sc.nextLong();
        long b = sc.nextLong();

        StringBuffer sb = new StringBuffer();
        if (a < b) {
            for (int i = 0; i < b; i++) {
                sb.append(a);
            }
        }else {
            for (int i = 0; i < a; i++) {
                sb.append(b);
            }
        }

        System.out.println(sb.toString());
    }
}