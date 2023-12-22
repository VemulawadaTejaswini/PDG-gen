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
        C solver = new C();
        solver.solve(1, in, out);
        out.close();
    }

    static class C {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int c[][] = new int[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    c[i][j] = Integer.parseInt(in.next());
                }
            }
            int rows[][] = new int[3][2];
            int cols[][] = new int[3][2];

            for (int i = 0; i < 3; i++) {
                rows[i][0] = c[i][0] - c[i][1];
                rows[i][1] = c[i][1] - c[i][2];
            }
            for (int i = 0; i < 3; i++) {
                cols[i][0] = c[0][i] - c[1][i];
                cols[i][1] = c[1][i] - c[2][i];
            }

            boolean ok = false;

            if (rows[0][0] == rows[1][0] && rows[1][0] == rows[2][0] &&
                    rows[0][1] == rows[1][1] && rows[1][1] == rows[2][1] &&
                    cols[0][0] == cols[1][0] && cols[1][0] == cols[2][0] &&
                    cols[0][1] == cols[1][1] && cols[1][1] == cols[2][1]) {
                ok = true;
            }
            out.println(ok ? "Yes" : "No");

        }

    }
}

