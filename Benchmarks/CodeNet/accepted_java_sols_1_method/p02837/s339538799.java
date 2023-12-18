import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer>[] positive = new HashSet[n];
		Set<Integer>[] negative = new HashSet[n];

		for (int i = 0; i < n; i++) {
			positive[i] = new HashSet<>();
			negative[i] = new HashSet<>();
			int m = sc.nextInt();
			while (m-- > 0) {
				int x = sc.nextInt() - 1;
				if (sc.nextInt() == 1) {
					positive[i].add(x);
				} else {
					negative[i].add(x);
				}
			}
		}

		long answer = 0;
		for (int i = (1 << n) - 1; i >= 0; i--) {
			Set<Integer> p = new HashSet<>();
			int t = 1;
			for (int j = 0; j < n; j++) {
				if ((t & i) > 0) p.add(j);
				t <<= 1;
			}

			boolean valid = true;
			for (int j = 0; j < n; j++) {
				if (!p.contains(j)) continue;
				for (int x : positive[j]) {
					if (!p.contains(x)) {
						valid = false;
					}
				}
				for (int x : negative[j]) {
					if (p.contains(x)) {
						valid = false;
					}
				}
			}
			if (valid) answer = Math.max(answer, p.size());
		}

		System.out.println(answer);
	}
}
