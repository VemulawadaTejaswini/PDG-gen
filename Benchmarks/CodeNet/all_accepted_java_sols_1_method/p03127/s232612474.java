import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			sc.nextInt();
			SortedSet<Integer> set = new TreeSet<>();
			while (sc.hasNext()) {
				set.add(sc.nextInt());
			}
			int min = set.first();
			if (min == 1 || set.size() == 1) {
				System.out.println(min);
			} else {
				while (set.size() != 1) {
					int max = set.last();
					set.remove(max);
					if (max % set.last() == 0) {
						continue;
					} else {
						set.add(max % set.last());
					}
				}
				System.out.println(set.last());
			}
		}
	}
}