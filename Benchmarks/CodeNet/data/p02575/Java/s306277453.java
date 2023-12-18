import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;

public class Main {
	static final long MOD=1000000007;//998244353;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int H=sc.nextInt();
		int W=sc.nextInt();
		LazysegTreemin lazysegTreemin=new LazysegTreemin(W);
		TreeMap<Integer, Integer> treeMap=new TreeMap<>();
		for (int i = 0; i < W; i++) {
			treeMap.put(i, i);
		}
		lazysegTreemin.update(0, W, 0, 0, 0, lazysegTreemin.size);
		for (int i = 0; i < H; i++) {
			int A=sc.nextInt()-1;
			int B=sc.nextInt()-1;
			Integer a=0;
			Integer l=treeMap.ceilingKey(A);
			Integer left=null;
			if (l!=null) {
				left=treeMap.get(l);
			}
			Integer right=null;
			while (true) {
				a=treeMap.ceilingKey(A);
				if (a==null){
					break;
				}
				if (treeMap.get(a)>B) {
					break;
				}
				right=treeMap.get(a);
				treeMap.remove(a);
			}
			if (l!=null&&left<=B) {
				lazysegTreemin.update(left, right+1, Long.MAX_VALUE, 0, 0, lazysegTreemin.size);
				if (B!=W-1&&!treeMap.containsKey(B+1)) {
					treeMap.put(B+1, right);
					lazysegTreemin.update(right, right+1, B+1-right, 0, 0, lazysegTreemin.size);
				}
			}
			long ans=lazysegTreemin.getmin(0, W, 0, 0, lazysegTreemin.size);
			if (ans>=Long.MAX_VALUE/3) {
				out.println(-1);
			}else {
				out.println(i+1+ans);
			}
		}
		out.flush();
 	}
	static class LazysegTreemin{
		int size;
		long[] dat;
		long[] lazy;
		long INF=Long.MAX_VALUE/2;
		public LazysegTreemin(int n) {
			int n_=1;
			while (n_<n) {
				n_*=2;
			}
			size=n_;
			dat=new long[2*n_-1];
			lazy=new long[2*n_-1];
			Arrays.fill(dat, INF);
			Arrays.fill(lazy, INF);
		}
		void propagate(int k,int l,int r) {
			if (lazy[k]!=INF) {
				dat[k] = lazy[k];
				if(r - l > 1) {
		            lazy[2*k+1] = lazy[k];
		            lazy[2*k+2] = lazy[k];
		        }
		        lazy[k] = INF;
			}
		}
		void update(int a,int b,long x,int k,int l,int r) {//a<=x<b加算　add(...,0,0,seg.size)で呼ぶ
			this.propagate(k,l,r);
			if (a<=l&&r<=b) {
				lazy[k]=x;
				this.propagate(k,l,r);
			}
			else if (l<b&&a<r) {//交わっている場合
				this.update(a, b, x, k*2+1,l,(l+r)/2);
				this.update(a, b, x, k*2+2, (l+r)/2, r);
				dat[k] = Math.min(dat[2*k+1],dat[2*k+2]);
			}
		}
		long getmin(int a,int b,int k,int l,int r) {//kが節点番号,l rがその節点番号の範囲
			if (r<=a||b<=l) {
				return INF;
			}
			this.propagate(k, l, r);
			if (a<=l&&r<=b) {
				return dat[k];
			}
			else {
				long vl=this.getmin(a, b, k*2+1,l,(l+r)/2);
				long vr=this.getmin(a, b, k*2+2, (l+r)/2, r);
				return (Math.min(vl, vr));
			}
		}//getsum(x, y, 0, 0, size)で呼ぶ
	}
	static class InputReader { 
		private InputStream in;
		private byte[] buffer = new byte[1024];
		private int curbuf;
		private int lenbuf;
		public InputReader(InputStream in) {
			this.in = in;
			this.curbuf = this.lenbuf = 0;
		}
 
		public boolean hasNextByte() {
			if (curbuf >= lenbuf) {
				curbuf = 0;
				try {
					lenbuf = in.read(buffer);
				} catch (IOException e) {
					throw new InputMismatchException();
				}
				if (lenbuf <= 0)
					return false;
			}
			return true;
		}
 
		private int readByte() {
			if (hasNextByte())
				return buffer[curbuf++];
			else
				return -1;
		}
 
		private boolean isSpaceChar(int c) {
			return !(c >= 33 && c <= 126);
		}
 
		private void skip() {
			while (hasNextByte() && isSpaceChar(buffer[curbuf]))
				curbuf++;
		}
 
		public boolean hasNext() {
			skip();
			return hasNextByte();
		}
 
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			StringBuilder sb = new StringBuilder();
			int b = readByte();
			while (!isSpaceChar(b)) {
				sb.appendCodePoint(b);
				b = readByte();
			}
			return sb.toString();
		}
 
		public int nextInt() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			int res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public long nextLong() {
			if (!hasNext())
				throw new NoSuchElementException();
			int c = readByte();
			while (isSpaceChar(c))
				c = readByte();
			boolean minus = false;
			if (c == '-') {
				minus = true;
				c = readByte();
			}
			long res = 0;
			do {
				if (c < '0' || c > '9')
					throw new InputMismatchException();
				res = res * 10 + c - '0';
				c = readByte();
			} while (!isSpaceChar(c));
			return (minus) ? -res : res;
		}
 
		public double nextDouble() {
			return Double.parseDouble(next());
		}
 
		public int[] nextIntArray(int n) {
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = nextInt();
			return a;
		}
 
		public long[] nextLongArray(int n) {
			long[] a = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = nextLong();
			return a;
		}
 
		public char[][] nextCharMap(int n, int m) {
			char[][] map = new char[n][m];
			for (int i = 0; i < n; i++)
				map[i] = next().toCharArray();
			return map;
		}
	}
	}
