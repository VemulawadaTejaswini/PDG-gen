import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		List<Long> S1 = prefixSum(n, sc, k);
		List<Long> S2 = prefixSum(m, sc, k);
		n = S1.size();
		m = S2.size();
		int max = n + m;
		boolean found = false;

		print(S1);
		print(S2);

		int k1 = 0, k2 = 0;
		for (int i = max; i >= 0; i--) {
			for (k1 = 0; k1 <= i; k1++) {
				k2 = i - k1;
				if (k1 >= n || k2 >= m || k1 < 0 || k2 < 0) {
					continue;
				}
				// k1 on A, k2 on B
				if (S1.get(k1) + S2.get(k2) <= k) {
					found = true;
					break;
				}
			}
			if (found) {
				break;
			}
		}
		System.out.println(k1 + k2);
	}

	private static List<Long> prefixSum(int n, Scanner sc, int k) {
		List<Long> S = new ArrayList<>();
		S.add(0l);
		for (int i = 1; i <= n; i++) {
			long t = sc.nextInt() + S.get(i - 1);
			if (t > k) {
				sc.nextLine();
				break;
			}
			S.add(t);
		}
		return S;
	}

	private static void print(List<Long> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

}
