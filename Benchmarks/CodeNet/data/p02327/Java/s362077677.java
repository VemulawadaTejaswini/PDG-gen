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
        
        int h = sc.nextInt();
        int w = sc.nextInt();
        boolean[][] g = new boolean[h][w];
        
        for(int i=0;i<h;i++){
        	for(int j=0;j<w;j++){
        		if(sc.nextInt() == 0){
        			g[i][j] = true;
        		}
        	}
        }
        
        long e = largestRectangle(g);
        
        System.out.println(e);   
    }
    
	//ヒストグラム内で作れる最大の長方形の面積
	static long largestRectangle(int[] h){
		
		class Rect{
			int leftid;
			int height;
			public Rect(int leftid, int height){
				this.leftid = leftid;
				this.height = height;
			}
		}
		
		int N = h.length;
		long max = 0;
		
		ArrayDeque<Rect> q = new ArrayDeque<>();	//未完成の長方形リスト
		
		for(int i=0;i<N;i++){
			if(q.isEmpty() || q.peekFirst().height < h[i]){
				q.offerFirst(new Rect(i,h[i]));
			}
			else if(q.peekFirst().height > h[i]){
				int leftid = i;
				while(!q.isEmpty() && q.peekFirst().height >= h[i]){
					Rect r = q.pollFirst();
					leftid = r.leftid;
					max = Math.max(max, (long)(i - r.leftid) * (long)r.height);
				}
				q.offerFirst(new Rect(leftid,h[i]));
			}
		}
		
		while(!q.isEmpty()){
			Rect r = q.pollFirst();
			max = Math.max(max, (long)(N - r.leftid) * (long)r.height);
		}
		
		return max;
	}
	
	//trueのみを用いて作れる最大の長方形の面積
	static long largestRectangle(boolean[][] g){
		int h = g.length;
		int w = g[0].length;
		int[][] sumh = new int[h][w]; //上方向に続くtrueの数
		
		for(int j=0;j<w;j++){
			if(g[0][j]){
				sumh[0][j] = 1;
			}
		}
		
		for(int i=1;i<h;i++){
			for(int j=0;j<w;j++){
				if(g[i][j]){
					sumh[i][j] = sumh[i-1][j] + 1;
				}
			}
		}
		
		//ヒストグラムの場合を利用
		long max = 0;
		for(int i=0;i<h;i++){
			max = Math.max(max, largestRectangle(sumh[i]));
		}
		
		return max;
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
