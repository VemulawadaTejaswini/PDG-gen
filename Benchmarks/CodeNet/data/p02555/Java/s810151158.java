//Created by Aminul on 9/13/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    static long dp[], mod = (long) 1e9 + 7;

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int s = in.nextInt();
        dp = new long[s + 1];
        Arrays.fill(dp, -1);
        pw.println(solve(s));

        pw.close();
    }

    static long solve(int s) {
        if (s == 0) return 1;
        if(s < 3) return 0;
        if (dp[s] != -1) return dp[s];
        long res = 0;
        for (int i = 3; i <= s; i++) {
            res += solve(s - i);
            if (res >= mod) res -= mod;
        }
        return dp[s] = res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}