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
            int h1 = Integer.parseInt(in.next());
            int m1 = Integer.parseInt(in.next());
            int h2 = Integer.parseInt(in.next());
            int m2 = Integer.parseInt(in.next());
            int k = Integer.parseInt(in.next());
            int ans = 0;

            int diffh = h2 - h1;
            int diffm = m2 - m1;

            ans = diffh * 60 + diffm - k;
            out.println(ans);

        }

    }
}

