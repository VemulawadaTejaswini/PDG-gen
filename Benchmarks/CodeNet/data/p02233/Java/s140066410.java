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
        AizuFIbo solver = new AizuFIbo();
        solver.solve(1, in, out);
        out.close();
    }

    static class AizuFIbo {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();

            if (n == 0 || n == 1) {
                out.println("1");
            } else {
                long[] a = new long[n + 1];
                a[0] = 1;
                a[1] = 1;

                for (int i = 2; i <= n; i++) {
                    a[i] = a[i - 1] + a[i - 2];
                }

                out.printf("%d\n", a[n]);
            }
        }

    }
}


