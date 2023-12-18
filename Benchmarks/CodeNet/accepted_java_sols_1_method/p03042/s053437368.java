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

        String S = sc.next();
        // long u = sc.nextLong();

        int firstHalf = Integer.parseInt(S.substring(0, 2));
        int endHalf = Integer.parseInt(S.substring(2, S.length()));

        String msg = "";
        if (firstHalf > 0 && firstHalf <= 12 && endHalf > 0 && endHalf <= 12) {
            msg = "AMBIGUOUS";
        } else if (firstHalf > 0 && firstHalf <= 12) {
            msg = "MMYY";
        } else if (endHalf > 0 && endHalf <= 12) {
            msg = "YYMM";
        } else {
            msg = "NA";
        }

        System.out.println(msg);
    }
}