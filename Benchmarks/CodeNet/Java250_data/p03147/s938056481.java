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
        GrandGarden solver = new GrandGarden();
        solver.solve(1, in, out);
        out.close();
    }

    static class GrandGarden {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int[] h = new int[n];
            for (int i = 0; i < n; i++) {
                h[i] = in.nextInt();
            }

            long result = 0;
            int i = 0;
            while (i < n) {
                if (h[i] == 0) {
                    i++;
                    continue;
                }
                int v = 1;
                result += 1;
                h[i] -= v;
                for (int j = i + 1; j < n; j++) {
                    if (h[j] > 0) {
                        h[j] = (h[j] >= v) ? h[j] - v : 0;
                    } else {
                        break;
                    }
                }
            }
            out.print(result);
        }

    }
}

