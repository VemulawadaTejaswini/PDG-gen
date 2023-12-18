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
		Card[] src = new Card[n];
		Card[] cards = new Card[n];
		
    	for (int i = 0; i < n; i++) {
    		src[i] = new Card(sc.next().charAt(0), sc.nextInt());
    		cards[i] = src[i];
    	}
    	
    	quickSort(cards, 0, n -1);

    	if (checkStable(src, cards)) {
    		System.out.println("Stable");
    	} else {
    		System.out.println("Not stable");
    	}

    	for (int i = 0; i < n; i++) {
    		pr.print(cards[i].suit);
    		pr.printSP();
    		pr.println(cards[i].rank);
    	}

    	pr.close();
        sc.close();
	}
	
	static void quickSort(Card[] a, int p, int r) {
		if (p < r) {
			int q = partition(a, p ,r);
			quickSort(a, p, q - 1);
			quickSort(a, q + 1, r);
		}
	}
	
	static int partition(Card[] a, int p, int r) {
		int x = a[r].rank;
		int i = p - 1;
		for (int j = p; j < r; j++) {
			if (a[j].rank <= x) {
				i++;
				Card temp = a[i];
				a[i] = a[j];
				a[j] = temp;
			}
		}
		Card temp = a[i + 1];
		a[i + 1] = a[r];
		a[r] = temp;

		return i + 1;
	}
	

	private static boolean checkStable(Card[] src, Card[] result) {
		for (int i = 1; i < result.length; i++) {
			if (result[i - 1].rank == result[i].rank) {
				if (seekCard(src, result[i - 1]) > seekCard(src, result[i])) {
					return false;
				}
			}
		}
		return true;
	}
	
	private static int seekCard(Card[] src, Card key) {
		for (int i = 0; i < src.length; i++) {
			if (src[i].rank == key.rank && src[i].suit == key.suit) {
				return i;
			}
		}
		
		return -1;
	}

	private static class Card {
		public int rank;
		public char suit;
	
		public Card(char suit, int rank) {
			this.suit = suit;
			this.rank = rank;
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

		void print(char c) {
			strbuf.append(c);
			checkStringBuffer();
		}

		void printSP() {
			strbuf.append(" ");
//			checkStringBuffer();
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