import java.io.IOException;
import java.util.BitSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		BitSet set = new BitSet();
		boolean hasWild = false;
		while ((n != k) && (n != 0)) {
			set.clear();
			hasWild = false;
			for (int i = 0; i < k; i++) {
				final int nextInt = in.nextInt();
				if (nextInt != 0) {
					set.set(nextInt);
				} else {
					hasWild = true;
				}
			}
			int start = set.nextSetBit(0);
			int sizeMax = 0;
			while (start != -1) {
				int end = set.nextClearBit(start) - 1;
				int nextstart = set.nextSetBit(end+1);
				if (hasWild && set.get(end + 2)) {
					end += 2;
					end = set.nextClearBit(end) - 1;
				}
				final int size = (end - start) + 1;
				sizeMax = Math.max(sizeMax, size);
				start=nextstart;
			}
			System.out.println(sizeMax);
			n = in.nextInt();
			k = in.nextInt();
		}

	}
}