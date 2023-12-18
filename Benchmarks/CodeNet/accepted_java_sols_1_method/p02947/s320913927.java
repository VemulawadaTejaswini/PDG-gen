import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int N = scanner.nextInt();
			long ans = 0;
			Map<String, Long> map = new HashMap<String, Long>();
			for (int i = 0; i < N; i++) {
				char[] array = scanner.next().toCharArray();
				Arrays.sort(array);
				String tmp = new String(array);
				if (map.containsKey(tmp)) {
					ans = ans + map.get(tmp);
					map.put(tmp, map.get(tmp) + 1);
				} else {
					map.put(tmp, (long) 1);
				}
			}
			System.out.println(ans);
		}
	}
}
