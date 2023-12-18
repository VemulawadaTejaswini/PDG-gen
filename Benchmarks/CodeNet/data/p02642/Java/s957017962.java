import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> map = new HashMap<>();
			int max = IntStream.range(0, n).map(i -> {
				int a = scanner.nextInt();
				map.put(a, map.getOrDefault(a, 0) + 1);
				return a;
			}).max().getAsInt();
			boolean[] dp = new boolean[max + 1];
			Arrays.fill(dp, true);
			IntStream.rangeClosed(0, max).forEach(i -> {
				if (map.containsKey(i) && (1 == map.get(i))) {
					for (int j = i + i; j <= max; j += i) {
						dp[j] = false;
					}
				} else {
					dp[i] = false;
				}
			});
			System.out.println(IntStream.rangeClosed(0, max).filter(i -> dp[i]).count());
		}
	}
}
