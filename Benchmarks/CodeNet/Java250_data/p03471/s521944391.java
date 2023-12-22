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
        ABC085C solver = new ABC085C();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC085C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 整数の入力
            int n = Integer.parseInt(in.next());
            int y = Integer.parseInt(in.next());
            int total = 0;
            int k = 0;
            int ans10000 = -1;
            int ans5000 = -1;
            int ans1000 = -1;

            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    k = n - i - j;
                    total = 10000 * i + 5000 * j + 1000 * k;
                    if (total == y) {
                        out.println(String.valueOf(i) + " " + String.valueOf(j) + " " + String.valueOf(k));
                        return;
                    }
                }
            }

            // 出力
            out.println(String.valueOf(ans10000) + " " + String.valueOf(ans5000) + " " + String.valueOf(ans1000));

        }

    }
}

