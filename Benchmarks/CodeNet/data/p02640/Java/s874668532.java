import javax.swing.plaf.metal.MetalInternalFrameTitlePane;
import java.math.BigInteger;
import java.util.*;
import java.io.*;
import java.text.*;

public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in), 32768);
    static PrintWriter out = new PrintWriter(System.out);
    static StringTokenizer t;

    static String sn() {
        while (t == null || !t.hasMoreTokens()) {
            try {
                t = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException();
            }
        }
        return t.nextToken();
    }

    static int ni() {
        return Integer.parseInt(sn());
    }

    static long nlo() {
        return Long.parseLong(sn());
    }

    static long mod = (long) 1000000007;

    static long pro(long a, long b) {
        return (a % mod * b % mod) % mod;
    }

    static long add(long a, long b) {
        return (a + b) % mod;
    }

    static long sub(long a, long b) {
        return ((a % mod - b % mod) + mod) % mod;
    }

    static int pow(int n) {
        return (int) (Math.log10(n) / Math.log10(2));
    }

    static int modpow(int x, int y) {
        int res = 1;
//        x %= mod;
        while (y > 0) {
            if (y % 2 != 0)
                res *= x;
            x = x * x;
            y /= 2;
        }
        return res;
    }

//    static class pair {
//        String a;
//        int b;
//
//        pair(String x, int y) {
//            a = x;
//            b = y;
//        }
//    }

    static long modInverse(long n) {
        BigInteger n1 = new BigInteger(Long.toString(n));
        String s = (n1.modInverse(new BigInteger(Long.toString(mod)))).toString();
        return Long.parseLong(s) % mod;
    }

    static boolean v[] = new boolean[1000005];

    static void seive() {
        v[1] = true;
        for (int i = 2; i < 1000005; i++) {
            if (!v[i]) {
                for (int j = 2 * i; j < 1000005; j += i)
                    v[j] = true;
            }
        }
    }

    static boolean isprime(long n) {
        if (n == 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }

    static DecimalFormat df = new DecimalFormat("0.000000000000000000000");

    static class trie {
        trie a[] = new trie[26];
        int cnt = 0;
    }

    static int maxn = (int) 3e5 + 5;

    static long gcd(long a, long b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    static void solve() {
        int x = ni();
        int y = ni();
        if (y % 2 == 1)
            out.println("No");
        else {
            int l = 2 * x;
            int r = 4 * x;
            if (y >= l && y <= r)
                out.println("Yes");
            else
                out.println("No");
        }
    }

    public static void main(String args[]) {
        int t = 1;
        while (t-- > 0) {
            solve();
        }
        out.close();
    }
}

