import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.StringTokenizer;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Math.*;
import static java.lang.System.in;
import static java.lang.System.out;

import java.util.*;

public class Main {
    static FastScanner in = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    static class Graph {
        ArrayList<Integer>[] G = new ArrayList[200100];
        int[] visit;
        int N;

        Graph(int n) {
            N = n;
            visit = new int[n + 1];
            Arrays.fill(visit, 0);
            for (int i = 0; i <= n; ++i)
                G[i] = new ArrayList<>();
        }

        void add(int u, int v) {
            G[u].add(v);
            G[v].add(u);
        }

        void dfs(int n) {
            if (visit[n] == 1) return;
            visit[n] = 1;
            for (int x : G[n]) {
                dfs(x);
            }
        }

        int count_connected() {
            int ans = 0;
            for (int i = 1; i <= N; ++i) {
                //out.println("reached " + i);
                if (visit[i] == 1) continue;
                dfs(i);
                ++ans;
            }
            return ans - 1;
        }
    }

    public static void main(String[] args) {
        int n = ri(), m = ri();
        Graph G = new Graph(n);
        for (int i = 0; i < m; ++i) {
            int u = in.nextInt(), v = in.nextInt();
            G.add(u, v);
        }
        out.println(G.count_connected());
        out.flush();
        out.close();
    }

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            return st.nextToken();
        }

        int nextInt() {
            return parseInt(next());
        }

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        long nextLong() {
            return parseLong(next());
        }

        double nextDouble() {
            return parseDouble(next());
        }
    }

    static final int IBIG = 1000000007;
    static final int IMAX = 2147483647;
    static final int IMIN = -2147483648;
    static final long LMAX = 9223372036854775807L;
    static final long LMIN = -9223372036854775808L;

    static int ri() {
        return in.nextInt();
    }

    static double rd() {
        return in.nextDouble();
    }

    static long rl() {
        return in.nextLong();
    }

    static String rs() {
        return in.next();
    }

    static double[] rda(int n) {
        double[] a = new double[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextDouble();
        return a;
    }

    static int[] ria(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextInt();
        return a;
    }

    static long[] rla(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; ++i) a[i] = in.nextLong();
        return a;
    }

    static char[] rca() {
        return in.next().toCharArray();
    }

    static long powmod(long a, long b, long mod) {
        long res = 1;
        while (b > 0) {
            if ((b & 1) != 0) res *= a;
            a *= a;
            res %= mod;
            a %= mod;
            b = b >> 2;
        }
        return res;
    }

    static long powmod(int a, int b, long mod) {
        long res = 1;
        long a_copy = a;
        long b_copy = b;
        while (b_copy > 0) {
            if ((b_copy & 1) != 0) res *= a_copy;
            a_copy *= a_copy;
            res %= mod;
            a_copy %= mod;
            b_copy = b_copy >> 2;
        }
        return res;
    }

    static void pr(int n) {
        out.print(n);
    }

    static void pr(long n) {
        out.print(n);
    }

    static void pr(String n) {
        out.print(n);
    }

    static void pr(char n) {
        out.print(n);
    }

    static void pr(char[] a) {
        out.print(a.toString());
    }

    static void prln(int n) {
        out.println(n);
    }

    static void prln(long n) {
        out.println(n);
    }

    static void prln(String n) {
        out.println(n);
    }

    static void prln(char n) {
        out.println(n);
    }

    static void prln(char[] a) {
        out.println(a.toString());
    }

    static int[] copy(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[i] = a[i];
        }
        return b;
    }

    static long[] copy(long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[i] = a[i];
        }
        return b;
    }

    static char[] copy(char[] a) {
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[i] = a[i];
        }
        return b;
    }

    static int[] reverse(int[] a) {
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }

    static long[] reverse(long[] a) {
        long[] b = new long[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }

    static char[] reverse(char[] a) {
        char[] b = new char[a.length];
        for (int i = 0; i < a.length; ++i) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }
}
