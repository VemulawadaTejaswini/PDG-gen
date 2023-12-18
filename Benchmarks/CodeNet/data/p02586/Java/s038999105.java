import java.io.*;
import java.math.*;
import java.util.*;
 
public class Main {
	static final long MOD = 1000000007L;
	public static void main(String[] args) {
		FastScanner sc = new FastScanner();
		PrintWriter pw = new PrintWriter(System.out);
		
		int N = sc.ni();
		int M = sc.ni();
		int K = sc.ni();
		int[][] grid = new int[N][M];
		for (int i = 0; i < K; i++) {
			int r = sc.ni()-1;
			int c = sc.ni()-1;
			int v = sc.ni();
			grid[r][c] = v;
		}
		long[][][] dp = new long[N][M][4];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (i==0&j==0) {
					dp[0][0][0] = 0;
					dp[0][0][1] = grid[0][0];
					continue;
				}
				for (int k = 1; k < 4; k++) {
					long v = 0;
					long w = 0;
					if (i>0) {
						v = dp[i-1][j][k];
						if (k==1) {
							for (int m = 0; m <= 3; m++) {
								v = Math.max(v, dp[i-1][j][m]+grid[i][j]);
							}
						}
					}
					if (j > 0) {
						w = Math.max(dp[i][j-1][k], dp[i][j-1][k-1]+grid[i][j]);
					}
					dp[i][j][k] = Math.max(v, w);
				}
			}
		}
		long ans = 0;
		for (int k = 1; k <= 3; k++)
			ans = Math.max(dp[N-1][M-1][k],ans);
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