import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int[] nums = new int[N];
		for (int i = 0; i < N; i++)
			nums[i] = sc.ni();
		
		int S = 200; //number of stocks held
		int[][] dp = new int[N+1][S+1]; //store the max money on day i with j stocks held
		boolean[][] possible = new boolean[N+1][S+1];
		dp[0][0] = 1000;
		possible[0][0] = true;
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j <= S; j++) {
				int v = -1;
				for (int k = 0; k <= S; k++) {
					if (!possible[i-1][k])continue;
					int money = dp[i-1][k]+(k-j)*nums[i-1];
					v = Math.max(v, money);
				}
				if (v >= 0) {
					dp[i][j] = v;
					possible[i][j] = true;
				}
			}
		}
		int ans = 0;
		for (int j = 0; j <= S; j++)
			ans = Math.max(ans, dp[N][j]);
		pw.println(ans);
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
                } catch (IOException  e) { 
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