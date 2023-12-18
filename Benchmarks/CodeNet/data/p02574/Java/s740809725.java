import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args) {
        int N = in.i();
        int[] A = in.ii(N);
        String ans = solve(N, A);
        out.println(ans);
    }

    static String solve(int N, int[] A) {
        if (gcd(A) > 1) {
            return "not coprime";
        } else {
            int[] p = new int[1000001];
            for (int i = 2; i < p.length; i++) {
                if (p[i] > 0) continue;
                for (int j = i; j < p.length; j += i) {
                    p[j] = i;
                }
            }
            boolean[] found = new boolean[1000001];
            for (int i = 0; i < N; i++) {
                int a = A[i];
                while (a > 1) {
                    int q = p[a];
                    if (found[q]) {
                        return "setwise coprime";
                    }
                    while (a % q == 0) {
                        a /= q;
                    }
                    found[q] = true;
                }
            }
            return "pairwise coprime";
        }
    }

    static int gcd(int a, int b) {
        int r;
        while ((r = a % b) != 0) {
            a = b;
            b = r;
        }
        return b;
    }

    static int gcd(int... a) {
        int g = a[0];
        for(int i = 1; i < a.length; i++){
            g = gcd(g, a[i]);
        }
        return g;
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
