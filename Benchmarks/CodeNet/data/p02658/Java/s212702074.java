import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

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
        Multiplication2 solver = new Multiplication2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Multiplication2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int num = in.nextInt();
            long ans = 1;

            long border = pow(10, 18);
            List<Long> lists = new ArrayList<>();

            for (int i = 0; i < num; i++) {
                long a = in.nextLong();
                lists.add(a);
            }
            if (lists.contains(0L)) {
                out.append("0\n");
                return;
            }
            for (Long a : lists) {
                if (a > border || a < 0) {
                    out.append("-1\n");
                    return;

                }
                ans *= a;

                if (ans > border || ans < 0) {
                    out.append("-1\n");
                    return;
                }
            }
            out.append(String.valueOf(ans));
        }

        static long pow(long x, long n) {

            if (n == 0) {
                return 1;
            }
            long result = pow(x, n / 2);

            if (n % 2 == 0) {
                return (result * result);
            }
            return ((result * result)) * x;
        }

    }
}

