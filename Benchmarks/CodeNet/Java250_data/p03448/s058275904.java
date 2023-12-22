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
        BCoins solver = new BCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class BCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = Integer.parseInt(in.next());
            int b = Integer.parseInt(in.next());
            int c = Integer.parseInt(in.next());
            int x = Integer.parseInt(in.next());

            int aMax = Math.min(x / 500, a);
            int bMax = Math.min(x / 100, b);
            int cMax = Math.min(x / 50, c);

            int count = 0;
            for (int i = 0; i <= aMax; i++) {
                for (int j = 0; j <= bMax; j++) {
                    for (int k = 0; k <= cMax; k++) {
                        if (500 * i + 100 * j + 50 * k == x) {
                            count++;
                        }
                    }
                }
            }
            out.println(count);
        }

    }
}

