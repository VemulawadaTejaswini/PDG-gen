import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Solution Start
        int n = scn.nextInt();
        long k = scn.nextLong();
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();

        long prev = 1;
        for (int i = (int) (k - 1); i >= 0; i--) {
            prev *= a[i];
        }

        long i = k;
        while (i < n) {
            long ans = (prev * a[(int) i]) / a[(int) (i - k)];
            if (ans > prev) out.println("Yes");
            else out.println("No");
            prev = ans;
            i++;
        }

        //Solution end
        out.close();
    }


    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}
