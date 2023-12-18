import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int[] a = new int[n];
		int k = -1;
    	for (int i = 0; i < n; i++) {
    		a[i] = sc.nextInt();
    		if (a[i] > k ) {
    			k = a[i];
    		}
    	}

    	// counting sort
    	int[] b = new int[n];
    	int[] c = new int[k + 1];
    	for (int i = 0; i < k + 1; i++) {
    		c[i] = 0;
    	}
    	for (int j = 0; j < n; j++) {
    		c[a[j]]++;
    	}
    	for (int i = 1; i <= k; i++) {
    		c[i] += c[i - 1];
    	}
    	for (int j = n - 1; j >= 0; j--) {
    		b[c[a[j]] - 1] = a[j];
    		c[a[j]]--;
    	}

    	pr.printArray(b);

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
		OutputStreamWriter osw;
		BufferedWriter bw;
		StringBuffer strbuf;
		int bufSize;
		String CR;

		Printer(OutputStream out) {
			osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);
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

		void printSP(int n) {
			strbuf.append(n);
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

			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		private void flashStringBuffer() {
			if (strbuf.length() > 0) {
				try {
					bw.write(strbuf.toString());
				} catch (IOException e) {
					e.printStackTrace();
				}
				strbuf.setLength(0);
			}
		}
		
		private void checkStringBuffer() {
			if (strbuf.length() > bufSize) {
				flashStringBuffer();
			}
		}
	}
}