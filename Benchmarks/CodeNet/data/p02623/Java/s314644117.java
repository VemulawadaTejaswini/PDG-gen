import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		List<Integer> S1 = prefixSum(n, sc, k);
		List<Integer> S2 = prefixSum(m, sc, k);
		// print(S1);
		// print(S2);
		n = S1.size();
		m = S2.size();
		int max = n + m;
		boolean found = false;

		int j = m - 1;
		int ans = 0;
		for (int i = 0; i < n; i++) {
			// S1 + S2 <= k
			while (S1.get(i) > k - S2.get(j)) {
				j--;
			}
			ans = Math.max(ans, i + j);
		}
		System.out.println(ans);
	}

	private static List<Integer> prefixSum(int n, Scanner sc, int k) {
		List<Integer> S = new ArrayList<>();
		S.add(0);
		for (int i = 1; i <= n; i++) {
			int t = sc.nextInt() + S.get(i - 1);
			if (t > k) {
				sc.nextLine();
				break;
			}
			S.add(t);
		}
		return S;
	}

	private static void print(List<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
	}

}
