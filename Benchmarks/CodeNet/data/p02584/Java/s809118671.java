//Created by Aminul on 8/15/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        long x = in.nextLong(), k = in.nextLong(), d = in.nextLong();
        long div = abs(x) / d;
        div = min(div, k);
        k -= div;
        if (k % 2 == 1) {
            div++;
        }

        if (x < 0) pw.println(abs(x + (div * d)));
        else pw.println(abs(x - (div * d)));
        pw.close();
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}