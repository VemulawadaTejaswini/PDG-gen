import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 解説通りに実装したソースコード
 */
public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> aMap = new HashMap<>(), bMap = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int c = scanner.nextInt();
				aMap.put(c, aMap.getOrDefault(c, 0) + 1);
			});
			int[] b = IntStream.range(0, n).map(i -> {
				int c = scanner.nextInt();
				bMap.put(c, bMap.getOrDefault(c, 0) + 1);
				return c;
			}).toArray();
			// 可能かどうかを判定
			for (Integer key : aMap.keySet()) {
				if (aMap.get(key) + bMap.getOrDefault(key, 0) > n) {
					System.out.println("No");
					return;
				}
			}
			// aに出現するi以下の値の個数をc[i]、bに出現するi以下の値の個数をd[i]
			int[] c = new int[n + 1], d = new int[n + 1];
			Arrays.fill(c, 0);
			Arrays.fill(d, 0);
			aMap.entrySet().stream().forEach(entry -> c[entry.getKey()] += entry.getValue());
			bMap.entrySet().stream().forEach(entry -> d[entry.getKey()] += entry.getValue());
			IntStream.rangeClosed(1, n).forEach(i -> {
				c[i] += c[i - 1];
				d[i] += d[i - 1];
			});
			// bをc[i]−d[i−1] の最大値の分だけ右にずらす
			int max = IntStream.rangeClosed(1, n).map(i -> c[i] - d[i - 1]).max().getAsInt();
			int[] result = IntStream.range(0, n).map(i -> b[(max + i) % n]).toArray();
			System.out.println("Yes");
			System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		}
	}
}
