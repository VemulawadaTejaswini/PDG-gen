import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    static final int M = 1_000_000_007;

    public static void main(String[] args) {
        int N = in.i();
        int K = in.i();
        int[] plus = new int[N];
        int[] minus = new int[N];
        int p = 0;
        int m = 0;
        for (int i = 0; i < N; i++) {
            int a = in.i();
            if (a >= 0) {
                plus[p++] = a;
            } else if (a < 0) {
                minus[m++] = -a;
            }
        }
        Arrays.parallelSort(plus, 0, p);
        Arrays.parallelSort(minus, 0, m);
        int[] d = new int[K];
        int pf = -1;
        int mf = -1;
        int pi = p - 1;
        int mi = m - 1;
        for (int i = 0; i < K; i++) {
            if (pi == -1) {
                mf = i;
                d[mf] = -minus[mi--];
            } else if (mi == -1) {
                pf = i;
                d[pf] = plus[pi--];
            } else if (plus[pi] < minus[mi]) {
                mf = i;
                d[mf] = -minus[mi--];
            } else {
                pf = i;
                d[pf] = plus[pi--];
            }
        }

        if ((m - mi) % 2 == 0) {
            boolean b1 = pf > -1 && mi > -1;
            boolean b2 = mf > -1 && pi > -1;
            if (b1 && b2) {
                if ((long)d[pf] * plus[pi] < (long)(-d[mf]) * minus[mi]) {
                    d[pf] = -minus[mi];
                } else {
                    d[mf] = plus[pi];
                }
            } else if (b1) {
                d[pf] = -minus[mi];
            } else if (b2) {
                d[mf] = plus[pi];
            } else {
                pi = 0;
                mi = 0;
                for (int i = 0; i < K; i++) {
                    if (pi == p) {
                        d[i] = -minus[mi++];
                    } else if (mi == m) {
                        d[i] = plus[pi++];
                    } else if (plus[pi] < minus[mi]) {
                        d[i] = plus[pi++];
                    } else {
                        d[i] = -minus[mi++];
                    }
                }
            }
        }

        long ans = 1;
        for (int i = 0; i < K; i++) {
            ans = ans * d[i] % M;
        }
        ans = (ans + M) % M;

        out.println(ans);
    }
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
