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
            if (S.charAt(S.length() - 1) == '3') {
                out.println("bon");
            } else if (S.charAt(S.length() - 1) == '0' || S.charAt(S.length() - 1) == '1' || S.charAt(S.length() - 1) == '6' || S.charAt(S.length() - 1) == '8') {
                out.println("pon");

            } else {
                out.println("hon");

            }

        }

    }
}

