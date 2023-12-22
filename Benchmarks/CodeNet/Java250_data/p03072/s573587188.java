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
            int h[] = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = Integer.parseInt(in.next());
            }
            // 最初の旅館は必ず見えるので1
            int ans = 1;

            for (int i = 1; i < n; i++) {
                int cnt = 0;
                for (int j = 0; j <= i - 1; j++) {
                    if (h[i] >= h[j]) ++cnt;
                }
                if (cnt >= i) ans++;
            }
            // 出力
            out.println(ans);

        }

    }
}

