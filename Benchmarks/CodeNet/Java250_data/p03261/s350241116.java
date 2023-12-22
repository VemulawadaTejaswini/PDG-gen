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
            String w[] = new String[n];
            for (int i = 0; i < n; i++) {
                w[i] = in.next();
            }
            int ans = 0;

            for (int i = 1; i < n; i++) {
                if (w[i - 1].charAt(w[i - 1].length() - 1) != w[i].charAt(0)) {
                    out.print("No");
                    return;
                }
                if (isExist(i, w)) {
                    out.print("No");
                    return;
                }
            }

            // 出力
            out.println("Yes");

        }

        private static boolean isExist(int n, String s[]) {
            for (int i = 0; i < n; i++) {
                if (s[i].equals(s[n])) {
                    return true;
                }
            }
            return false;
        }

    }
}

