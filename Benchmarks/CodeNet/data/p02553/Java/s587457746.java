import java.io.*;
import java.util.*;
 
public class Main {
    //static final long MOD = 1000000007L;
    static final long DIV2 = 500000004L;
    static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;
 
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        long A = sc.nl();
        long B = sc.nl();
        long C = sc.nl();
        long D = sc.nl();
        pw.println(Math.max(Math.max(A*C,A*D),Math.max(B*C, B*D)));
        pw.close();
    }
    
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;
 
        public FastScanner() {
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
 
        int ni() {
            return Integer.parseInt(next());
        }
 
        long nl() {
            return Long.parseLong(next());
        }
 
        double nd() {
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