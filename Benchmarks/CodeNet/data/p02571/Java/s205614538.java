import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        String a = sc.next();
        String b = sc.next();
        if (a.length() <= b.length()) {
            System.out.println(minimumChar(a, b));
        } else {
            System.out.println(minimumChar(b, a));
        }
    }

    static int minimumChar(String S1, String S2) {
        int n = S1.length();
        int m = S2.length();

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < m - n + 1; i++) {
            int minRemovedChar = 0;
            for (int j = 0; j < n; j++) {
                if (S1.charAt(j) != S2.charAt(i + j)) {
                    minRemovedChar++;
                }
            }

            ans = Math.min(minRemovedChar, ans);
        }

        return ans;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
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