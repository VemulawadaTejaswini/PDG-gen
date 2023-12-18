import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> map = new HashMap<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}
		}
		int m = sc.nextInt();
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (map.containsKey(s)) {
				map.put(s, map.get(s) - 1);
			} else {
				map.put(s, -1);
			}
		}
		sc.close();

		int ans = 0;
		for (int v : map.values()) {
			ans = Math.max(ans, v);
		}
		System.out.println(ans);
	}
}
