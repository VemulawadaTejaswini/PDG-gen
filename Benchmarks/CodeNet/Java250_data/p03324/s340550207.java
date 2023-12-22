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
        ABC100_B solver = new ABC100_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC100_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int d = in.nextInt();
            int n = in.nextInt();

            if (d == 0) {
                if (n == 100) {
                    out.print(101);
                    return;
                }
                out.print(n);
                return;
            }

            if (n == 100) {
                out.print((int) Math.pow(100, d) * 101);
                return;
            }
            out.print((int) Math.pow(100, d) * n);
        }

    }
}

