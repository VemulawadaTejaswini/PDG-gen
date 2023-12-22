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
        ABC129_b solver = new ABC129_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC129_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = in.nextInt();
            }
            int diff = 999;
            for (int T = 0; T < N; T++) {
                int left = 0;
                int right = 0;
                for (int i = 0; i < N; i++) {
                    if (i <= T) {
                        left += arr[i];
                    } else {
                        right += arr[i];
                    }
                }
                if (diff > (Math.abs(left - right))) {
                    diff = (Math.abs(left - right));
                }
            }
            out.println(diff);

        }

    }
}

