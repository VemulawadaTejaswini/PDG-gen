import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class Main {

	public static void main(String[] args) {
		IO io = new IO();
		int n = io.nextInt();
		int[] o = new int[n];
		int[] y = new int[n];
		io.arrayInt(o,y);
		BigInteger ans = BigInteger.ZERO;
		BigInteger sum = BigInteger.ZERO;
		Fraction mul = Fraction.ONE;
		for(int i=n-1;i>=0;i--) {
			switch (o[i]) {
			case 3:
				ans = ans.add(new Fraction(sum,BigInteger.ONE).multiply(mul).asBigInteger());
				sum = BigInteger.ZERO;
				mul = mul.multiply(new Fraction(y[i]));
				break;
			case 4:
				ans = ans.add(new Fraction(sum,BigInteger.ONE).multiply(mul).asBigInteger());
				sum = BigInteger.ZERO;
				mul = mul.divide(new Fraction(y[i]));
				break;
			case 1:
				sum = sum.add(BigInteger.valueOf(y[i]));
				break;
			case 2:
				sum = sum.subtract(BigInteger.valueOf(y[i]));
				break;
			}
//			System.out.println(ans + "," + sum + "," + mul);
		}
		ans = ans.add(new Fraction(sum,BigInteger.ONE).multiply(mul).asBigInteger());
		System.out.println(ans);
	}

}
class Fraction {
	public static Fraction ONE = new Fraction(BigInteger.ONE, BigInteger.ONE);
	public static Fraction ZERO = new Fraction(BigInteger.ZERO, BigInteger.ONE);
	BigInteger numerator;
	BigInteger denominator;
	public Fraction(int n) {
		this(BigInteger.valueOf(n), BigInteger.ONE);
	}
	public Fraction(String s) {
		this(new BigInteger(s),BigInteger.ONE);
	}
	public Fraction(BigInteger numerator,BigInteger denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	public static Fraction reduction(BigInteger numerator, BigInteger denominator) {
		int signum = numerator.signum();
		if (signum == 0) {
			return ZERO;
		}
		BigInteger gcd = gcd(numerator,denominator);
		return new Fraction(numerator.divide(gcd), denominator.divide(gcd));
	}

	public Fraction add(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator).add(denominator.multiply(f.numerator));
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction subtract(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator).subtract(denominator.multiply(f.numerator));
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction multiply(Fraction f) {
		BigInteger n = numerator.multiply(f.numerator);
		BigInteger d = denominator.multiply(f.denominator);
		return reduction(n, d);
	}
	public Fraction divide(Fraction f) {
		BigInteger n = numerator.multiply(f.denominator);
		BigInteger d = denominator.multiply(f.numerator);
		return reduction(n, d);
	}
	public int intValue() {
		return numerator.divide(denominator).intValue();
	}
	public BigInteger asBigInteger() {
		return numerator.divide(denominator);
	}
	private static BigInteger gcd(BigInteger a,BigInteger b) {
		int sgn = 1;
		if (a.signum() < 0) {
			sgn *= -1;
			a = a.negate();
		}
		if (b.signum() < 0) {
			sgn *= -1;
			b = b.negate();
		}
		while(!b.equals(BigInteger.ZERO)) {
			BigInteger r = a.remainder(b);
			a = b;
			b = r;
		}
		if (sgn < 0) {
			a = a.negate();
		}
		return a;
	}
	public String toString() {
		return numerator + "/" + denominator;
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