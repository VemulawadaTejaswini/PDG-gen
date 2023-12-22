import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		HashSet<Integer> fromStart = new HashSet<>();
		HashSet<Integer> toEnd = new HashSet<>();
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a == 1) {
				fromStart.add(b);
			} else if (a == n) {
				toEnd.add(b);
			}
			if (b == 1) {
				fromStart.add(a);
			} else if (b == n) {
				toEnd.add(a);
			}
		}
		for (int x : fromStart) {
			if (toEnd.contains(x)) {
				System.out.println("POSSIBLE");
				return;
			}
		}
		System.out.println("IMPOSSIBLE");
		
	}
}
