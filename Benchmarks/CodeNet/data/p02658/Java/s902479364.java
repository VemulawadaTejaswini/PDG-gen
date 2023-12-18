import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BMultiplication2 solver = new BMultiplication2();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMultiplication2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            long[] num = new long[n];
            for (int i = 0; i < n; i++) {
                num[i] = in.nextLong();
            }
            Arrays.sort(num);
            if (num[0] == 0) {
                out.println(0);
                return;
            }

            long ans = 1;
            for (int i = 0; i < n; i++) {
                if (1000000000000000000L / ans < num[i]) {
                    out.println(-1);
                    return;
                }
                ans *= num[i];
                if (ans > 1000000000000000000L || ans < 0) {
                    out.println(-1);
                    return;
                }
            }
            out.println(ans);
        }

    }
}

