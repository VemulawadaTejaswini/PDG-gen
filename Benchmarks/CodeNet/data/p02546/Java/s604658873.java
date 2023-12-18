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
        APluralForm solver = new APluralForm();
        solver.solve(1, in, out);
        out.close();
    }

    static class APluralForm {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            String S = in.next();

            // 出力
            if (S.charAt(S.length() - 1) == 's') {
                out.println(S + "es");

            } else {
                out.println(S + "s");

            }

        }

    }
}

