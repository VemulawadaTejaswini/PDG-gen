import java.util.*;
import java.io.*;
import java.math.BigInteger;

class Main {
    public static void main(String[] args) {
        FastReader sc = new FastReader();
        long x = sc.nextLong();
        long k = sc.nextLong();
        long d = sc.nextLong();
        x = Math.abs(x);
        long numberofhops = x / d;
        if (x > 0 && numberofhops >= k) {
            long distancecovered = d * k;
            x -= distancecovered;
            System.out.println(x);
        } else {
            long distancecovered = d * k;
            x -= distancecovered;
            k -= numberofhops;
            if (k % 2 == 0)
                System.out.println(x);
            else {
                long v1 = Math.abs(x + d);
                long v2 = Math.abs(x - d);
                System.out.println(Math.min(v1, v2));
            }
        }

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