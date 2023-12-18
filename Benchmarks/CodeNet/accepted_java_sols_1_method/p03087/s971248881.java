import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int q = in.nextInt();
		String s = in.next();
		
		TreeMap<Integer, Integer> ml = new TreeMap<>();
		//TreeMap<Integer, Integer> mr = new TreeMap<>();
		//int[] a = new int[q];
		int idx = 0;
		int d = 0;
		while (true) {
			idx = s.indexOf("AC", idx);
			if (idx == -1) {
				break;
			}
			ml.put(idx, ++d);
			idx++;
		}

		for (int i = 0; i < q; i++) {
//			System.out.println("----");
//			System.out.println(i);
			int l = in.nextInt() - 1;
			int r = in.nextInt() - 1;
			int c = d;
//			System.out.println(c);
			if (l != 0) {
				Entry<Integer, Integer> lower = ml.lowerEntry(l);
				if (lower != null) {
//					System.out.println("L " + lower.getValue());
					c -= lower.getValue();
				}
			}
			if (r != n) {
				Entry<Integer, Integer> ceil = ml.ceilingEntry(r);
				if (ceil != null) {
//					System.out.println("R " + ceil.getValue());
//					System.out.println("R' " + (d - ceil.getValue() + 1));
					c -= (d - ceil.getValue() + 1);
				}
			}
			System.out.println(c);
		}
	}

}
