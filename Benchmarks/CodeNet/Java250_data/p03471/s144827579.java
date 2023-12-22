import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author Silviase
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        COtoshidama solver = new COtoshidama();
        solver.solve(1, in, out);
        out.close();
    }

    static class COtoshidama {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int tot = in.nextInt();
            int yukichi = -1;
            int higuchi = -1;
            int noguchi = -1;
            for (int i = 0; i <= n; i++) {
                for (int j = 0; j <= n - i; j++) {
                    if (i * 10000 + j * 5000 + (n - i - j) * 1000 == tot) {
                        yukichi = i;
                        higuchi = j;
                        noguchi = n - i - j;
                        break;
                    }
                }
            }
            out.println(yukichi + " " + higuchi + " " + noguchi);
        }

    }
}

