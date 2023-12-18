import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    //static final long MOD = 998244353L;
    static final int INF = 50000000;
    static final int NINF = -500000000;

    
    static long[] fac;
    static long[] invfac;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int S = sc.ni();
        fac = new long[S+1];
        fac[0] = 1L;
        for (int i = 1; i <= S; i++)
        	fac[i] = (i*fac[i-1])%MOD;
        invfac = new long[S+1];
        invfac[S] = power(fac[S],MOD-2,MOD);
        for (int i = S-1; i >= 0; i--)
        	invfac[i] = ((i+1)*invfac[i+1])%MOD;
        
        long ans = 0;
        for (int t = 1; 3*t <= S; t++) {
        	int target = S-3*t;
        	//stars n bars
        	ans += choose(target+t-1,t-1);
        	ans %= MOD;
        }
        pw.println(ans);
        pw.close();
    }
    
    public static long choose(int n, int k) {
    	if (k < 0 || k > n)return 0;
    	long num = fac[n];
    	long denInv = (invfac[k]*invfac[n-k])%MOD;
    	return (num*denInv)%MOD;
    }
    
    //Fast exponentiation (x^y mod m)
    public static long power(long x, long y, long m) {
      long ans = 1;
      x %= m;
      while (y > 0) {
        if((y&1)==1)
          ans = (ans * x) % m;
        y /= 2;
        x = (x * x) % m;
      }
      return ans;
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