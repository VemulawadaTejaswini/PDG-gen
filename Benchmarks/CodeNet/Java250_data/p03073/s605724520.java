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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();

            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < S.length(); i++) {
                sb1.append(0);
                sb1.append(1);
            }
            sb1.substring(0, S.length());
            for (int i = 0; i < S.length(); i++) {
                sb2.append(1);
                sb2.append(0);
            }
            sb2.substring(0, S.length());

            long cnt1 = 0;
            long cnt2 = 0;
            for (int i = 0; i < S.length(); i++) {
                if (S.charAt(i) != sb1.charAt(i)) cnt1++;
                if (S.charAt(i) != sb2.charAt(i)) cnt2++;
            }

            out.println(Math.min(cnt1, cnt2));
        }

    }
}

