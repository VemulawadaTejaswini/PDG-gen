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
        BMultipleOf9 solver = new BMultipleOf9();
        solver.solve(1, in, out);
        out.close();
    }

    static class BMultipleOf9 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String n = in.next();
            int ans = 0;

            long keta = 0;
            for (int i = 0; i < n.length(); i++) {
                keta += n.charAt(i) - '0';
            }

            // 出力
            if (keta % 9 == 0) {
                out.println("Yes");
            } else {
                out.println("No");

            }

        }

    }
}

