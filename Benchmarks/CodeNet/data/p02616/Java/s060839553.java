import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {	
	
	static char[][] map;

	public static void main(String[] args) throws Exception {
		
		//int N = scan.nextInt();
		//long L = scan.nextLong();
		//double D = scan.nextDouble();
		//char[] A = scan.next().toCharArray();
		
		int N = scan.nextInt();
		int K = scan.nextInt();
		
		long[] A = new long[N];
		int cnt_minus = 0;
		int cnt_zero = 0;
		
		for(int i=0; i<N; i++){
			A[i] = scan.nextLong();
			if(A[i]<0)cnt_minus++;
			if(A[i] == 0)cnt_zero++;
		}
		int cnt_plus = N - cnt_minus - cnt_zero;

		if(N-K < cnt_zero){
			out.println("0");
			out.flush();
			return;
		}

		long[] M = new long[cnt_minus];
		long[] P = new long[cnt_plus];

		int fetch_m = 0;
		int fetch_p = 0;
		
		for(int i=0; i<N; i++){
			if(A[i] < 0){
				M[fetch_m] = A[i];
				fetch_m++;
			}
			if(A[i] > 0){
				P[fetch_p] = A[i];
				fetch_p++;
			}
		}

		boolean is_minus = false;
		if(K%2 == 1 && cnt_minus==N)is_minus = true;

		Arrays.sort(M);
		Arrays.sort(P);

		double max_double = 0.0;
		long max_mod = 1;
		if(!is_minus){
			int max_use_minus = Math.min(cnt_minus, K);
			int min_use_minus = Math.max(K-cnt_plus,0);


			for(int i=min_use_minus; i<=max_use_minus; i+=2){
				double tmp_double = 0.0;
				long tmp_mod = 1;
				for(int m=0; m<i; m++){
					tmp_double  += Math.log10(-M[m]);
					tmp_mod *= M[m];
					tmp_mod %= MOD;
				}
				for(int p=cnt_plus-1; p>=cnt_plus-(K-i); p--){
					tmp_double  += Math.log10(P[p]);
					tmp_mod *= P[p];
					tmp_mod %= MOD;
				}
				if(max_double < tmp_double){
					max_double = tmp_double;
					max_mod = tmp_mod;
				}
			}
		}else{
			for(int i=cnt_minus-1; i>=cnt_minus-K; i--){
				max_mod *= M[i];
				max_mod %= MOD;
			}
		}
		

		long ans = 0;

		max_mod += MOD;
		max_mod %= MOD;
		
		out.println(max_mod);
		
		
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
