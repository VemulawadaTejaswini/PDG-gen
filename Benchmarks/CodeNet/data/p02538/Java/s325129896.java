import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
import java.util.stream.IntStream;

public class Main {
	static final long MOD = 998244353L;
	
	class SegmentTree {
		//遅延評価用の定数
		private static final long INF = -1;
		
		//10^(L-1)+.....+10^(R-1)、data[i] = BASE[i] * lazy[i]となる
		final long[] BASE;
		
		//データと遅延評価
		long[] data, lazy;
		
		//葉の長さ
		int len;
		
		public SegmentTree(int n) {
			//葉の個数を決める
			int x = 1;
			while(n > x) x <<= 1;
			len = x;
			
			//全体のノード数は(葉のノード数)*2-1
			data = new long[2*x-1];
			lazy = new long[2*x-1];
			BASE = new long[2*x-1];
			
			//定数で埋める
			Arrays.fill(lazy, INF);
			
			//葉を1,10,100...,10^(n-1)で埋める
			long t = 1L;
			for (int i = 0; i < n; i++) {
				BASE[i+len-1] = data[i+len-1] = t;
				t = t*10L%MOD;
			}
			
			//セグメント木の構築（加算）
			for (int i = len-2; i >= 0; i--) {
				BASE[i] = data[i] = (data[2*i+1] + data[2*i+2]) % MOD;
			}
		}
		
		//遅延評価の解決
		private void evaluate(int i) {
			//単位元なら何もしない
			if (lazy[i] == INF) return;
			
			//葉でなければ子にも遅延評価を伝搬させる
			if (i < len-1) {
				lazy[i*2+1] = lazy[i];
				lazy[i*2+2] = lazy[i];
			}
			
			data[i] = BASE[i] * lazy[i] % MOD;
			lazy[i] = INF;
		}
		
		long get() {
			return get(0, len, 0, 0, len);
		}
		
		private long get(int L, int R, int i, int l , int r) {
			evaluate(i);
			
			if(r <= L || R <= l) {
				return 0;
			} else if ( L <= l && r <= R ) {
				return data[i];
			} else {
				long vl = get(L, R, i*2+1, l, (l+r)/2);
				long vr = get(L, R, i*2+2, (l+r)/2, r);
				return (vl+vr)%MOD;
			}
		}
		
		//[left, right)の区間をvalにする．
		void update(int left, int right, int val) {
			update(left, right, val, 0, 0, len);
		}
		
		private void update(final int L, final int R, final int V, int i, int l, int r) {
			//先に値を評価する
			evaluate(i);
			
			if (L <= l && r <= R) {
				//更新範囲の内部である場合更新
				lazy[i] = V;
				evaluate(i);
			} else if (L < r && l < R) {
				//更新範囲が一部被っている場合は再帰
				update(L, R, V, i*2+1, l, (l+r)/2);
				update(L, R, V, i*2+2, (l+r)/2, r);
				
				data[i] = (data[i*2+1]+data[i*2+2])%MOD;
			}
		}
		
	}
	
	public Main() {
		FastScanner scanner = new FastScanner();
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		
		SegmentTree SegmentTree = new SegmentTree(N);
		
		PrintWriter PW = new PrintWriter(System.out);
		
		IntStream.range(0, Q).forEach( i -> {
			int L = scanner.nextInt();
			int R = scanner.nextInt();
			int D = scanner.nextInt();
			
			SegmentTree.update(N-R, N-L+1, D);
			PW.println(SegmentTree.get());
		});
		
		PW.flush();
		PW.close();
	}
	
	public static void main(String[] args) {
		new Main();
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
		if (hasNextByte()) return buffer[ptr++];
		else return -1;
	}
	
	private static boolean isPrintableChar(int c) {
		return 33 <= c && c <= 126;
	}
	
	public boolean hasNext() {
		while (hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;
		return hasNextByte();
	}
	
	public String next() {
		if (!hasNext()) throw new NoSuchElementException();
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while (isPrintableChar(b)) {
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
		return (int) nl;
	}
	
	public double nextDouble() {
		return Double.parseDouble(next());
	}
}
