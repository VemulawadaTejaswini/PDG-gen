import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {
	static int n;
	static int[][] a;
	static int[] d;
	static int[] f;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		n = sc.nextInt();
		a = new int[n][n];
		d = new int[n];
		f = new int[n];

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				a[u - 1][sc.nextInt() - 1] = 1;
			}
		}

		int clock = 0;
		for (int i = 0; i < n; i++) {
			if (f[i] == 0) {
				clock = dfs(i + 1, clock + 1);
			}
		}

		for (int i = 0; i < n; i++) {
			pr.print(i + 1);
			pr.print(" ");
			pr.print(d[i]);
			pr.print(" ");
			pr.print(f[i]);
			pr.println("");
		}

		pr.close();
		sc.close();
	}
	
	private static int dfs(int v, int clock) {
		if (d[v - 1] == 0) {
			d[v - 1] = clock;
			for (int i = 0; i < n; i++) {
				if (a[v - 1][i] != 0) {
					if (d[i] != 0) {
						continue;
					} else if (i + 1 == v) {
						continue;
					} else {
						clock = dfs(i + 1, clock + 1);
					}
				}
			}
			clock++;
			f[v - 1] = clock;
			return clock;
		} else {
			if (f[v - 1] == 0) {
				clock++;
				f[v - 1] = clock;
				return clock;
			} else {
				return clock;
			}
		}
	}
	
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;
		
		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}
		
		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return st.sval;
		}
		
		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}
			
			return (int)st.nval;
		}

		void close() {
		}
	}
	
	private static class Printer {
		PrintStream out;
		StringBuffer strbuf;
		int bufSize;
		final String CR;

		Printer(PrintStream out) {
			this.out = out;
			strbuf = new StringBuffer();
			bufSize = 64 * 1024;
			CR = System.getProperty("line.separator");
		}

		void println(String str) {
			strbuf.append(str);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(String str) {
			strbuf.append(str);
			checkStringBuffer();
		}

		void println(int n) {
			strbuf.append(n);
			strbuf.append(CR);
			checkStringBuffer();
		}

		void print(int n) {
			strbuf.append(n);
			checkStringBuffer();
		}

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				checkStringBuffer();
				strbuf.append(array[i]);
				strbuf.append(" ");
			}
			strbuf.delete(strbuf.length() - 1, strbuf.length());
			strbuf.append(CR);
		}

		void close() {
			flashStringBuffer();
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				out.print(strbuf);
				strbuf.setLength(0);
			}
		}
	}
}