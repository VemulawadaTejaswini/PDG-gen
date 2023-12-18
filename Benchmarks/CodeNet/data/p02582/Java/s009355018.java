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
        A solver = new A();
        solver.solve(1, in, out);
        out.close();
    }

    static class A {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();
            int ans = 0;

            // 出力
            if (S.charAt(0) == 'R' && S.charAt(1) == 'R' && S.charAt(2) == 'R') {
                ans = 3;
            } else if (S.charAt(0) == 'R' && S.charAt(1) == 'R') {
                ans = 2;
            } else if (S.charAt(1) == 'R' && S.charAt(2) == 'R') {
                ans = 2;
            } else if (S.charAt(0) == 'R' || S.charAt(1) == 'R' || S.charAt(2) == 'R') {
                ans = 1;
            }


            out.println(ans);

        }

    }
}

