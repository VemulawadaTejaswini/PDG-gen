import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < n; i++) {
			int key = scanner.nextInt();
			if (map.containsKey(key)) {
				map.put(key, map.get(key) + 1);
			} else {
				map.put(key, 1);
			}
		}

		long ans = 0;
		for (int key : map.keySet()) {
			int value = map.get(key);
			if (key == value) {
				continue;
			} else if (key > value) {
				ans += value;
			} else {
				ans += value - key;
			}
		}

		System.out.println(ans);

	}

}
