import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        int m = 1000; int stock = 0; boolean inc = a[0] < a[1];
        if (inc) {
            int possible = m / a[0];
            stock += possible;
            m -= a[0] * possible;
        }
        for (int i = 0; i < n - 1; i++) {
            if (inc) {
                if (a[i] > a[i + 1]) {
                    m += (stock * a[i]); stock = 0;
                    inc = false;
                }
            } else {
                if (a[i] < a[i + 1]) {
                    int possible = m / a[i];
                    stock += possible;
                    m -= a[i] * possible;
                    inc = true;
                }
            }

        }
        if (inc) {
            m += (stock * a[n - 1]); stock = 0;
        }
        out.println(m);
        out.close();
    }


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
                } catch (IOException e) {
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
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }


    }

}