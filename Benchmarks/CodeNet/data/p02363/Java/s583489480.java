import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		FastScanner sc = new FastScanner(in);

		int V = sc.nextInt();
		int E = sc.nextInt();
		
		long INF = 100100100100100L;
		
		long[][] g = new long[V][V];
		for(int i=0;i<V;i++) {
			Arrays.fill(g[i], INF);
			g[i][i] = 0;
		}
		for(int i=0;i<E;i++) {
			g[sc.nextInt()][sc.nextInt()] = sc.nextInt();
		}

		for(int k=0;k<V;k++) {
			for(int s=0;s<V;s++) {
				for(int e=0;e<V;e++) {
					if(g[s][k] != INF && g[k][e] != INF)
						g[s][e] = Math.min(g[s][e], g[s][k]+g[k][e]);
				}
			}
		}
	
		
		for(int i=0;i<V;i++) {
			if(g[i][i] < 0) {
				out.println("NEGATIVE CYCLE");
				return;
			}
		}
		
		for(int i=0;i<V;i++) {
			StringBuffer ans = new StringBuffer();
			for(int j=0;j<V;j++) {
				if(g[i][j] == INF) {
					ans.append("INF");
				}else {
					ans.append(g[i][j]);
				}
				ans.append(" ");
			}
			out.println(ans.substring(0, ans.length()-1));
		}
		
		
	}

	public static void main(String[] args) {
		new Main()._main(args);
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, int[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private String join(String delimiter, long[] a) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < a.length; i++) {
			sb.append(a[i]);
			sb.append(delimiter);
		}
		return sb.substring(0, Math.max(sb.length() - delimiter.length(), 0));
	}

	@SuppressWarnings("unused")
	private int max(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long max(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate > arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int min(int[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		int candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private long min(long[] arr) {
		if(arr == null || arr.length == 0) {
			throw new IllegalArgumentException(Arrays.toString(arr));
		}

		long candidate = arr[0];
		for(int i=1;i<arr.length;i++) {
			candidate = candidate < arr[i] ? candidate : arr[i];
		}
		return candidate;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray(Scanner sc, int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private long[] nextLongArray(Scanner sc, int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = sc.nextLong();
		}
		return result;
	}

	@SuppressWarnings("unused")
	private int[] nextIntArray1origin(Scanner sc, int n) {
		int[] result = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			result[i] = sc.nextInt();
		}
		return result;
	}
}
class FastScanner {
	private InputStream in;

	public FastScanner(InputStream source) {
		this.in = source;
	}
	public void close(){
	}
	
	private final int BUF_SIZE = 1024 * 4;
	byte[] buf = new byte[BUF_SIZE];
	int bufPtr = 0;
	int bufLen = 0;

	private int nextByte() {
		if (bufLen == -1) {
			throw new NoSuchElementException();
		}

		if (bufPtr >= bufLen) {
			try {
				bufLen = in.read(buf);
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
			bufPtr = 0;

			if (bufLen <= 0) {
				return -1;
			}
		}
		return buf[bufPtr++];
	}

	private static boolean isPrintableCharacter(int c) {
		return c >= 0x21 && c <= 0x7e;
	}

	public int nextInt() {
		long l = nextLong();
		if(l > Integer.MAX_VALUE || l < Integer.MIN_VALUE) {
			throw new NumberFormatException();
		}
		return (int)l;
	}

	public long nextLong() {
		long result = 0;
		int sign = 1;
		
		int c;
		while (!isPrintableCharacter(c = nextByte()))
			;
		
		if( c == '-' ) {
			sign = -1;
			c = nextByte();
		}else if(c== '+') {
			c = nextByte();
		}
		result = c - '0';
		
		while((isPrintableCharacter(c = nextByte()))) {
			result *= 10;
			result += c-'0';
		}
		
		return sign * result;
	}

	public double nextDouble() {
		return Double.parseDouble(next());
	}

	public String next() {
		StringBuilder sb = new StringBuilder();
		int b;

		while (!isPrintableCharacter(b = nextByte()))
			;
		do {
			sb.appendCodePoint(b);
		} while (isPrintableCharacter(b = nextByte()));

		return sb.toString();
	}

	public int[] nextIntArray(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = nextInt();
		}
		return result;
	}

	public int[] nextIntArray1origin(int n) {
		int[] result = new int[n + 1];
		for (int i = 0; i < n; i++) {
			result[i + 1] = nextInt();
		}
		return result;
	}

	public long[] nextLongArray(int n) {
		long[] result = new long[n];
		for (int i = 0; i < n; i++) {
			result[i] = nextLong();
		}
		return result;
	}

	public long[] nextLongArray1origin(int n) {
		long[] result = new long[n + 1];
		for (int i = 0; i < n; i++) {
			result[i + 1] = nextLong();
		}
		return result;
	}

	public char[] nextCharArray(int n) {
		char[] result = new char[n];
		for (int i = 0; i < n; i++) {
			result[i] = (char) nextByte();
		}
		return result;
	}

	public char[][] nextChar2DArray(int n, int m) {
		char[][] result = new char[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i][j] = (char) nextByte();
			}
		}
		return result;
	}

	public char[][] nextChar2DArray1origin(int n, int m) {
		char[][] result = new char[n + 1][m + 1];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				result[i + 1][j + 1] = (char) nextByte();
			}
		}
		return result;
	}

}

