import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.*;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;

import javax.sound.midi.MidiMessage;
 
public class Main {
	  static int MAX = 510000;
		static long[] fac=new long[MAX];
		static long[] finv=new long[MAX];
		static long[] inv=new long[MAX];
		static long MOD=(long) (Math.pow(10, 9)+7);
		static boolean[] visited;
	public static void main(String[] args){
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int q=sc.nextInt();
		segTreemin segtree=new segTreemin(N);
		for (int i = 0; i < q; i++) {
			int c=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			if (c==0) {
				segtree.update(x, (long)y);
			}
			else {
				long ans=segtree.getmin(x, y+1, 0, 0, segtree.size);
				if (ans==Long.MAX_VALUE/2) {
					ans=Integer.MAX_VALUE;
				}
				out.println(ans);
			}
		}
		out.flush();
	}
	static class segTreemin{
		int size;
		long[] dat;
		long INF=Long.MAX_VALUE/2;
		public segTreemin(int n) {
			int n_=1;
			while (n_<n) {
				n_*=2;
			}
			size=n_;
			dat=new long[2*n_-1];
			Arrays.fill(dat, INF);
		}
		void update(int k,long a) {
			k += size-1;
			dat[k]=a;
			while (k>0) {
				k=(k-1)/2;//親
				dat[k]=Math.min(dat[k*2+1], dat[k*2+2]);
			}
		}
		long getmin(int a,int b,int k,int l,int r) {//kが節点番号,l rがその節点番号の範囲
			if (r<=a||b<=l) {
				return INF;
			}
			if (a<=l&&r<=b) {
				return dat[k];
			}
			else {
				long vl=this.getmin(a, b, k*2+1,l,(l+r)/2);
				long vr=this.getmin(a, b, k*2+2, (l+r)/2, r);
				return Math.min(vl, vr);
			}
		}//getmin(x, y, 0, 0, size)で呼ぶ
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

