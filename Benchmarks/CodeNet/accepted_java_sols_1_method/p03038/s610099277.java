import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int M = s.nextInt();

			Map<Integer, Integer> map = new TreeMap<Integer, Integer>(Comparator.reverseOrder());
			for (int i = 0; i < N; i++) {
				Integer a = s.nextInt();
				if (map.containsKey(a)) {
					map.put(a, map.get(a).intValue() + 1);
				} else {
					map.put(a, 1);
				}
			}

			for (int i = 0; i < M; i++) {
				int b = s.nextInt();
				Integer c = s.nextInt();

				if (map.containsKey(c)) {
					map.put(c, map.get(c).intValue() + b);
				} else {
					map.put(c, b);
				}
			}

			long sum = 0;
			int n = N;
			for (Map.Entry<Integer, Integer> e : map.entrySet()) {
				long w = Math.min(n, e.getValue());
				sum += e.getKey() * w;
				n -= w;
				if (n < 1) {
					break;
				}
			}
			System.out.println(sum);
		}
	}
}
