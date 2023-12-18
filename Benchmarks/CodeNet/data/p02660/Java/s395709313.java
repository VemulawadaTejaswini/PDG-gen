import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main{
    static MyReader in = new MyReader();

    public static void main(String[] args){
        long n = in.l();
        int M = (int)Math.sqrt(n) + 1;
        int ans = 0;
        if (n > 1) {
            for (int i = 2; i < M; i++) {
                int j = 0;
                while (n % i == 0) {
                    n /= i;
                    j++;
                }
                ans += f(j);
            }
            ans = ans == 0 ? 1 : ans;
        }
        out.println(ans);
    }

    static int f(int j) {
        int k = (int)((-1 + Math.sqrt(1 + 8 * j)) / 2);
        while ((k + 1) * (k + 2) / 2 <= j) {
            k++;
        }
        return k;
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
