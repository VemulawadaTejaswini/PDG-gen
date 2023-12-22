import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Kenji
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        ABC097B solver = new ABC097B();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC097B {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            boolean[] b = new boolean[X + 1];
            b[1] = true;
            for (int c = 2; c <= X; c++) {
                int v = c * c;
                while (v <= X) {
                    b[v] = true;
                    v *= c;
                }
            }
            for (int i = X; i >= 1; i--) {
                if (b[i]) {
                    out.println(i);
                    return;
                }
            }
            return;
        }

    }
}

