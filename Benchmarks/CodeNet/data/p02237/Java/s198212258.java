import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int[][] a = new int[n][n];

		for (int i = 0; i < n; i++) {
			int u = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				a[u - 1][sc.nextInt() - 1] = 1;
			}
		}
		
		for (int i = 0; i < n; i++) {
			pr.printArray(a[i]);
		}

		pr.close();
		sc.close();
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