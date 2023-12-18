import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author CompuWare
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        DDivGame solver = new DDivGame();
        solver.solve(1, in, out);
        out.close();
    }

    static class DDivGame {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            long x = in.nextLong();
            int count = 0;
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    int c = 0;
                    while (x % i == 0) {
                        x /= i;
                        c++;
                    }
                    count += sol(c);
                }
            }
            if (x > 1)
                count++;
            System.out.println(count);
        }

        private static int sol(int i) {
            int sum = 0;
            int c = 0;
            for (int j = 1; ; j++) {
                if (sum + j > i) {
                    break;
                }
                sum += j;
                c++;
            }
            return c;
        }

    }
}

