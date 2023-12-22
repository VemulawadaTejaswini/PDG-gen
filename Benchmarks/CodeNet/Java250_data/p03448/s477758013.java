import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author mikit
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC087BCoins solver = new ABC087BCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC087BCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt(), b = in.nextInt(), c = in.nextInt(), x = in.nextInt();
            int ans = 0;
            for (int a0 = 0; a0 <= a; a0++) {
                for (int b0 = 0; b0 <= b; b0++) {
                    for (int c0 = 0; c0 <= c; c0++) {
                        if (500 * a0 + 100 * b0 + 50 * c0 == x) {
                            ans++;
                        }
                    }
                }
            }
            out.println(ans);
        }

    }
}

