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
        abc156_c solver = new abc156_c();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc156_c {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int x[] = new int[N];
            for (int i = 0; i < N; i++) {
                x[i] = in.nextInt();
            }
            int min = Integer.MAX_VALUE;
            for (int i = 1; i <= 100; i++) {
                int val = 0;
                for (int j = 0; j < N; j++) {
                    val += (x[j] - i) * (x[j] - i);
                }
                min = Math.min(min, val);
            }
            out.println(min);
        }

    }
}

