import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int[] seq = null;
		
		try {
			seq = getSequence();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		selectionSort(seq);
	}
	
	public static int[] selectionSort(final int[] seq) {
		int count = 0;
		
		for (int i = 0; i < seq.length-1; i++) {
			int min = i;
			for (int j = i+1; j < seq.length; j++) {
				if (seq[j] < seq[min]) min = j;
			}
			if (min != i) {
				final int tmp = seq[i];
				seq[i] = seq[min];
				seq[min] = tmp;
				count++;
			}
		}
		
		printSequence(seq);
		System.out.println(count);

		return seq;
	}
	
	public static void printSequence(final int[] seq) {
		final StringBuilder p = new StringBuilder();
		
		for (int i = 0; i < seq.length; i++) {
			p.append(seq[i]).append(i < seq.length-1 ? " " : "");
		}
		System.out.println(p);
	}
	
	public static int[] getSequence() throws IOException {
		final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		final int n = Integer.parseInt(reader.readLine());
		final String[] line = reader.readLine().split(" ");
		reader.close();
		
		final int[] seq = new int[n];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = Integer.parseInt(line[i]);
		}
		
		return seq;
	}
}