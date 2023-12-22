import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author HussienMoustafa
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        BJudgeStatusSummary solver = new BJudgeStatusSummary();
        solver.solve(1, in, out);
        out.close();
    }

    static class BJudgeStatusSummary {
        public void solve(int testNumber, Scanner s, PrintWriter sout) {
            int n = s.nextInt(), ac = 0, wa = 0, tle = 0, re = 0;
            String x;
            char a;
            while (n-- != 0) {
                x = s.next();
                a = x.charAt(0);
                if (a == 'A') ac++;
                else if (a == 'T') tle++;
                else if (a == 'R') re++;
                else wa++;
            }
            sout.println("AC x " + ac);
            sout.println("WA x " + wa);
            sout.println("TLE x " + tle);
            sout.println("RE x " + re);
        }

    }

    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

