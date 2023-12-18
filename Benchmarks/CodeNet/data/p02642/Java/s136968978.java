
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Set<Integer> a = new TreeSet<>();
			Set<Integer> dup = new TreeSet<>();
			for (int i = 0; i < n; i++) {
				int tmp = sc.nextInt();
				if (a.contains(tmp)) {
					dup.add(tmp);
				} else {
					a.add(tmp);
				}
			}

			for (int i : dup) {
				a.remove(i);
			}

			Set<Integer> ng = new TreeSet<>();


			for (int i : a) {
				for (int j : a) {
					if (i <= j) {
						break;
					}
					if (i % j == 0) {
						ng.add(i);
					}
				}
			}
			System.out.println(a.size() - ng.size());
		}
	}
}
