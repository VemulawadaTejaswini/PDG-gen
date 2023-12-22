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
        abc154_c solver = new abc154_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc154_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A[] = new int[N];

            for (int i = 0; i < N; i++) {
                int idx = in.nextInt();
                A[i] = idx;
            }
            Arrays.sort(A);
            for (int i = 0; i < N - 1; i++) {
                if (A[i] == A[i + 1]) {
                    out.println("NO");
                    return;
                }
            }
            out.println("YES");
        }

    }
}

