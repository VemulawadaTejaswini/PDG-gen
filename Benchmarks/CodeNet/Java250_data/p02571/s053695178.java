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
        BSubstring solver = new BSubstring();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSubstring {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();
            String T = in.next();
            int match_cnt = 0;
            int ans = 0;
            for (int i = 0; i <= S.length() - T.length(); i++) {
                String tmp = S.substring(i, i + T.length());
                match_cnt = Math.max(match_cnt, cnt(tmp, T));
            }
            ans = T.length() - match_cnt;
            // 出力
            out.println(ans);

        }

        int cnt(String S, String T) {
            int res = 0;
            for (int i = 0; i < T.length(); i++) {
                if (S.charAt(i) == T.charAt(i)) res++;
            }
            return res;
        }

    }
}

