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
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int N = in.nextInt();
            int Q = in.nextInt();
            String S = in.next();

            int s[] = new int[N + 1];
            int count = 0;
            for (int i = 2; i <= N; i++) {
                if (S.charAt(i - 1) == 'C' && S.charAt(i - 2) == 'A') {
                    count++;
                }
                s[i] = count;
            }

            for (int i = 0; i < Q; i++) {
                int l = in.nextInt();
                int r = in.nextInt();
                out.println(s[r] - s[l]);
            }
        }

    }
}

