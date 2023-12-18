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
        Multiplication2 solver = new Multiplication2();
        solver.solve(1, in, out);
        out.close();
    }

    static class Multiplication2 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int num = in.nextInt();
            long ans = 1;
            for (int i = 0; i < num; i++) {
                long a = in.nextLong();
                ans *= a;
            }
            if (ans >= 1000000000000000001L) {
                out.append("-1\n");
                return;
            }
            out.append(String.valueOf(ans));
        }

    }
}

