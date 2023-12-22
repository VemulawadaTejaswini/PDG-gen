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
        ABC087BCoins solver = new ABC087BCoins();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC087BCoins {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int x = in.nextInt();
            int ans = 0;

            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++) {
                    for (int k = 0; k <= c; k++) {
                        int total = (500 * i) + (100 * j) + (50 * k);
                        if (total == x) ans++;
                    }
                }
            }
            System.out.println(String.valueOf(ans));
        }

    }
}

