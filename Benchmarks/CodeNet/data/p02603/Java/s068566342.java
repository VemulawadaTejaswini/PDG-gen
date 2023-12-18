import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        boolean [][][] dp = new boolean[n + 1][25][10005];
        dp[0][0][1000] = true;
        for (int i = 1; i <= n; i++) {
            for (int stock = 0; stock <= 24; stock++) {
                for (int money = 0; money <= 10000; money++) {
                    for (int prev = 0; prev <= 24; prev++) {
                        int old = money - (prev - stock) * a[i];
                        if (old >= 0 && old <= 10000 && dp[i - 1][prev][old]) dp[i][stock][money] = true;
                    }
                }
            }
        }
        int ans = 1000;
        for (int money = 0; money <= 10000; money++) {
            for (int stock = 0; stock <= 24; stock++) {
                if (dp[n][stock][money]) ans = Math.max(ans, money);
            }
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