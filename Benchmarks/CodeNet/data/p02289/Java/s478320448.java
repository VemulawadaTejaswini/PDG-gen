import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		Printer pr = new Printer(System.out);

		Heap heap = new Heap();
		for (; true; ) {
			String cmd = sc.next();
			if (cmd.equals("insert")) {
				heap.maxHeapInsert(sc.nextInt());
			} else if (cmd.equals("extract")) {
				int ret = heap.heapExtractMax();
				pr.println(ret);
			} else if (cmd.equals("end")) {
				break;
			}
		}
		
    	pr.close();
        sc.close();
	}

	private static class Heap {
		ArrayList<Integer> a;
		int heap_size;
		
		Heap() {
			a = new ArrayList<Integer>();
			heap_size = a.size();
		}

		int left(int i) {
			return i * 2;
		}

		int right(int i) {
			return i * 2 + 1;
		}
		
		int parent(int i) {
			return i / 2;
		}

		void maxHeapInsert(int key) {
			a.add(Integer.MIN_VALUE);
			heap_size = a.size();
			heapIncreaseKey(heap_size, key);
		}

		void heapIncreaseKey(int i, int key) {
			if (key < a.get(i - 1)) {
				System.out.println("Error");
			}
			a.set(i - 1, key);
			for (; i > 1 && a.get(parent(i) - 1) < a.get(i - 1); ) {
				int temp = a.get(i - 1);
				a.set(i - 1, a.get(parent(i) - 1));
				a.set(parent(i) - 1, temp);
				i = parent(i);
			}
		}
		
		int heapExtractMax() {
			if (heap_size < 1) {
				System.out.println("Error heap under fllow");
				return Integer.MIN_VALUE;
			}
			int max = a.get(1 - 1);
			a.set(1 - 1, a.get(heap_size - 1));
			heap_size--;
			maxHeapify(1);
			return max;
		}
		
		void maxHeapify(int i) {
			int l = left(i);
			int r = right(i);
			int largest;
			if (l <= heap_size && a.get(l - 1) > a.get(i - 1)) {
				largest = l;
			} else {
				largest = i;
			}
			if (r <= heap_size && a.get(r - 1) > a.get(largest - 1)) {
				largest = r;
			}
			if (largest != i) {
				int temp = a.get(i - 1);
				a.set(i - 1, a.get(largest - 1));
				a.set(largest - 1, temp);
				maxHeapify(largest);
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