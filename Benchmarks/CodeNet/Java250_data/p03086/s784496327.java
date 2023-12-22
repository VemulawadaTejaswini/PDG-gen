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
            String S = in.next();

            int cnt = 0;
            int ans = 0;
            for (int i = 0; i < S.length(); i++) {
                cnt = 0;
                for (int j = i; j < S.length(); j++) {
                    if ('A' == S.charAt(j) || 'C' == S.charAt(j) || 'G' == S.charAt(j) || 'T' == S.charAt(j)) {
                        cnt++;
                    } else {
                        break;
                    }
                    ans = Math.max(ans, cnt);
                }
            }
            out.println(ans);
        }

    }
}

