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
            long x = Long.parseLong(in.next());
            long k = Long.parseLong(in.next());
            long d = Long.parseLong(in.next());
            long ans = 0;
            x = Math.abs(x);

            if (x >= k * d) {
                ans = x - k * d;
            } else {
                long cnt = x / d;
                long tmp = x - cnt * d;
                long tmp2 = (k - cnt) % 2;
                ans = Math.abs(tmp - tmp2 * d);
            }

            // 出力
            out.println(ans);

        }

    }
}

