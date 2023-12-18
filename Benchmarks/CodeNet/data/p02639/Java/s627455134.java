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
        ABC170_a solver = new ABC170_a();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC170_a {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            for (int i = 0; i < 5; i++) {
                int into = in.nextInt();
                if (into == 0) {
                    out.println(i + 1);
                    return;
                }

            }

        }

    }
}

