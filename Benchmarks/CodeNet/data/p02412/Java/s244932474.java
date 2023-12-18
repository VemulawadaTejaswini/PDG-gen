import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
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
        Howmanyways solver = new Howmanyways();
        solver.solve(1, in, out);
        out.close();
    }

    static class Howmanyways {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            while (true) {
                int n = in.nextInt();
                int x = in.nextInt();
                if (n == 0 && x == 0) return;
                // 1~n
                int res = 0;
                for (int i = 1; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (x - i - j > j && x - i - j <= n) res++;
                    }
                }
                out.println(res);
            }
        }

    }
}


