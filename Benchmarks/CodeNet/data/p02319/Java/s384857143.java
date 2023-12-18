import java.io.IOException;
import java.io.InputStream;
import java.util.*;
import java.math.BigInteger;
 
public class Main implements Runnable {
	
	static int mod = 1000000007;
	
    public static void main(String[] args) {
    	new Thread(null, new Main(), "", 1024 * 1024 * 1024).start();
    }
    
    public void run() {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int W = sc.nextInt();
        int[] v = new int[n];
        int[] w = new int[n];
        
        for(int i=0;i<n;i++){
        	v[i] = sc.nextInt();
        	w[i] = sc.nextInt();
        }
        
        System.out.println(highCapKnapsack(w,v,W));
        
    }

	static long highCapKnapsack(int[] weight, int[] value, long capacity){
		int N = weight.length;
		int valuesum = 0;
		for(int i=0;i<N;i++){
			valuesum += value[i];
		}
		long[][] dp = new long[2][valuesum+1];	//i番目までの品物を使って価値jを達成するための最小の必要容量
		for(int i=0;i<2;i++){
			Arrays.fill(dp[i], Long.MAX_VALUE/2);
		}
		dp[0][0] = 0;
		
		for(int i=0;i<N;i++){
			for(int j=0;j<=valuesum;j++){
				dp[(i+1)%2][j] = Math.min(dp[(i+1)%2][j], dp[i%2][j]);
                if(j+value[i] <= valuesum){
                    dp[(i+1)%2][j+value[i]] = Math.min(dp[(i+1)%2][j+value[i]], dp[i%2][j] + weight[i]);
                }
			}
		}

		for(int i=valuesum;i>0;i--){
			if(dp[N%2][i]<=capacity){
				return i;
			}
		}
		
		return 0;
	}
	
}

class FastScanner {
	private final InputStream in = System.in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	private boolean hasNextByte() {
		if (ptr < buflen) {
			return true;
		} else {
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
		if (hasNextByte())
			return buffer[ptr++];
		else
			return -1;
	}
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr]))
			ptr++;
		return hasNextByte();
	}
	public String next() {
		if (!hasNext())
			throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext())
			throw new NoSuchElementException();
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
		while (true) {
			if ('0' <= b && b <= '9') {
				n *= 10;
				n += b - '0';
			} else if (b == -1 || !isPrintableChar(b)) {
				return minus ? -n : n;
			} else {
				throw new NumberFormatException();
			}
			b = readByte();
		}
	}
	public int nextInt() {
		long nl = nextLong();
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE)
			throw new NumberFormatException();
		return (int) nl;
	}
	public int[] nextIntArray(int n){
		int[] a = new int[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public Integer[] nextIntegerArray(int n){
		Integer[] a = new Integer[n];
		for(int i=0;i<n;i++){
			a[i] = nextInt();
		}
		return a;
	}
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
