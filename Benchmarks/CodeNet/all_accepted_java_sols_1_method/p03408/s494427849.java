import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<String, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			String key = scanner.next();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		int m = scanner.nextInt();
		for (int i = 0; i < m; i++) {
			String key = scanner.next();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) - 1);
			} else {
				map.put(key, -1);
			}
		}

		int max = -1000000000;
		for (int val : map.values()) {
			max = Math.max(max, val);
		}
		if (max >= 0)
			System.out.println(max);
		else
			System.out.println(0);
	}
}