import java.io.*;
import java.util.*;
 
public class Main {
    static final long MOD = 1000000007L;
    static final int INF = 50000000;
    static final int NINF = -50000000;
    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        PrintWriter pw = new PrintWriter(System.out);
        
        int H = sc.ni();
        int W = sc.ni();
        int K = sc.ni();
        int[][] grid = new int[H][W];
        for (int i = 0; i < H; i++) {
        	String s = sc.next();
        	for (int j = 0; j < W; j++) {
        		if (s.charAt(j)=='#')
        			grid[i][j] = 1;
        	}
        }
        int ans = 0;
        for (int i = 0; i < (1<<H); i++) {
        	for (int j = 0; j < (1<<W); j++) {
        		int black = 0;
        		for (int a = 0; a < H; a++) {
        			for (int b = 0; b < W; b++) {
        				if ((i&(1<<a))==0 && (j&(1<<b))==0)
        					black += grid[a][b];
        			}
        		}
        		if (black==K)
        			ans++;
        	}
        }
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