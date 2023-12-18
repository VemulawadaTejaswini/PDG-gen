import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Main {
    static MyReader in = new MyReader();

    public static void main(String[] args){
        int R = in.i();
        int C = in.i();
        int K = in.i();
        int[][] v = new int[R][C];        
        for (int i = 0; i < K; i++) {
            int r = in.i() - 1;
            int c = in.i() - 1;
            v[r][c] = in.i();
        }
        
        long[][][] dp = new long[R + 1][C + 1][4];
        for (int i = R - 1; i >= 0; i--) {
            for (int j = C - 1; j >= 0; j--) {
                dp[i][j][0] = max(dp[i + 1][j][3], dp[i][j + 1][0]);
                for (int k = 1; k < 4; k++) {
                    dp[i][j][k] = max(dp[i][j + 1][k], dp[i][j][k - 1]);
                }

                if (v[i][j] > 0) {
                    for (int k = 1; k < 4; k++) {
                        dp[i][j][k] = max(dp[i][j][k], v[i][j] + max(dp[i][j + 1][k - 1], dp[i + 1][j][3]));
                        dp[i][j][k] = max(dp[i][j][k], dp[i][j][k - 1]);
                    }
                } 

            }
        }
        long ans = dp[0][0][3];
        out.println(ans);
    }

    static long max(long a, long b) {
        return a < b ? b : a;
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
