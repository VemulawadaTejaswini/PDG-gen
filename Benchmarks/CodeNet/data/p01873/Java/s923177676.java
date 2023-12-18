import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

/**
 * Periodic Sequence
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int k = 1 << 29;
		Map<Integer, Integer> S = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int s = parseInt(sc.next());
			S.putIfAbsent(s, 0);
			S.put(s, S.get(s) + 1);
		}

		for (int v : S.values()) {
			k = Math.min(k, v);
		}

		System.out.println(k);
	}
}
