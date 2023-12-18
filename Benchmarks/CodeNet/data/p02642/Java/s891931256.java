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
        ABC170_d solver = new ABC170_d();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC170_d {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int A[] = new int[N];
            boolean computed[] = new boolean[N];
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            int count = 0;
            int it = 0;
            //while(j<N)
            for (int j = 0; j < N; j++) {
                for (int i = it; i < N; i++) {
                    if (i == j) {
                        continue;
                    }
                    if ((A[j] % A[i]) == 0) {
                        computed[j] = true;
                        it = i;
                        break;
                    }
                }
            }
            for (int i = 0; i < N - 1; i++) {
                if (!computed[i]) {
                    count++;
                }
            }
            out.println(count);
        }

    }
}

