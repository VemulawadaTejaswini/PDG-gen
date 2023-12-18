import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private final static StringBuilder sortedSeq = new StringBuilder();
	private final static String lb = System.getProperty("line.separator");
	
	private static int count;
	public static void main(String[] args) throws IOException{
		int[] seq = getSequence();
		
		shellSort(seq, seq.length);
		
		printSequence(seq);
	}
	
	public static void insertionSort(final int[] seq, final int n, final int g) {
		for (int i = g; i < n; i++) {
			final int key = seq[i];
			int j = i - g;
			while (0 <= j && key < seq[j]) {
				seq[j+g] = seq[j];
				j = j - g;
				count++;
			}
			seq[j+g] = key;
		}
	}
	
	public static void shellSort(final int[] seq, final int n) {
		count = 0;
		final int m = n/2;
		final int[] g = new int[m];
		
		sortedSeq.append(m).append(lb);
		for (int i = 0; i < m; i++) {
			g[i] = seq[m-i];
			sortedSeq.append(g[i]).append(i < m-1 ? " " : lb);
			insertionSort(seq, n, g[i]);
		}
		sortedSeq.append(count).append(lb);
		
	}
	
	public static void printSequence(final int[] seq) {
		for (int i = 0; i < seq.length; i++) {
			sortedSeq.append(seq[i]).append(lb);
		}
		
		System.out.print(sortedSeq.toString());
	}
	
	public static int[] getSequence() throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(reader.readLine());
		
		final int[] seq = new int[n];
		for (int i = 0; i < n; i++) {
			seq[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();
		
		return seq;
	}
}