import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private final static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	private final static StringBuilder sortedSeq = new StringBuilder();
	private final static String lb = System.getProperty("line.separator");
	
	public static void main(String[] args) {
		int[] seq = null;
		try {
			seq = getSeqence();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		seq = insertionSort(seq);
		System.out.print(sortedSeq.toString());
	}
	
	public static int[] insertionSort(final int[] seq) {
		for (int i = 1; i < seq.length; i++) {
			final int key = seq[i];
			int j = i-1;
			while (0 <= j && key < seq[j]) {
				seq[j+1] = seq[j];
				j--;
			}
			seq[j+1] = key;
			
			for (int k = 0; k < seq.length; k++) {
				sortedSeq.append(String.valueOf(seq[k])).append(k < seq.length-1 ? " " : lb);
			}
		}
		
		return seq;
	}
	
	public static int[] getSeqence() throws IOException {
		int n = Integer.parseInt(reader.readLine());
		String[] line = reader.readLine().split("[\\s]+");
		reader.close();
		
		int[] seq = new int[n];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = Integer.parseInt(line[i]);
			sortedSeq.append(String.valueOf(seq[i])).append(i < n-1 ? " " : lb);
		}
		
		return seq;
	}
}