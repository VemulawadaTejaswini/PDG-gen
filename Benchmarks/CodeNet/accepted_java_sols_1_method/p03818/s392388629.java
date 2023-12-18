import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		int count = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (set.contains(x)) {
				count++;
			} else {
				set.add(x);
			}
		}
		int total = set.size();
		if (count % 2 == 1) {
			total--;
		}
		System.out.println(total);
	}
}
