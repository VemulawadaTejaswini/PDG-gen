import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// 読み込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if (map.get(a) == null) {
				map.put(a, 1);
			} else {
				map.put(a, map.get(a) + 1);
			}
		}

		int Q = sc.nextInt();

		for (int i = 0; i < Q; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();

			if (map.get(c) == null) {
				if (map.get(b) != null) {
					map.put(c, map.get(b));
					map.put(b, 0);
				}
			} else {
				if (map.get(b) != null) {
					map.put(c, map.get(c) + map.get(b));
					map.put(b, 0);
				}
			}
			long sum = 0;
			for (Entry<Integer, Integer> entry : map.entrySet()) {
				sum += entry.getKey() * entry.getValue();
			}
			System.out.println(sum);
		}
	}
}