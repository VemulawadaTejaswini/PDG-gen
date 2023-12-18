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
        int[][] load = new int[N][N];
        int[] index = new int[N];
        int[] ans = new int[N];
        ans[0] = 1;
        int count = 0;
        for (int i = 0; i < M; i++) {
            int A = scanInt();
            int B = scanInt();
            load[A-1][index[A-1]] = B;
            load[B-1][index[B-1]] = A;
            index[A-1]++;
            index[B-1]++;
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < index[i]; j++) {
                int tmp = load[i][j];
                if (ans[tmp-1] == 0) {
                    ans[tmp-1] = i+1;
                    count++;
                }
                if (count == N - 1) {
                    break;
                }
            }
            if (count == N - 1) {
                break;
            }
        }

        if (count == N - 1) {
            System.out.println("Yes");
            for (int i = 1; i < N; i++) {
                System.out.println(ans[i]);
            }
        } else {
            System.out.println("No");
        }

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