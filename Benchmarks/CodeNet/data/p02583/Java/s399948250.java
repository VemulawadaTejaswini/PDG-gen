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
            int[] l = new int[n];
            for (int i = 0; i < n; i++) {
                l[i] = Integer.parseInt(in.next());
            }
            int ans = 0;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (kumi(l[i], l[j], l[k]) && len(l[i], l[j], l[k])) ans++;
                    }

                }
            }

            // 出力
            out.println(ans);

        }

        boolean kumi(int a, int b, int c) {
            if (a != b && b != c && c != a) return true;
            else return false;

        }

        boolean len(int a, int b, int c) {
            if (a < b + c && b < c + a && c < a + b) return true;
            else return false;

        }

    }
}

