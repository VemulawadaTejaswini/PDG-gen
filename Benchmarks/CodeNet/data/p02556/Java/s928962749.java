import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = in.i();
            y[i] = in.i();
        }
        HashSet<Integer> hs = new HashSet<>();

        f(hs, x, y, (i, j) ->  i + j);
        f(hs, x, y, (i, j) ->  i - j);
        f(hs, x, y, (i, j) ->  -i + j);
        f(hs, x, y, (i, j) ->  -i - j);
        ArrayList<Integer> list = new ArrayList<>(hs);
        int n = list.size();

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int xi = x[list.get(i)];
                int yi = y[list.get(i)];
                int xj = x[list.get(j)];
                int yj = y[list.get(j)];
                int d = Math.abs(xi - xj) + Math.abs(yi - yj);
                if (ans < d) {
                    ans = d;
                }
            }
        }

        out.println(ans);
    }

    static void f(HashSet<Integer> hs, int[] x, int[] y, BinOp op) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int k = 0;
        int l = 0;
        for (int i = 0; i < x.length; i++) {
            int t = op.op(x[i], y[i]);
            if (t < min) {
                min = t;
                k = i;
            }
            if (max < t) {
                max = t;
                l = i;
            }
        }
        hs.add(k);
        hs.add(l);
    }
}

interface BinOp {
    int op(int x, int y);
}

class MyReader extends BufferedReader {
    char[] cbuf = new char[1024];
    int head = 0;
    int tail = 0;

    MyReader() {
        super(new InputStreamReader(System.in));
    }

    char next() {
        if (head == tail) {
            try {
                tail = super.read(cbuf, 0, cbuf.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            head = 0;
        }
        return cbuf[head++];
    }

    void back() {
        head--;
    }

    boolean minus() {
        boolean minus;
        while (true) {
            char c = next();
            if (!isDelimiter(c)) {
                if (!(minus = c == '-')) back();
                return minus;
            }
        }
    }

    void skip() {
        while (isDelimiter(next()));
        back();
    }

    char[] s(int N) {
        char[] cbuf = new char[N];
        read(cbuf, 0, N);
        return cbuf;
    }

    public int read(char[] cbuf, int off, int len) {
        skip();
        int i;
        for (i = 0; i < cbuf.length; i++) {
            char c = next();
            if (isDelimiter(c)) {
                break;
            }
            cbuf[i] = c;
        }
        return i;
    }

    boolean isDelimiter(char c) {
        return c == ' ' || c == '\n' || c == '\r';
    }

    int i() {
        boolean minus = minus();
        int n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }

    int[] ii(final int N) {
        int[] a = new int[N];
        for (int j = 0; j < a.length; j++) a[j] = i();
        return a;
    }

    long l() {
        boolean minus = minus();
        long n = 0;
        while (true) {
            int k = next() - '0';
            if (k < 0 || 9 < k) break;
            n = 10 * n + k;
        }
        return minus ? -n : n;
    }
}
