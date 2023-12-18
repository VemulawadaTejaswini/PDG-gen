import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        int k = sc.nextInt();
        if ((k & (k - 1)) == 0) {
            out.println(-1);
        } else if (k == 7) {
            out.println(1);
        } else {
            long pow = 10;
            for (int i = 1; i <= k; i++) {
                long minus = (pow - 1) % k;
                if (minus < 0) minus += k;
                if ((minus * inv(9, k)) % k == 0) {
                    out.println(i);
                    out.close();
                    return;
                }
                pow = (pow * 10) % k;
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

    static int inv(int x, int mod) {
        return pow(x, mod - 2, mod);
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