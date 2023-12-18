
import java.util.BitSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)  {
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
				int end = set.nextClearBit(start);
				int nextStart = set.nextSetBit(end);
				if (hasWild && set.get(++end)) {
					end = set.nextClearBit(end);
				}
				sizeMax = Math.max(sizeMax, end - start);
				start = nextStart;
			}
			System.out.println(sizeMax);
			n = in.nextInt();
			k = in.nextInt();
		}
	}

}