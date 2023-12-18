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
			int a = scanner.nextInt();
			for (int j = -1; j <= 1; j++) {
				int tar = a + j;
				if (map.containsKey(tar)) {
					map.put(tar, map.get(tar) + 1);
				} else {
					map.put(tar, 1);
				}
			}
		}

		int max = 0;
		for (int value : map.values()) {
			max = Math.max(max, value);
		}

		System.out.println(max);
	}
}
