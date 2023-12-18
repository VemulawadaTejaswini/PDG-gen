//package com.company;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

//****Use Integer Wrapper Class for Arrays.sort()****
public class Main {
    static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

    public static void main(String[] Args) throws Exception {
        FastReader scan = new FastReader(System.in);
        int t = 1;
//        t=scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            String num = scan.next();
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (num.charAt(i) == '1') {
                    sum++;
                }
            }
            long[] mod = new long[2];
            long[][] vals = new long[2][n];
            sum--;
            if (sum > 0) {
                for (int i = 0; i < n; i++) {
                    vals[0][n - 1 - i] = power(2, i, sum);
                }
                for (int i = n - 1; i >= 0; i--) {
                    if (num.charAt(i) == '1') {
                        mod[0] = (mod[0] + vals[0][i]) % sum;
                    }
                }
            }
            sum += 2;
            for (int i = 0; i < n; i++) {
                vals[1][n - 1 - i] = power(2, i, sum);
            }
            for (int i = n - 1; i >= 0; i--) {
                if (num.charAt(i) == '1') {
                    mod[1] = (mod[1] + vals[1][i]) % sum;
                }
            }
            sum--;
            ArrayList<Long> ans = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                long temp;
                long a;
                if (num.charAt(i) == '1') {
                    sum--;
                    if(sum<=0){
                        a=0;
                        temp=0;
                    }else {
                        a=1;
                        temp = mod[0];
                        temp = (temp - vals[0][i] + sum) % sum;
                    }
                    sum++;
                } else {
                    a=1;
                    sum++;
                    temp = mod[1];
                    temp = (temp + vals[1][i]) % sum;
                    sum--;
                }
                while (temp != 0) {
                    a++;
                    long set = Long.bitCount(temp);
                    temp = temp % set;
                }
                ans.add(a);
            }
            for (Long i : ans) {
                out.println(i);
            }
        }
        out.flush();
        out.close();
    }

    static long power(long x, long y, long mod) {
        long res = 1;
//        long mod=1000000007;
        while (y > 0) {
            if (y % 2 != 0)
                res = (res * x) % mod;
            y >>= 1;
            x = (x * x) % mod;
        }
        return res % mod;
    }

    static class FastReader {

        byte[] buf = new byte[2048];
        int index, total;
        InputStream in;

        FastReader(InputStream is) {
            in = is;
        }

        int scan() throws IOException {
            if (index >= total) {
                index = 0;
                total = in.read(buf);
                if (total <= 0) {
                    return -1;
                }
            }
            return buf[index++];
        }

        String next() throws IOException {
            int c;
            for (c = scan(); c <= 32; c = scan()) ;
            StringBuilder sb = new StringBuilder();
            for (; c > 32; c = scan()) {
                sb.append((char) c);
            }
            return sb.toString();
        }

        int nextInt() throws IOException {
            int c, val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }

        long nextLong() throws IOException {
            int c;
            long val = 0;
            for (c = scan(); c <= 32; c = scan()) ;
            boolean neg = c == '-';
            if (c == '-' || c == '+') {
                c = scan();
            }
            for (; c >= '0' && c <= '9'; c = scan()) {
                val = (val << 3) + (val << 1) + (c & 15);
            }
            return neg ? -val : val;
        }
    }
}
