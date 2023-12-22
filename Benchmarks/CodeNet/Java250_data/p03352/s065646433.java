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
        ABC097_B solver = new ABC097_B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC097_B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int x = in.nextInt();

            int ans = 1;
            for (int i = 2; i <= x; i++) {
                int p = 2;
                while (Math.pow(i, p) <= x) {
                    ans = (int) Math.max(ans, Math.pow(i, p));
                    p++;
                }
            }

            out.print(ans);
        }

    }
}

