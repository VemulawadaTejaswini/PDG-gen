import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.*;
public class Main {
	static final long MOD=1000000007;//998244353;
	static int[] par;
	public static void main(String[] args) {
		PrintWriter out = new PrintWriter(System.out);
		InputReader sc=new InputReader(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		Long[] A=new Long[N];
		boolean flag=false;
		for (int i = 0; i < A.length; i++) {
			A[i]=sc.nextLong();
			if (A[i]>0) {
				flag=true;
			}
		}
		Arrays.sort(A,Comparator.comparingLong(a->Math.abs(a)));
		if ((!flag&&K%2==1)||K==N) {
			long ans=1;
			for (int i = 0; i < K; i++) {
				ans*=A[i];
				ans%=MOD;
				if (ans<0) {
					ans+=MOD;
				}
			}
			System.out.println(ans);
		}else {
			long ans=1;
			int count=0;
			int pluslast=-1;
			int minuslast=-1;
			for (int i = A.length-1; i >=A.length-K; i--) {
				if (A[i]<0) {
					count++;
					minuslast=i;
				}
				if (A[i]>0) {
					pluslast=i;
				}
				ans*=A[i];
				ans%=MOD;
				if (ans<0) {
					ans+=MOD;
				}
			}
			if (count%2==0||A[A.length-K]==0) {
				System.out.println(ans);
				return;
			}
			int plusfst=-1;
			int minusfst=-1;
			for (int i = 0; i < A.length-K; i++) {
				if (A[i]>0) {
					plusfst=i;
				}else if (A[i]<0) {
					minusfst=i;
				}
			}
			int f=-1;//0が+のける,1が－のける
			if (pluslast!=-1&&minusfst!=-1) {
				if (minuslast!=1&&plusfst!=-1) {
					if (A[minusfst]*A[minusfst]<=A[plusfst]*A[pluslast]) {
						f=1;
					}else {
						f=0;
					}
				}else {
					f=0;
				}
			}else {
				if (minuslast!=1&&plusfst!=-1) {
					f=1;
				}else {
					System.out.print(0);
					return;
				}
			}
			ans=1;
			if (f==0) {
				for (int i = A.length-1; i >=A.length-K; i--) {
					if (i==pluslast) {
						continue;
					}
					ans*=A[i];
					ans%=MOD;
					if (ans<0) {
						ans+=MOD;
					}
				}
				ans=(ans*A[minusfst])%MOD;
				if (ans<0) {
					ans+=MOD;
				}
			}else {
				for (int i = A.length-1; i >=A.length-K; i--) {
					if (i==minuslast) {
						continue;
					}
					ans*=A[i];
					ans%=MOD;
					if (ans<0) {
						ans+=MOD;
					}
				}
				ans=(ans*A[plusfst])%MOD;
			}
			System.out.println(ans);
		}
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