import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import java.util.StringTokenizer;


public class Main {

    private final static FastReader in = new FastReader();
    private static final PrintWriter out = new PrintWriter(System.out);


    public static long solve(long x, long k, long d) {
        if (x < 0) {
            x = -x;
        }
        long val = x / d;
        if (val >= k) {
            return x - (k * d);
        } else {
            long an = x - (val * d);
            an-=d;
            k--;
            if ((k - val) % 2 == 0) {
                return Math.abs(an);
            } else {
                return Math.abs(an+d) ;
            }
        }

    }

    public static void main(String[] args) {

        out.println(solve(in.nextLong(), in.nextLong(), in.nextLong()));

        out.flush();
    }

    private static final class FastReader {
        private static BufferedReader BF;
        private static StringTokenizer ST;

        public FastReader() {
            BF = new BufferedReader(new InputStreamReader(System.in));
            ST = null;
        }


        public final String next() {
            while (ST == null || !ST.hasMoreTokens()) {
                try {
                    ST = new StringTokenizer(BF.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return ST.nextToken();

        }

        final int nextInt() {
            return Integer.parseInt(next());
        }
        final long nextLong() {
            return Long.parseLong(next());
        }
    }


}
