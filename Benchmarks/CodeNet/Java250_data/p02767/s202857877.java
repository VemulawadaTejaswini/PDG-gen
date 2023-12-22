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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            double l = 0;
            int x[] = new int[n];
            for (int i = 0; i < n; i++) {
                x[i] = Integer.parseInt(in.next());
                l += x[i];
            }
            if (l % n != 0) {
                l = Math.round(l / n);
            } else {
                l /= n;
            }
            long ans = 0;
            for (int i = 0; i < n; i++) {
                //ans += (long) Math.pow(Math.abs(l-x[i]),2);
                ans += Math.abs(l - x[i]) * Math.abs(l - x[i]);
            }

            // 出力
            out.println(ans);

        }

    }
}

