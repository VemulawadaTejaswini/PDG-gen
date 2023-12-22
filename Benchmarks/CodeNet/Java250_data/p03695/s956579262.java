import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author G. Guarnieri
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
        /*
        Rating 1-399 : gray
        Rating 400-799 : brown
        Rating 800-1199 : green
        Rating 1200-1599 : cyan
        Rating 1600-1999 : blue
        Rating 2000-2399 : yellow
        Rating 2400-2799 : orange
        Rating 2800-3199 : red
         */
            Set<Integer> colors = new HashSet<>();
            int n = in.nextInt();
            int choosers = 0;
            for (int i = 0; i < n; i++) {
                int current = getColor(in.nextInt());
                if (current < 0) {
                    ++choosers;
                }
                else {
                    colors.add(current);
                }
            }
            out.printf("%d %d\n",
                       Math.max(colors.size(), 1),
                       colors.size() + choosers);
        }

        private int getColor(int score) {
            if (score < 400) {
                return 0;
            }
            else if (score < 800) {
                return 1;
            }
            else if (score < 1200) {
                return 2;
            }
            else if (score < 1600) {
                return 3;
            }
            else if (score < 2000) {
                return 4;
            }
            else if (score < 2400) {
                return 5;
            }
            else if (score < 2800) {
                return 6;
            }
            else if (score < 3200) {
                return 7;
            }
            else {
                return -1;
            }

        }

    }
}

