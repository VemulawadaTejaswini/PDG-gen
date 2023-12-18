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

	static int count;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Printer pr = new Printer(System.out);

		int n = sc.nextInt();
		int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = sc.nextInt();
    	}

    	count = 0;
    	mergeSort(s, 0, n);

    	pr.printArray(s);
    	pr.println(count);

    	pr.close();
    	sc.close();
	}
	
	public static void mergeSort(int[] a, int left, int right) {
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			mergeSort(a, left, mid);
			mergeSort(a, mid, right);
			merge(a, left, mid, right);
		}
	}

	public static void merge(int[] a, int left, int mid, int right) {
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1];
		int[] r = new int[n2];
		for (int i = 0; i < n1; i++) {
			l[i] = a[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = a[mid + i];
		}
		for (int i = 0, j = 0, k = left; k < right; k++) {
			count++;
			if (i < n1 && j < n2) {
				if (l[i] <= r[j]) {
					a[k] = l[i];
					i++;
				} else {
					a[k] = r[j];
					j++;
				}
			} else {
				if (j >= n2) {
					a[k] = l[i];
					i++;
				} else if (i >= n1) {
					a[k] = r[j];
					j++;
				} else {
					// Error
					count = -99999;
				}
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