import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        MyScanner scn = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));
        // Solution Start
        int n = scn.nextInt();
        int[] a = new int[n];
        //int m = 1000;
        int k = scn.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        /*
        int day = 0;
        int stocks = 0;
        while (day < n) {
            if (day == (n - 1)) {
                if (stocks > 0) {
                    m += stocks * a[day];
                    stocks = 0;
                }
            } else {
                if (a[day] < a[day + 1]) {
                    stocks = m / a[day];
                    m -= a[day] * stocks;
                } else if (day > 0) {
                    if ((a[day - 1] < a[day])) {
                        m += stocks * a[day];
                        stocks = 0;
                    }
                }
            }
            //out.println(m);
            //out.println(stocks);
            //out.println();
            day++;
        }
        out.println(m);
        */

        long prev = 1;
        for (int i = (k - 1); i >= 0; i--) {
            prev *= a[i];
        }

        int i = k;
        while (i < n) {
            long ans = (prev * a[i]) / a[(i - k)];
            out.println(ans + " " + prev);
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
