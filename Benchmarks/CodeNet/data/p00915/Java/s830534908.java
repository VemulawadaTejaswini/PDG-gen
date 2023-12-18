import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
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
        TheLastAnt solver = new TheLastAnt();
        try {
            int testNumber = 1;
            while (true)
                solver.solve(testNumber++, in, out);
        } catch (UnknownError e) {
            out.close();
        }
    }

    static class TheLastAnt {
        public void solve(int testNumber, Scanner in, PrintWriter out) {
            int n = in.nextInt();
            int l = in.nextInt();
            if (n == 0 && l == 0) throw new UnknownError();
            int last = 0;
            int[] ltunnel = new int[l];
            int[] rtunnel = new int[l];
            for (int i = 0; i < n; i++) {
                String d = in.next();
                int p = in.nextInt();
                if (d.equals("R")) {
                    last = Math.max(last, l - p);
                    rtunnel[p] = i + 1;
                } else {
                    last = Math.max(last, p);
                    ltunnel[p] = i + 1;
                }
            }
            int[] newltunnel, newrtunnel;
            int cnt = n, lastant = -1;
            while (true) {
                //outArray(ltunnel);
                //outArray(rtunnel);
                if (cnt == 0) {
                    out.println(last + " " + lastant);
                    return;
                }
                newltunnel = new int[l];
                newrtunnel = new int[l];
                Arrays.fill(newltunnel, 0);
                Arrays.fill(newrtunnel, 0);
                for (int i = 0; i < l; i++) {
                    if (rtunnel[i] != 0) {
                        if (i + 1 != l) newrtunnel[i + 1] = rtunnel[i];
                        else {
                            lastant = rtunnel[i];
                            cnt--;
                        }
                    }
                    if (ltunnel[i] != 0) {
                        if (i != 0) newltunnel[i - 1] = ltunnel[i];
                        else {
                            lastant = ltunnel[i];
                            cnt--;
                        }
                    }
                }
                for (int i = 0; i < l; i++) {
                    if (newltunnel[i] != 0 && newrtunnel[i] != 0) {
                        final int buf = newrtunnel[i];
                        newrtunnel[i] = newltunnel[i];
                        newltunnel[i] = buf;
                    }
                }
                ltunnel = newltunnel;
                rtunnel = newrtunnel;
            }
        }

    }
}