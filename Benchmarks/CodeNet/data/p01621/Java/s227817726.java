import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.function.IntToDoubleFunction;
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
        BSimForest2013 solver = new BSimForest2013();
        solver.solve(1, in, out);
        out.close();
    }

    static class BSimForest2013 {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            while (true) {
                int s = in.nextInt(), n = in.nextInt(), t = in.nextInt();
                boolean daylimited = !in.next().equals("All"), timelimited = !in.next().equals("All");
                int p = in.nextInt(), m = in.nextInt();
                if (s == 0) return;

                IntToDoubleFunction ans = max -> 1d - Math.pow(1 - 1d / p, n * max);

                int range, cycle;
                if (daylimited && timelimited) {
                    cycle = 7 * 24 * 60;
                    range = 12 * 60;
                } else if (daylimited) {
                    cycle = 7 * 24 * 60;
                    range = 24 * 60;
                } else if (timelimited) {
                    cycle = 24 * 60;
                    range = 12 * 60;
                } else {
                    out.println(ans.applyAsDouble(m));
                    continue;
                }

                int max = 0;
                for (int i = 0; i < cycle; i++) {
                    int cnt = 0;
                    for (int j = 0; j < m; j++) {
                        int start = i + j * t, end = i + j * t + s;
                        start %= cycle;
                        end %= cycle;
                        if (start < range && end < range) cnt++;
                    }
                    max = Math.max(max, cnt);
                }
                out.println(ans.applyAsDouble(max));
            }
        }

    }
}


