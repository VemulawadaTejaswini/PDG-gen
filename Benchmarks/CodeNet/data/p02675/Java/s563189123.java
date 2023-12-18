import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputstream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputstream);
        AtcoderA solution = new AtcoderA();
        solution.solve(1, in, out);
        out.flush();
        out.close();
    }
    static class AtcoderA {
        public void solve(int testNumber, Scanner sc, PrintWriter out) {
            int n = sc.nextInt();
            int unit = n % 10;
            if (unit == 2 || unit == 4 || unit == 5 || unit == 7 || unit == 9)
                out.println("hon");
            else if (unit == 0 || unit == 1 || unit == 6 || unit == 8)
                out.println("pon");
            else
                out.println("bon");
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
