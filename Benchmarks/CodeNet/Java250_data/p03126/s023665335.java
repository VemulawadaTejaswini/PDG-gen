import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int a = sc.nextInt();
				if (map.containsKey(a)) {
					int val = map.get(a);
					val++;
					map.put(a, val);
				} else {
					map.put(a, 1);
				}
			}
		}
		sc.close();

		int ans = 0;
		for (int val : map.values()) {
			if (val == n) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
