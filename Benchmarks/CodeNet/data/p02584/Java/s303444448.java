import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
        long x = sc.nextLong(); long k = sc.nextLong(); long d = sc.nextLong();
        long mod = x % d;
        if (mod < 0) mod += d;
        if (mod == 0) {
            long times = Math.abs(x - mod) / d;
            if (times <= k) {
                out.println(((times - k) % 2 == 0 ? 0 : d));
            }
            else if (x < 0) {
                out.println(x + k * d);
            } else {
                out.println(x - k * d);
            }
        } else {
            long other = mod - d; long reach;
            if (Math.abs(other) < mod) reach = other; reach = mod;
            long times = Math.abs(reach - x) / d;
            if (times <= k) {
                out.println((times - k) % 2 == 0 ? Math.abs(reach) : (d - Math.abs(reach)));
            }
            else if (x < 0) {
                out.println(x + k * d);
            } else {
                out.println(x - k * d);
            }
        }
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