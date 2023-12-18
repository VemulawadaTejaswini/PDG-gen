import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Arrays;
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
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(in.next());
            }
            Arrays.sort(a);
            BigDecimal ans = new BigDecimal(String.valueOf(a[0]));
            for (int i = 1; i < n; i++) {
                if (a[i] == 0) {
                    ans = BigDecimal.ZERO;
                    break;
                }
                BigDecimal b = new BigDecimal(String.valueOf(a[i]));
                ans = ans.multiply(b);
                if (ans.compareTo(BigDecimal.valueOf(1000000000000000000L)) > 0) {
                    ans = new BigDecimal(-1);
                    break;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

