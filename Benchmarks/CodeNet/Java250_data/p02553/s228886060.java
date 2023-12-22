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
        BProductMax solver = new BProductMax();
        solver.solve(1, in, out);
        out.close();
    }

    static class BProductMax {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int d = Integer.parseInt(in.next());
            long ans = 0;

            if (b <= 0 && d <= 0) {
                ans = (long) a * (long) c;
            } else if (a >= 0 && c >= 0) {
                ans = (long) b * (long) d;
            } else if ((a < 0 && b <= 0 && c < 0 && d <= 0) || (a < 0 && b < 0 && c < 0 && d > 0)) {
                ans = (long) a * (long) c;
            } else if ((a >= 0 && b > 0 && c >= 0 && d > 0) || (a > 0 && b > 0 && c < 0 && d > 0)) {
                ans = (long) b * (long) d;
            } else if (a < 0 && b > 0 && c < 0 && d > 0) {
                ans = Math.max((long) b * (long) d, (long) a * (long) c);
            } else if (a < 0 && b > 0 && c > 0 && d > 0) {
                ans = (long) b * (long) d;
            } else if (a < 0 && b < 0 && c > 0 && d > 0) {
                ans = (long) b * (long) c;
            } else if (a > 0 && b > 0 && c < 0 && d < 0) {
                ans = (long) a * (long) d;
            } else if (a < 0 && b > 0 && c < 0 && d < 0) {
                ans = (long) a * (long) c;
            } else if (b <= 0 && c >= 0) {
                ans = (long) b * (long) c;
            } else if (a >= 0 && d <= 0) {
                ans = (long) a * (long) d;
            }

            // 出力
            out.println(ans);

        }

    }
}

