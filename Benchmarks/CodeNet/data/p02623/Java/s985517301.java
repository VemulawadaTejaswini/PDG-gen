import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt(); int m = sc.nextInt(); long k = sc.nextLong();
        long [] a = new long[n];
        long []b = new long[m];
        for (int i = 0; i < n; i++) a[i] = sc.nextLong();
        for (int i = 0; i < m; i++) b[i] = sc.nextLong();
        long ans = 0;
        long [] pref1 = new long[n + 1]; long [] pref2 = new long[m + 1];
        for (int i = 1; i <= n; i++) {
            pref1[i] = pref1[i - 1] + a[i - 1];
        }
        for (int i = 1; i <= m; i++) {
            pref2[i] = pref2[i - 1] + b[i - 1];
        }
        int j = m;
        for (int i = 0; i <= n; i++) {
            if (pref1[i] > k) break;
            while (pref1[i] + pref2[j] > k) {
                j--;
            }
            ans = Math.max(ans, i + j);
        }
        out.println(ans);
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
