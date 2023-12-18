import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Set<Integer>> map = new HashMap<>();

		Set<Integer> allValue = new HashSet<>();
		for (int i = 1; i <= n; i++) {
			allValue.add(i);
		}

		int[] dp = new int[n + 10];
		Arrays.fill(dp, Integer.MAX_VALUE);
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			Set<Integer> setb = map.getOrDefault(a, new HashSet<>());
			setb.add(b);
			map.put(a, setb);
			Set<Integer> seta = map.getOrDefault(b, new HashSet<>());
			seta.add(a);
			map.put(b, seta);
			allValue.remove(a);
			allValue.remove(b);
		}
		if (!allValue.isEmpty()) {
			System.out.println("No");
			return;
		}
		m(dp, map, 1, 0, 1);
		System.out.println("Yes");
		for (int i = 2; i < n + 1; i++) {
			System.out.println(dp[i]);
		}
	}

	public static final Map<Integer, Integer> lengthMap = new HashMap<>();
	static {
		lengthMap.put(1, 0);
	}

	public static void m(int[] dp, Map<Integer, Set<Integer>> map, Integer now, Integer length, Integer before) {
		Set<Integer> vs = map.get(now);
		for (Integer value : vs) {
			int oldLength = lengthMap.getOrDefault(value, Integer.MAX_VALUE);
			if (oldLength > length) {
				lengthMap.put(value, length + 1);
				dp[value] = now;
				m(dp, map, value, length + 1, now);
			} else {
				continue;
			}
		}
	}
}
