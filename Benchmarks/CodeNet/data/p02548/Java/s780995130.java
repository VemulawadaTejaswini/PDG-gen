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
        CAXBC solver = new CAXBC();
        solver.solve(1, in, out);
        out.close();
    }

    static class CAXBC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int n = Integer.parseInt(in.next());
            int ans = 0;
            for (int a = 1; a < n; a++) {
                for (int b = 1; b < n; b++) {
                    int c = n - a * b;
                    if (c <= 0) break;
                    ans++;
                }
            }
            // 出力
            out.println(ans);

        }

    }
}

