import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (set.contains(x)) {
				set.remove(x);
			} else {
				set.add(x);
			}
		}
		System.out.println(set.size());
	}
}
