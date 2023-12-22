import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author teiwa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int a[] = new int[n + 1];
            int b[] = new int[n];
            for (int i = 0; i < n + 1; i++) {
                a[i] = in.nextInt();
            }
            for (int i = 0; i < n; i++) {
                b[i] = in.nextInt();
            }
            long answer = 0;
            for (int i = n - 1; i >= 0; i--) {
                if (b[i] >= a[i + 1]) {
                    answer += a[i + 1];
                    b[i] -= a[i + 1];
                    if (b[i] <= a[i]) {
                        a[i] -= b[i];
                        answer += b[i];
                    } else {
                        answer += a[i];
                        a[i] = 0;
                    }
                } else {
                    answer += b[i];
                }
            }
            out.println(answer);
        }

    }
}

