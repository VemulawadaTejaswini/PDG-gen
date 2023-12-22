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
        APlacingMarbles solver = new APlacingMarbles();
        solver.solve(1, in, out);
        out.close();
    }

    static class APlacingMarbles {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            String s = in.next();
            int ans = 0;
            for (int i = 0; i < 3; i++) {
                if (s.charAt(i) == '1') {
                    ans++;
                }
            }
            out.println(ans);
        }

    }
}

