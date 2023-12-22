import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
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
        ABC083BSomeSums solver = new ABC083BSomeSums();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC083BSomeSums {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = Integer.parseInt(in.next());
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int ans = 0;

            for (int i = 1; i <= n; i++) {
                int sum = someDigits(i);
                if (sum >= a && sum <= b) {
                    ans += i;
                }
            }
            System.out.println(String.valueOf(ans));
        }

        private int someDigits(int i) {
            int sum = 0;
            while (i > 0) {
                sum += i % 10;
                i /= 10;
            }
            return sum;
        }

    }
}

