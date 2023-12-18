import java.util.Map.Entry;
import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FastScanner sc = new FastScanner(System.in);
		
		while(true){
			int X = sc.nextInt();
			int Y = sc.nextInt();
			int Z = sc.nextInt();
			
			if(X == 0 && Y == 0 && Z == 0) break;
			
			int[] V = new int[X+1];
			for(int i = 1; i <= X; i++)
				V[i] = sc.nextInt();
			int[][] EA = new int[Y+1][2];
			for(int i = 0; i < Z; i++){
				int N = sc.nextInt();
				int E = sc.nextInt();
				int A = sc.nextInt();
				EA[N][0] = E;
				EA[N][1] = A;
			}
			
			double[][] dp = new double[Y+1][5001];
			dp[0][0] = 1.0;
			
			for(int i = 0; i < Y; i++){
				for(int m = 0; m <= 5000; m++){
					if(dp[i][m] == 0) continue;
					for(int j = 1; j <= X; j++){
						int nextY = Math.min(i + V[j], Y);
						int E = EA[nextY][0];
						int A = EA[nextY][1];
						
						if(E == 1){
							nextY = Math.min(nextY + A, Y);
							dp[nextY][m] += dp[i][m] / X;
						}else if(E == 2){
							dp[nextY][m+A] += dp[i][m] / X;
						}else if(E == 3){
							dp[nextY][Math.max(m-A, 0)] += dp[i][m] / X;
						}else{
							dp[nextY][m] += dp[i][m] / X;
						}
					}
				}
			}
			
			double ans = 0;
			for(int i = 0; i <= 5000; i++) ans += i * dp[Y][i];
			System.out.println((int)Math.floor(ans));
		}
	}
}


class Queue{
	int n;
	int p, q, r;
	public Queue(int n, int p, int q, int r){
		this.n = n;
		this.p = p;
		this.q = q;
		this.r = r;
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

