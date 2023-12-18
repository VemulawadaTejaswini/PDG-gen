import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0) break;
			
			int[] h1 = new int[n+1];
			int[] r1 = new int[n+1];
			for(int i = 1; i <= n; i++){
				h1[i] = sc.nextInt();
				r1[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int[] h2 = new int[m+1];
			int[] r2 = new int[m+1];
			for(int i = 1; i <= m; i++){
				h2[i] = sc.nextInt();
				r2[i] = sc.nextInt();
			}
			
			int[][] dp = new int[n+1][m+1];
			for(int i = 0; i <= n; i++)
				dp[i][0] = i;
			for(int j = 0; j <= m; j++)
				dp[0][j] = j;
			
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m; j++){
					if(h1[i] > h2[j] && r1[i] > r2[j]){
						dp[i][j] = dp[i-1][j] + 1;
					}else if(h2[j] > h1[i] && r2[j] > r1[i]){
						dp[i][j] = dp[i][j-1] + 1;
					}else{
						dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
					}
				}
			}
			
			System.out.println(dp[n][m]);
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

