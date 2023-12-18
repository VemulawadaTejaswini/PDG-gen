import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int n = sc.nextInt();
        String s = sc.next();
        int pop = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '1') {
                pop++;
            }
        }
        int below = 0; int above = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                if (pop != 1) below = (below + pow(2, n - 1 - i, pop - 1)) % (pop - 1);
                above = (above + pow(2, n - 1 - i, pop + 1)) % (pop + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                if (pop == 1) {
                    out.println(0); continue;
                }
                int use = below;
                use = (use - pow(2, n - 1 - i, pop - 1)) % (pop - 1);
                if (use < 0) use += (pop - 1);
                int ans = 1;
                while (use != 0) {
                    use = use % Integer.bitCount(use);
                    ans++;
                }
                out.println(ans);
            } else {
                int use = above;
                use = (use + pow(2, n - 1 - i, pop + 1)) % (pop + 1);
                if (use < 0) use += (pop + 1);
                int ans = 1;
                while (use != 0) {
                    use = use % Integer.bitCount(use);
                    ans++;
                }
                out.println(ans);
            }
        }
        out.close();
    }

    static int pow(long b, int e, int mod) {
        long ans = 1;
        while (e > 0) {
            if (e % 2 == 1)
                ans = ans * b % mod;
            e >>= 1;
            b = b * b % mod;
        }
        return (int) ans;
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