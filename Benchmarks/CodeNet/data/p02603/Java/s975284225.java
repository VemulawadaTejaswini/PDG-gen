import java.util.*;
import java.io.*;

public class Main {
    static int max = 5000;
    static int s = 40;
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        int [] a = new int[n + 1];
        for (int i = 1; i <= n; i++) a[i] = sc.nextInt();
        boolean [][][] dp = new boolean[n + 1][s + 1][max + 5];
        dp[0][0][1000] = true;
        for (int i = 1; i <= n; i++) {
            for (int stock = 0; stock <= s; stock++) {
                for (int money = 0; money <= max; money++) {
                    for (int prev = 0; prev <= s; prev++) {
                        int old = money - (prev - stock) * a[i];
                        if (old >= 0 && old <= max && dp[i - 1][prev][old]) dp[i][stock][money] = true;
                    }
                }
            }
        }
        int ans = 0;
        for (int money = 0; money <= max; money++) {
            boolean ok = false;
            for (int stock = 0; stock <= s; stock++) {
                if (dp[n][stock][money]) {
                    ans = Math.max(ans, money); ok = true;
                }
            }
            //if (ok) System.out.println(money);
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