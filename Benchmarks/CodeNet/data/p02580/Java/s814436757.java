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
        EBomber solver = new EBomber();
        solver.solve(1, in, out);
        out.close();
    }

    static class EBomber {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            // 入力
            int h = Integer.parseInt(in.next());
            int w = Integer.parseInt(in.next());
            int m = Integer.parseInt(in.next());
            int[] hm = new int[m];
            int[] wm = new int[m];
            int[] rowcnt = new int[h];
            int[] colcnt = new int[w];
            for (int i = 0; i < m; i++) {
                hm[i] = Integer.parseInt(in.next()) - 1;
                wm[i] = Integer.parseInt(in.next()) - 1;
                rowcnt[hm[i]]++;
                colcnt[wm[i]]++;
            }
            int ymax = 0;
            for (int i = 0; i < h; i++) {
                ymax = Math.max(ymax, rowcnt[i]);
            }
            int xmax = 0;
            for (int j = 0; j < w; j++) {
                xmax = Math.max(xmax, colcnt[j]);
            }
            int yc = 0;
            for (int i = 0; i < h; i++) {
                if (rowcnt[i] == ymax) yc++;
            }
            int xc = 0;
            for (int j = 0; j < w; j++) {
                if (colcnt[j] == xmax) xc++;
            }
            long cnt = (long) xc * yc;
            for (int i = 0; i < m; i++) {
                if (rowcnt[hm[i]] + colcnt[wm[i]] == xmax + ymax) {
                    cnt--;
                }
            }
            out.println(cnt == 0 ? xmax + ymax - 1 : xmax + ymax);
        }

    }
}

