import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			Map<Integer, Integer> aMap = new HashMap<>(), bMap = new HashMap<>();
			int[] a = IntStream.range(0, n).map(i -> {
				int c = scanner.nextInt();
				aMap.put(c, aMap.getOrDefault(c, 0) + 1);
				return c;
			}).toArray();
			IntStream.range(0, n).forEach(i -> {
				int c = scanner.nextInt();
				bMap.put(c, bMap.getOrDefault(c, 0) + 1);
			});
			// 可能かどうかを判定
			for (Integer key : aMap.keySet()) {
				if (aMap.get(key) + bMap.getOrDefault(key, 0) > n) {
					System.out.println("No");
					return;
				}
			}
			Queue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>(
					(x, y) -> y.getValue().compareTo(x.getValue()));
			bMap.entrySet().forEach(entry -> queue.add(entry));
			Entry<Integer, Integer> temp = null;
			int[] result = new int[n];
			for (int i = 0; i < n; i++) {
				Entry<Integer, Integer> now = queue.poll();
				if (now.getKey() == a[i]) {
					temp = now;
					now = queue.poll();
					if (null == now) {
						System.out.println("No");
						return;
					}
				}
				result[i] = now.getKey();
				if (now.getValue() > 1) {
					now.setValue(now.getValue() - 1);
					queue.add(now);
				}
				if (null != temp) {
					queue.add(temp);
				}
				temp = null;
			}
			System.out.println("Yes");
			System.out.println(Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" ")));
		}
	}
}
