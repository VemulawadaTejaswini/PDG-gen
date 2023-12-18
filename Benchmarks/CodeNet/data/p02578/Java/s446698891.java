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
        CStep solver = new CStep();
        solver.solve(1, in, out);
        out.close();
    }

    static class CStep {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in.next());
            }
            long ans = 0;
            for (int i = 1; i < n; i++) {
                if (a[i - 1] - a[i] > 0) {
                    ans += a[i - 1] - a[i];
                    a[i] += a[i - 1] - a[i];
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

