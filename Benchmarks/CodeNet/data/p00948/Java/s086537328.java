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
        DistributionCenter solver = new DistributionCenter();
        solver.solve(1, in, out);
        out.close();
    }

    static class DistributionCenter {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            final int MAX = 100001;
            final int n = in.nextInt();
            final int m = in.nextInt();
            int[] x = new int[m];
            int[] y = new int[m];
            int[] ar = new int[MAX];
            for (int i = 0; i < m; i++) {
                x[i] = in.nextInt();
                y[i] = in.nextInt();
                ar[x[i]] = y[i];
            }
            int[] left = new int[n];
            int[] right = new int[n];
            for (int i = 0; i < n; i++) {
                left[i] = right[i] = i;
            }

            for (int i = 0; i < MAX; i++) {
                if (ar[i] != 0) {
                    right[ar[i] - 1] = right[ar[i]];
                    left[ar[i]] = left[ar[i] - 1];
                }
            }

            for (int i = 0; i < n; i++) {
                if (i + 1 == n) out.println((right[i] - left[i] + 1));
                else out.print((right[i] - left[i] + 1) + " ");
            }
        }

    }
}