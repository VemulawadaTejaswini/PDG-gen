import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
            int n = Integer.parseInt(in.next());
            int d[] = new int[n];
            for (int i = 0; i < n; i++) {
                d[i] = Integer.parseInt(in.next());
            }
            Arrays.sort(d);
            int mid = n / 2;
            if (d[mid] - d[mid - 1] == 0) {
                out.println(0);
            } else {
                // 出力
                out.println(d[mid] - d[mid - 1]);
            }

        }

    }
}

