import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		if (n >= (101 * 101) / 2 + 1) {
			System.out.println(0);
			return;
		}
		Vector2[][] v = new Vector2[n][2];
		for(int i=0;i<n;i++) {
			for(int j=0;j<2;j++) {
				v[i][j] = new Vector2(io.nextInt(), io.nextInt());
			}
		}
		double min = Double.POSITIVE_INFINITY;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if (i == j) {
					continue;
				}
				min = Math.min(min, Vector2.distSegmentToSegment(v[i], v[j]));
			}
		}
		System.out.println(min);

	}

}
class Vector2 {
	int x = 0;
	int y = 0;
	public Vector2(int x,int y) {
		this.x = x;
		this.y = y;
	}
	public int dot(Vector2 v) {
		return this.x*v.x+this.y*v.y;
	}
	public int cross(Vector2 v) {
		return this.x*v.y-this.y*v.x;
	}
	public Vector2 add(Vector2 v) {
		return new Vector2(this.x+v.x,this.y+v.y);
	}
	public Vector2 subtract(Vector2 v) {
		return new Vector2(this.x-v.x,this.y-v.y);
	}
	public Vector2 multiply(int k) {
		return new Vector2(k*this.x,k*this.y);
	}
	public long normSquare() {
		return x * x + y * y;
	}
	public double norm() {
		return Math.sqrt(normSquare());
	}
	public long distSquare(Vector2 v) {
		return this.subtract(v).normSquare();
	}
	public double dist(Vector2 v) {
		return this.subtract(v).norm();
	}

	public static boolean intersects(Vector2 p0,Vector2 p1,Vector2 p2,Vector2 p3) {
		Vector2 v1 = p1.subtract(p0);
		Vector2 v2 = p3.subtract(p2);
		Vector2 v = p2.subtract(p0);
		Vector2 v_ = p2.subtract(p1);
		int a = v1.cross(v2);
		if(a==0) {
			return v.cross(v_) == 0 && (v.dot(v_) <= 0 || p0.subtract(p2).dot(p0.subtract(p3)) <= 0);
		}else{
			int a1 = -v1.cross(v);
			int a2 = -v2.cross(v);
			if (a>0) {
				return (0<=a1&&a1<=a&&0<=a2&&a2<=a);
			}else{
				return (a<=a1&&a1<=0&&a<=a2&&a2<=0);
			}
		}
	}
	public static double distSegmentToPoint(Vector2[] segment, Vector2 p) {
		Vector2 v = segment[1].subtract(segment[0]);
		Vector2 v1 = p.subtract(segment[0]);
		Vector2 v2 = p.subtract(segment[1]);
		if (v.dot(v1) * v.dot(v2) <= 0) {
			return Math.abs(v.cross(v1)) / v.norm();
		}else{
			return Math.min(v1.norm(),v2.norm());
		}
	}
	public static double distSegmentToSegment(Vector2[] s1,Vector2[] s2) {
		if (intersects(s1[0], s1[1], s2[0], s2[1])) {
			return 0;
		}
		double min = Double.POSITIVE_INFINITY;
		min = Math.min(min, distSegmentToPoint(s1, s2[0]));
		min = Math.min(min, distSegmentToPoint(s1, s2[1]));
		min = Math.min(min, distSegmentToPoint(s2, s1[0]));
		min = Math.min(min, distSegmentToPoint(s2, s1[1]));
		return min;
	}
	public String toString() {
		return this.x + " " + this.y;
	}
}

class IO {
	private final InputStream in;
	private final PrintWriter out = new PrintWriter(System.out);
	private final byte[] buffer = new byte[1024];
	private int ptr = 0;
	private int buflen = 0;

	public IO() { this(System.in);}
	public IO(InputStream source) { this.in = source;}
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
	private void skipUnprintable() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++;}
	private void skipNewLine() { while(hasNextByte() && isNewLine(buffer[ptr])) ptr++;}
	public boolean hasNext() { skipUnprintable(); return hasNextByte();}
	public boolean hasNextLine() { skipNewLine(); return hasNextByte();}
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
		char[] s = new char[len];
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
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
	public int[] arrayInt(int n) { int[] a = new int[n]; for(int i=0;i<n;i++) a[i] = nextInt(); return a;}
	public long[] arrayLong(int n) { long[] a = new long[n]; for(int i=0;i<n;i++) a[i] = nextLong(); return a;}
	public double[] arrayDouble(int n) { double[] a = new double[n]; for(int i=0;i<n;i++) a[i] = nextDouble(); return a;}
	public void arrayInt(int[]... a) {for(int i=0;i<a[0].length;i++) for(int j=0;j<a.length;j++) a[j][i] = nextInt();}
	public int[][] matrixInt(int n,int m) { int[][] a = new int[n][m]; for(int i=0;i<n;i++) a[i] = arrayInt(m); return a;}
	public char[][] charMap(int n,int m) { char[][] a = new char[n][m]; for(int i=0;i<n;i++) a[i] = nextCharArray(m); return a;}
	public void println(long x) { out.println(x);}
	public void println(double x) { out.println(x);}
	public void println(String s) { out.println(s);}
	public void println() { out.println(); }
	public void print(long x) { out.print(x); }
	public void print(double x) { out.print(x); }
	public void print(String s) { out.print(s); }
	public void print(char c) {out.print(c);}
	public void flush() {out.flush(); }
}