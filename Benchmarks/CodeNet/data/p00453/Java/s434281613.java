import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		int INF = Integer.MAX_VALUE;
			
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0) break;
			
			int[][] d = new int[n][10];
			for(int[] dd : d) Arrays.fill(dd, -1);
			
			for(int i = 0; i < n; i++){
				int k = sc.nextInt();
				for(int j = 0; j < k; j++){
					int x = sc.nextInt()-1;
					int dj = sc.nextInt();
					d[i][x] = dj;
				}
			}
			
			/*
			for(int i = n-1; i >= 0; i--){
				System.out.print("|");
				for(int j = 0; j < 10; j++){
					if(d[i][j] == -1)
						System.out.print("  ");
					else
						System.out.print(d[i][j] + " ");
					System.out.print("|");
				}
				System.out.println();
			}
			System.out.println();
			*/
			
			int[][][] dp = new int[n][10][m+1];
			for(int i = 0; i < n; i++){
				for(int j = 0; j < 10; j++){
					for(int k = 0; k <= m; k++){
						if(i == 0 && k == 0)
							dp[i][j][k] = 0;
						else
							dp[i][j][k] = INF;
					}
				}
			}
			
			for(int i = 0; i < n-1; i++){
				for(int from = 0; from < 10; from++){
					if(d[i][from] == -1) continue;
					
					for(int num = 0; num <= m; num++){
						if(dp[i][from][num] == INF) continue;
						
						for(int to = 0; to < 10; to++){
							if(d[i+1][to] == -1) continue;
							
							int cost = (d[i][from] + d[i+1][to]) * Math.abs(from - to);
							dp[i+1][to][num] = Math.min(dp[i+1][to][num], dp[i][from][num] + cost);
						}
						
						for(int to = 0; to < 10; to++){
							if(i+2 >= n) continue;
							if(d[i+2][to] == -1) continue;
							if(num+1 > m) continue;
							
							int cost = (d[i][from] + d[i+2][to]) * Math.abs(from - to);
							dp[i+2][to][num+1] = Math.min(dp[i+2][to][num+1], dp[i][from][num] + cost);
						}
					}
				}
			}
			
			int ans = INF;
			for(int i = 0; i < 10; i++){
				for(int j = 0; j <= m; j++){
					ans = Math.min(ans, dp[n-1][i][j]);
				}
			}
			
			System.out.println(ans);
		}
	}
}

class FastScanner {
    private InputStream in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    public FastScanner(InputStream in) {
		this.in = in;
	}
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() {
    	if (hasNextByte()) return buffer[ptr++];
    	else return -1;
    }
    private static boolean isPrintableChar(int c){
    	return 33 <= c && c <= 126;
    }
    public boolean hasNext() {
    	while(hasNextByte() && !isPrintableChar(buffer[ptr]))
    		ptr++; return hasNextByte();
    }
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() {
    	return Double.parseDouble(next());
    }
}

