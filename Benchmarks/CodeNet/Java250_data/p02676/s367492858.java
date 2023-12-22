import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputstream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputstream);
        AtcoderB solution = new AtcoderB();
        solution.solve(1, in, out);
        out.flush();
        out.close();
    }

    static class AtcoderB {
        public void solve(int testNumber, Scanner sc, PrintWriter out) {
            int k = sc.nextInt();
            String s = sc.next();
            if (s.length() <= k)
                out.println(s);
            else
                out.print(s.substring(0, k) + "...");
        }
    }
    static class Scanner {
        StringTokenizer st;
        BufferedReader br;

        public Scanner(InputStream s) {
            br = new BufferedReader(new InputStreamReader(s));
        }

        public Scanner(FileReader f) {
            br = new BufferedReader(f);
        }

        public String next() {
            while (st == null || !st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
