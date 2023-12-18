import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Reader sc = new Reader();
        PrintWriter pw = new PrintWriter(System.out);
        
        try {
            long x = sc.nextLong();
            long k = sc.nextLong();
            long d = sc.nextLong();

            if(x < 0) x = -x;

            long steps = x/d;
            if(steps >= k) {
                pw.println(x - k*d);
            }
            else {
                long a1 = x%d;
                long a2 = x%d-d;
                k -= steps;
                long ans = 0;
                if(k%2 == 0) {
                    ans = a1;
                }
                else {
                    ans = a2;
                }
                ans = Math.abs(ans);
                pw.println(ans);
            }
        }
        finally {
            pw.flush();
            pw.close();
        }
    }
    
    static class Reader {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch(IOException io) {
                    io.printStackTrace();
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
    }
}
