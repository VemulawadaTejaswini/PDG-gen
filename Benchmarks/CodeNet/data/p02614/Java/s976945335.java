import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

import jdk.nashorn.internal.runtime.regexp.joni.WarnCallback;
 

public class Main {	
	
	static char[][] map;

	public static void main(String[] args) throws Exception {
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//double D = scan.nextDouble();
		//char[] A = scan.next().toCharArray();
		
		int  H = scan.nextInt();
		int  W = scan.nextInt();
		int  K = scan.nextInt();
		map = new char[H][W];
		for(int h=0; h<H; h++){
			char[] A = scan.next().toCharArray();
			map[h] = A;
		}

		int ans = 0;

		for(int h=0; h<(1<<H);h++){
			for(int w=0; w<(1<<W);w++){
				char[][] tmp = new char[H][W];
				for(int i=0; i<H; i++){
					for(int j=0; j<W; j++){
						tmp[i][j] = map[i][j];
					}
				}

				for(int I=0; I<H; I++){
					if(((h>>I)&1) == 1){
						for(int j=0;j<W;j++){
							tmp[I][j] = '.';
						}
					}
				}
				for(int I=0; I<W; I++){
					if(((w>>I)&1) == 1){
						for(int j=0;j<H;j++){
							tmp[j][I] = '.';
						}
					}
				}

				int cnt = 0;
				for(int i=0; i<H; i++){
					for(int j=0; j<W; j++){
						if(tmp[i][j] == '#')cnt++;
					}
				}

				if(cnt == K)ans++;

			}
		}
	
		out.println(ans);
		
		
		out.flush();
	}


	static FastScanner scan = new FastScanner();
	static PrintWriter out = new PrintWriter(System.out);			 
	static long MOD = 1_000_000_007;

	static int[] dx = {1,-1,0,0};
	static int[] dy = {0,0,1,-1};
	static int[] dx8 = {1,-1,0,0,1,1,-1,-1};
	static int[] dy8 = {0,0,1,-1,1,-1,1,-1};

	//GCD最大公約数を返す
	static long gcd(long a, long b){
		if(b == 0) return a;
		return gcd(b, a%b);
	}

	//aとbの最小公倍数を返す
	static long lcm (long a, long b) {
		return ((a/gcd(a,b))*b);
	}
	
	//入力
	//https://qiita.com/p_shiki37/items/a0f6aac33bf60f5f65e4
	static class FastScanner {
	    private final InputStream in = System.in;
	    private final byte[] buffer = new byte[1024];
	    private int ptr = 0;
	    private int buflen = 0;
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
	    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
	    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
	    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
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
	    public double nextDouble() { return Double.parseDouble(next());}
	}
}
