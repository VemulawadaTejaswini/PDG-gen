import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		BitSet sb = new BitSet();
		List<Integer> list = new ArrayList<Integer>();
		while ((n != k) && (n != 0)) {
			sb.clear();
			list.clear();
			for (int i = 0; i < k; i++) {
				sb.set(in.nextInt());
			}
			int start = sb.nextSetBit(1);
			int sizeMax = 0;
			if (!sb.get(1)) {
				list.add(0);
			}
			while (start != -1) {
				final int end = sb.nextClearBit(start);
				list.add(Integer.valueOf(end - start));
				start = sb.nextSetBit(end);
				if (start - end != 1) {
					list.add(Integer.valueOf(0));
				}
			}
			if (sb.get(0)) {
				for (int i = 0; i < list.size() - 1; i++) {
					sizeMax = Math.max(sizeMax, list.get(i) + list.get(i + 1)
							+ 1);
				}
			} else {
				for (int i = 0; i < list.size(); i++) {
					sizeMax = Math.max(sizeMax, list.get(i));
				}
			}
			System.out.println(list);
			System.out.println(sizeMax);
			n = in.nextInt();
			k = in.nextInt();
		}
	}

}