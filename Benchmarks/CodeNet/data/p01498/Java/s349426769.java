import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int w = io.nextInt();
		int h = io.nextInt();
		Pair[] p = new Pair[n];
		for(int i=0;i<n;i++) {
			int x = io.nextInt() - 1;
			int y = io.nextInt() - 1;
			p[i] = new Pair(i, y, x);
		}
		int[] attr = new int[n];
		for(int i=0;i<n;i++) {
			if (p[i].i == 0)   attr[i] |= 1;
			if (p[i].i == h-1) attr[i] |= 2;
			if (p[i].j == 0)   attr[i] |= 4;
			if (p[i].j == w-1) attr[i] |= 8;
		}
		UnionFind uf = new UnionFind(attr);
		Arrays.sort(p, (p1,p2)->Integer.compare(p1.i, p2.i));
		for(int i=0;i<n-1;i++) {
			if (p[i].i == p[i+1].i) {
				uf.union(p[i].id, p[i+1].id);
			}
		}
		Arrays.sort(p, (p1,p2)->Integer.compare(p1.j, p2.j));
		for(int i=0;i<n-1;i++) {
			if (p[i].j == p[i+1].j) {
				uf.union(p[i].id, p[i+1].id);
			}
		}
		ArrayList<Integer> attrs = uf.attrs();
//		System.out.println(attrs);
		if (attrs.size() == 1) {
			System.out.println(n - 1);
		}else{
			int[] count = new int[4];
			for(int a: attrs) {
				for(int j=0;j<4;j++) {
					if ((a >> j & 1) == 1) {
						count[j]++;
					}
				}
			}
			int max = 0;
			for(int i=0;i<4;i++) {
				max = Math.max(max, count[i]);
			}
			int m = attrs.size();
			System.out.println(m - max + m - 1 + n - m);
		}
	}

}
class Pair {
	int id,i,j;

	public Pair(int id, int i, int j) {
		super();
		this.id = id;
		this.i = i;
		this.j = j;
	}
	
}
class UnionFind {
	int[] parent;
	int[] attr;
	public UnionFind(int[] attr) {
		this.attr = attr;
		int n = attr.length;
		parent = new int[n];
		Arrays.fill(parent, -1);
	}
	public boolean union(int x,int y) {
		x = root(x);
		y = root(y);
		if (x!=y) {
			if (parent[y] < parent[x]) {
				int tmp = y;
				y = x;
				x = tmp;
			}
			parent[x] += parent[y];
			parent[y] = x;
			attr[x] |= attr[y];
			return true;
		}
		return false;
	}
	public boolean isConnected(int x,int y) {
		return root(x)==root(y);
	}
	public int root(int x) {
		return parent[x] < 0 ? x : (parent[x] = root(parent[x]));
	}
	public int size(int x) {
		return -parent[root(x)];
	}
	public int attr(int x) {
		return attr[root(x)];
	}
	public ArrayList<Integer> attrs() {
		ArrayList<Integer> ret = new ArrayList<>();
		for(int i=0;i<parent.length;i++) {
			if (parent[i] < 0) {
				ret.add(attr[i]);
			}
		}
		return ret;
	}
	public String toString() {
		return Arrays.toString(parent);
	}
}
class IO extends PrintWriter {
	private final InputStream in;
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;
	
	public IO() { this(System.in);}
	public IO(InputStream source) { super(System.out); this.in = source;}
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
	private static boolean isNewLine(int c) { return c == '\n' || c == '\r';}
	public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
	public boolean hasNextLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++; return hasNextByte();}
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(isPrintableChar(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public char[] nextCharArray(int len) {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		char[] s = new char[len];
		int i = 0;
		int b = readByte();
		while(isPrintableChar(b)) {
			if (i == len) {
				throw new InputMismatchException();
			}
			s[i++] = (char) b;
			b = readByte();
		}
		return s;
	}
	public String nextLine() {
		if (!hasNextLine()) {
			throw new NoSuchElementException();
		}
		StringBuilder sb = new StringBuilder();
		int b = readByte();
		while(!isNewLine(b)) {
			sb.appendCodePoint(b);
			b = readByte();
		}
		return sb.toString();
	}
	public long nextLong() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
		if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) {
			throw new NumberFormatException();
		}
		return (int) nl;
	}
	public char nextChar() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		return (char) readByte();
	}
	public double nextDouble() { return Double.parseDouble(next());}
	public int[] nextIntArray(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] nextLongArray(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] nextDoubleArray(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void nextIntArrays(int[]... a) { for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] nextIntMatrix(int n,int m) { int[][] a = new int[n][]; for(int i=0;i<n;i++) a[i] = nextIntArray(m); return a;}
	public char[][] nextCharMap(int n,int m) { char[][] a = new char[n][]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void close() { super.close(); try {in.close();} catch (IOException e) {}}
}