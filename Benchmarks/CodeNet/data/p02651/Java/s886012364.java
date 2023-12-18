import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        agc045_a solver = new agc045_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class agc045_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int T = in.nextInt();

            for (int i = 0; i < T; i++) {
                loopN(i, in, out);
            }
        }

        private void loopN(int i, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            long A[] = new long[N];
            for (int j = 0; j < N; j++) {
                A[j] = in.nextLong();
            }
            String S[] = in.next().split("");
            //int X = dfs(A, S, 0, ans,N);
            long X = 0;
            for (int j = 0; j < N; j++) {
                long ans = X ^ A[j];
                if (S[j].compareTo("0") == 0) {
                    if (ans == 0) {
                        X = ans;
                    }
                } else {
                    if (ans != 0) {
                        X = ans;
                    }
                }
            }
            if (X == 0) {
                out.println(0);
            } else {
                out.println(1);
            }
        }

    }
}

