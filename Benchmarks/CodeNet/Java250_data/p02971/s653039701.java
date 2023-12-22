import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

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
            Integer a[] = new Integer[n];
            Integer b[] = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(in.next());
                b[i] = a[i];
            }

            Arrays.sort(b, Comparator.reverseOrder());

            for (int i = 0; i < n; i++) {
                if (a[i] == b[0]) {
                    out.println(b[1]);
                } else {
                    out.println(b[0]);
                }
            }

        }

    }
}

