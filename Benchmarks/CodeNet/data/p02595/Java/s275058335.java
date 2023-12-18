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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            Long d = Long.parseLong(in.next());
            long[] x = new long[n];
            long[] y = new long[n];
            for (int i = 0; i < n; i++) {
                x[i] = Long.parseLong(in.next());
                y[i] = Long.parseLong(in.next());
            }
            int ans = 0;
            double distance = 0;
            for (int i = 0; i < n; i++) {
                distance = Math.sqrt((x[i] * x[i]) + (y[i] * y[i]));
//            out.println(distance);
                if (distance <= (double) d) ans++;
            }
            // 出力
            out.println(ans);

        }

    }
}

