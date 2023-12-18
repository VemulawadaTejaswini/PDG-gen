import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.StringTokenizer;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class Main {
    static In in = new In();
    static Out out = new Out();
    static final long mod = 1000000007;
    static final long inf = 0x1fffffffffffffffL;
    static final int iinf = 0x3fffffff;

    int n;
    int[] y;
    long[] value;
    void solve() {
        n = in.nextInt();
        char[] x = in.nextCharArray();
        y = new int[n];
        value = new long[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            y[i] = x[i] == '1' ? 1 : 0;
            if (y[i] == 1) {
                count++;
            }
        }
        f(count);
        if (count >= 2) {
            g(count);
        }
        for (int i = 0; i < n; i++) {
            if (count == 1 && y[i] == 1) {
                out.println(0);
            } else {
                out.println(naive(value[i]));
            }
        }
    }

    long naive(long x) {
        int count = 1;
        while (x > 0) {
            x = x % Long.bitCount(x);
            count++;
        }
        return count;
    }

    void f(int mod) {
        mod++;
        long k = 0;
        for (int i = 0; i < n; i++) {
            k = k * 2 + y[i];
            k = k % mod;
        }
        long a = 1;
        for (int i = 0; i < n; i++) {
            if (y[n - 1 - i] == 0) {
                long v = (k + a) % mod;
                value[n - 1 - i] = v;
            }
            a = a * 2 % mod;
        }
    }

    void g(int mod) {
        mod--;
        long k = 0;
        for (int i = 0; i < n; i++) {
            k = k * 2 + y[i];
            k = k % mod;
        }
        long a = 1;
        for (int i = 0; i < n; i++) {
            if (y[n - 1 - i] == 1) {
                long v = (k + mod - a) % mod;
                value[n - 1 - i] = v;
            }
            a = a * 2 % mod;
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class In {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 0x10000);
    private StringTokenizer tokenizer;

    String next() {
        try {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                tokenizer = new StringTokenizer(reader.readLine());
            }
        } catch (IOException ignored) {
        }
        return tokenizer.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    char[] nextCharArray() {
        return next().toCharArray();
    }

    char[][] nextCharGrid(int n, int m) {
        char[][] a = new char[n][m];
        for (int i = 0; i < n; i++) {
            a[i] = next().toCharArray();
        }
        return a;
    }

    int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
        }
        return a;
    }

    int[] nextIntArray(int n, IntUnaryOperator op) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsInt(nextInt());
        }
        return a;
    }

    long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = nextLong();
        }
        return a;
    }

    long[] nextLongArray(int n, LongUnaryOperator op) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = op.applyAsLong(nextLong());
        }
        return a;
    }
    
    List<List<Integer>> nextEdges(int n, int m) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            res.add(new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            int u = nextInt() - 1;
            int v = nextInt() - 1;
            res.get(u).add(v);
            res.get(v).add(u);
        }
        return res;
    }
}

class Out {
    private PrintWriter out = new PrintWriter(System.out);
    boolean autoFlush = false;

    void println(Object... a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (Object obj : a) {
            joiner.add(String.valueOf(obj));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(char[] s) {
        out.println(String.valueOf(s));
        if (autoFlush) {
            out.flush();
        }
    }

    void println(int[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (int i : a) {
            joiner.add(Integer.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void println(long[] a) {
        StringJoiner joiner = new StringJoiner(" ");
        for (long i : a) {
            joiner.add(Long.toString(i));
        }
        out.println(joiner);
        if (autoFlush) {
            out.flush();
        }
    }

    void flush() {
        out.flush();
    }
}
