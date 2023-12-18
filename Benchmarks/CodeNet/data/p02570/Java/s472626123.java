import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author test
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        abc177_a solver = new abc177_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class abc177_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int D = in.nextInt();
            int T = in.nextInt();
            int S = in.nextInt();

            if (((D / S) + (D % S == 0 ? 0 : 1)) <= T) {
                out.println("Yes");
            } else {
                out.println("No");
            }
        }

    }
}

