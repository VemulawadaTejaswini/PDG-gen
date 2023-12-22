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
 * @author SimplyDivine
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskC solver = new TaskC();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskC {
        public void solve(int testNumber, FastReader in, PrintWriter out) {
            int n = in.nextInt();
            int ratings[] = new int[n];
            for (int i = 0; i < n; i++) {
                ratings[i] = in.nextInt();
            }
            int[] colors = new int[9];
            boolean visited = false;
            for (int i = 0; i < n; i++) {
                if (ratings[i] <= 399) {
                    colors[0]++;
                    visited = true;
                } else if (ratings[i] <= 799) {
                    colors[1]++;
                    visited = true;
                } else if (ratings[i] < 1200) {
                    colors[2]++;
                    visited = true;
                } else if (ratings[i] < 1600) {
                    colors[3]++;
                    visited = true;
                } else if (ratings[i] < 2000) {
                    colors[4]++;
                    visited = true;
                } else if (ratings[i] < 2400) {
                    colors[5]++;
                    visited = true;
                } else if (ratings[i] < 2800) {
                    colors[6]++;
                    visited = true;
                } else if (ratings[i] < 3200) {
                    colors[7]++;
                    visited = true;
                } else {
                    colors[8]++;
                }
            }
            int max = 0;
            int min = 0;
//        System.out.println(Arrays.toString(colors));
            for (int i = 0; i < 8; i++) {
                if (colors[i] > 0) {
                    max++;
                    min++;
                }
            }
            if (colors[8] > 0) {
                max += colors[8];
                if (!visited) min = 1;
            }
            out.println(min + " " + max);
        }

    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream i) {
            br = new BufferedReader(new
                    InputStreamReader(i));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

