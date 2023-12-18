import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private final static StringBuilder sortedSeq = new StringBuilder();
	private final static String lb = System.getProperty("line.separator");

	private static int count;
	public static void main(String[] args) throws IOException {
		int[] seq = getSequence();
		shellSort(seq);
		printSequence(seq);
	}

	public static void insertionSort(final int[] seq, final int gap) {
		for (int i = gap; i < seq.length; ++i) {
			final int key = seq[i];
			int j = i - gap;
			while (0 <= j && key < seq[j]) {
				seq[j+gap] = seq[j];
				j = j - gap;
				++count;
			}
			seq[j+gap] = key;
		}
	}

	public static void shellSort(final int[] seq) {
		count = 0;
		
		final int greatestSize = seq.length/3 + 1;
		int gap = 0;
		int sizeOfGaps = 0;
		for (int tmp = 1; tmp <= greatestSize; tmp = 3*gap + 1) {
			gap = tmp;
			++sizeOfGaps;
		}
		sortedSeq.append(sizeOfGaps).append(lb);

		int[] gaps = new int[sizeOfGaps];
		for (int i = 0; i < sizeOfGaps; ++i) {
			gaps[i] = gap;
			sortedSeq.append(gap).append(i < sizeOfGaps-1 ? " " : lb);
			insertionSort(seq, gap);
			
			gap = (gap-1)/3;
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
		final int seqLength = Integer.parseInt(reader.readLine());

		final int[] seq = new int[seqLength];
		for (int i = 0; i < seqLength; ++i) {
			seq[i] = Integer.parseInt(reader.readLine());
		}
		reader.close();

		return seq;
	}
}