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

            if (x / d >= k) {
                ans = x - k * d;
            } else {
                long k2 = x / d;
                long x2 = x - k2 * d;
                long k3 = k - k2;
                k3 %= 2;
                x2 -= k3 * d;
                ans = Math.abs(x2);
            }
            // 出力
            out.println(ans);

        }

    }
}

