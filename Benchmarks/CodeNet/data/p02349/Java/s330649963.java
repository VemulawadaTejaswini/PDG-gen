import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
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
    static final int[] da = {-1, 0, 1, 0, -1, 1, 1, -1, -1};

    void solve() {
        int n = in.nextInt();
        int q = in.nextInt();
        Bit bit = new Bit(n);
        for (int i = 0; i < q; i++) {
            int t = in.nextInt();
            if (t == 0) {
                int l = in.nextInt() - 1;
                int r = in.nextInt();
                long x = in.nextLong();
                bit.add(l, r, x);
            } else {
                int j = in.nextInt() - 1;
                out.println(bit.get(j));
            }
        }
    }

    public static void main(String[]$) {
        new Main().solve();
        out.flush();
    }
}

class Bit {
    private int n;
    private long[] bit1;
    private long[] bit2;

    Bit(int n) {
        this.n = n;
        this.bit1 = new long[n];
        this.bit2 = new long[n];
    }

    Bit(long[] a) {
        this(a.length);
        for (int i = 0; i < n; i++) {
            add(i, a[i]);
        }
    }

    private void add(long[] table, int i, long x) {
        for (i++; i <= n; i += i & -i) {
            table[i - 1] += x;
        }
    }

    private long getSum(long[] table, int i) {
        long sum = 0;
        for (; i > 0; i -= i & -i) {
            sum += table[i - 1];
        }
        return sum;
    }

    private long getSum(int i) {
        return getSum(bit1, i) + getSum(bit2, i) * i;
    }

    void add(int i, long x) {
        add(i, i + 1, x);
    }

    void add(int l, int r, long x) {
        add(bit1, l, -l * x);
        add(bit1, r, r * x);
        add(bit2, l, x);
        add(bit2, r, -x);
    }

    void set(int i, long x) {
        add(i, x - get(i));
    }

    long get(int i) {
        return getSum(i + 1) - getSum(i);
    }

    long getSum(int l, int r) {
        return l >= r ? 0 : getSum(r) - getSum(l);
    }

    long[] getAll() {
        long[] res = new long[n];
        for (int i = 0; i < n; i++) {
            res[i] = get(i);
        }
        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(getAll());
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

    char[][] nextCharArray(int n, int m) {
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

