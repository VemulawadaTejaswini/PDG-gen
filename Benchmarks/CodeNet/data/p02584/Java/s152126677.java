
import java.util.*;
import java.io.*;
import java.math.BigInteger;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 *
 * @author prem_cse
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        FastReader in = new FastReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Solution solver = new Solution();
        solver.solve(1, in, out);
        out.close();
    }

    static class Solution{
  
    	
        public void solve(int testNumber, FastReader sc, PrintWriter out) {
        
        	long x = sc.nextLong();
        	long k = sc.nextLong();
        	long d = sc.nextLong();
           
            x = Math.abs(x);
            if(k<=x/d) {
                out.print(x-(k*d));
            }else {
            long q = x/d;
                x-=d*q;
                k-=q;
                x%=d;
                if(k%2==0) out.print(x);
                else out.print(Math.abs(x-d));
            }
        }

	
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream stream) {
            br = new BufferedReader(new
                    InputStreamReader(stream), 32768);
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

    }
}

