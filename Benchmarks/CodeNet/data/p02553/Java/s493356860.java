//Created by Amaxul on 9/13/2020.

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long a = in.nextInt(), b = in.nextInt();
        long c = in.nextInt(), d = in.nextInt();

        long max = getMin(a, b, c, d);
        pw.println(max);

        pw.close();
    }

    static long getMin(long a, long b, long c, long d) {
        long max = a * c;
        max = max(max, a * d);
        max = max(max, b * c);
        max = max(max, b * d);
        if ((a <= 0 && b >= 0) || (c <= 0 && d >= 0)) {
            max = max(max, 0);
        }
        return max;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}