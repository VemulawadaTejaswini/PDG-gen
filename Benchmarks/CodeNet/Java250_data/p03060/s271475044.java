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
            int v[] = new int[n];
            int c[] = new int[n];
            for (int i = 0; i < n; i++) {
                v[i] = Integer.parseInt(in.next());
            }
            for (int i = 0; i < n; i++) {
                c[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                if (v[i] > c[i]) {
                    ans += v[i] - c[i];
                }
            }

            out.println(ans);
        }

    }
}

