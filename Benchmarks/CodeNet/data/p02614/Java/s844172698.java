import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        final int H = in.i();
        final int W = in.i();
        final int K = in.i();
        char[][] c = new char[H][];
        int k = 0;
        for (int i = 0; i < c.length; i++) {
            char[] d = in.s(W);
            for (int j = 0; j < d.length; j++) {
                if (d[j] == '#') {
                    k++;
                }
            }
            c[i] = d;
        }
        int ans = 0;
        for (int i = 0; i < 1 << H; i++) {
            for (int j = 0; j < 1 << W; j++) {
                int black = k;
                for (int h = 0; h < H; h++) {
                    boolean b = (i >> h & 1) == 1;
                    char[] d = c[h];
                    for (int w = 0; w < W; w++) {
                        if ((b || (j >> w & 1) == 1) && d[w] == '#') {
                            black--;
                        }
                    }
                }
                if (black == K) {
                    ans++;
                }
            }
        }
        out.println(ans);
    }

    static class MyReader extends BufferedReader {
        char[] cbuf = new char[1024];
        int head = 0;
        int tail = 0;

        MyReader() {
            super(new InputStreamReader(System.in));
        }

        char next() {
            if (head == tail) {
                try {
                    tail = read(cbuf, 0, cbuf.length);
                } catch (IOException e) {}
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
                if (c != ' ' && c != '\n' && c != '\r') {
                    if (!(minus = c == '-')) back();
                    return minus;
                }
            }
        }

        void skip() {
            while (true) {
                char c = next();
                if (c != ' ' && c != '\n' && c != '\r') {
                    back();
                    break;
                }
            }
        }

        char[] s(final int N) {
            skip();
            char[] s = new char[N];
            for (int i = 0; i < s.length; i++) {
                s[i] = next();
            }
            return s;
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
}
