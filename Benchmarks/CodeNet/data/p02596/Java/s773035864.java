//Created by Aminul on 8/2/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class C {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int k = in.nextInt();
        pw.println(solve(k));
        pw.close();
    }

    static int solve(int k) {
        int cnt = 1, val = 7 % k;
        while (val != 0 && cnt < 2e6) {
            val = ((val * 10) + 7) % k;
            cnt++;
        }
        return val == 0 ? cnt : -1;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}