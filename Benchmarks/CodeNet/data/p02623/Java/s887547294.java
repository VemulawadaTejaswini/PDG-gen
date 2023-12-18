import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.System.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

    static void solve() throws Exception {
        int N = scanInt(), M = scanInt();
        long K = scanLong();
        long[] A = new long[N];
        long[] B = new long[M];

        for (int i = 0; i < N; i++) {
            A[i] = scanLong();
        }

        for (int i = 0; i < M; i++) {
            B[i] = scanLong();
        }

        int ans = 0;
        long sum = 0;
        int j = 0, k = 0;

        for (int i = 0; i < N + M; i++) {
            if (j >= N) {
                if (B[k] + sum <= K) {
                    sum += B[k];
                    ans++;
                    k++;
                }
                continue;
            }

            if (k >= M) {
                if (A[j] + sum <= K) {
                    sum += A[j];
                    ans++;
                    j++;
                }
                continue;
            }

            if (A[j] < B[k]) {
                if (A[j] + sum <= K) {
                    sum += A[j];
                    ans++;
                    j++;
                }
                continue;
            } else {
                if (B[k] + sum <= K) {
                    sum += B[k];
                    ans++;
                    k++;
                }
                continue;
            }
        }

        out.print(ans);
    }

    static int scanInt() throws IOException {
        return parseInt(scanString());
    }

    static long scanLong() throws IOException {
        return parseLong(scanString());
    }

    static String scanString() throws IOException {
        while (tok == null || !tok.hasMoreTokens()) {
            tok = new StringTokenizer(in.readLine());
        }
        return tok.nextToken();
    }

    static BufferedReader in;
    static PrintWriter out;
    static StringTokenizer tok;

    public static void main(String[] args) {
        try {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
            solve();
            in.close();
            out.close();
        }
        catch (Throwable e) {
            e.printStackTrace();
            exit(1);
        }
    }
}