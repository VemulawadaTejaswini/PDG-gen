//Created by Aminul on 9/13/2020.

import java.io.*;
import java.util.*;

import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int n = in.nextInt();
        long mod = (long) 1e9 + 7;
        pw.println(solve(n, mod));

        pw.close();
    }

    static long solve(long n, long mod) {
        if (n < 2) return 0;
        long res = bigMod(10, n, mod);
        res -= 2* bigMod(9, n, mod);
        res = (res % mod + mod) % mod;
        res += bigMod(8, n, mod);
        res %= mod;
        return res;
    }

    static long bigMod(long a, long p, long m) { // returns (a^p) % m
        long res = 1 % m, x = a % m;
        while (p > 0) {
            if ((p & 1) > 0) res = (res * x) % m;
            x = (x * x) % m;
            p >>= 1;
        }
        return res;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}