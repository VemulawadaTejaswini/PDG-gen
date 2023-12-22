

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int Q = sc.nextInt();
		Map<Integer, Integer> A = new HashMap<Integer, Integer>();

		int tmp = 0;
		for (int i = 0; i < Q; i++) {
			tmp = sc.nextInt();
			if (A.get(tmp) != null) {
				A.put(tmp, A.get(tmp) + 1);
			} else {
				A.put(tmp, 1);
			}
		}

		for (int i = 1; i < N+1; i++) {
			if (A.get(i) == null) {
				A.put(i, 0);
			}
			if (K - Q + A.get(i) > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}
