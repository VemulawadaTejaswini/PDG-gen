import java.util.*;

public class Main {

	public static void main (String[] args)  {
		Scanner sc = new Scanner(System.in);
		char[] first = sc.next().toCharArray();
		long len = first.length;
		TreeSet<Integer>[] sets = new TreeSet[26];
		for (int i = 0; i < sets.length; i++) {
			sets[i] = new TreeSet<Integer>();
		}
		for (int i = 0; i < len; i++) {
			sets[first[i] - 'a'].add(i);
		}
		char[] second = sc.next().toCharArray();
		int line = 0;
		int idx = 0;
		for (char c : second) {
			Integer x = sets[c - 'a'].ceiling(idx);
			if (x == null) {
				idx = 0;
				line++;
				x = sets[c - 'a'].ceiling(idx);
				if (x == null) {
					System.out.println(-1);
					return;
				}
			}
			idx = x.intValue() + 1;
		}
		System.out.println(len * line + idx);
	}
}
