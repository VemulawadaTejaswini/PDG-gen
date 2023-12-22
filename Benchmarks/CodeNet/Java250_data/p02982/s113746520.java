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
        B solver = new B();
        solver.solve(1, in, out);
        out.close();
    }

    static class B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int d = Integer.parseInt(in.next());
            int x[][] = new int[n][d];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < d; j++) {
                    x[i][j] = Integer.parseInt(in.next());
                }
            }
            int ans = 0;
            int s = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = 0; k < d; k++) {
                        s += Math.pow(x[i][k] - x[j][k], 2);
                    }
                    int a = (int) Math.sqrt(s);
                    if (s == a * a) ans++;
                    s = 0;
                }
            }

            // 出力
            out.println(ans);

        }

    }
}

