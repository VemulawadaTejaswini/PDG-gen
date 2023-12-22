import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N;
			N = Integer.parseInt(scanner.nextLine());
			Map<String, Long> map = new HashMap<String, Long>();

			long ans = 0;
			for (int i = 0; i < N; i++) {
				char[] tmp = scanner.nextLine().toCharArray();
				Arrays.sort(tmp);

				String key = new String(tmp);
				if (map.containsKey(key)) {
					map.put(key, map.get(key) + 1L);
				} else {
					map.put(key, 1L);
				}
			}
			for (long l : map.values()) {
				ans += (l * (l - 1L)) / 2L;
			}
			System.out.println(ans);
		}
	}
}