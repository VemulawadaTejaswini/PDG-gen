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
        ABC170_b solver = new ABC170_b();
        solver.solve(1, in, out);
        out.close();
    }

    static class ABC170_b {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int X = in.nextInt();
            int Y = in.nextInt();
            if ((Y % 2) == 0) {
                if (Y / 2 == X) {
                    out.println("Yes");
                    return;
                }
                int four = 0;
                for (int i = 1; i <= X; i++) {
                    four = i * 4;
                    if (((Y - four) / 2) == (X - i)) {
                        out.println("Yes");
                        return;
                    }
                }
                out.println("No");
            } else {
                out.println("No");
            }


        }

    }
}

