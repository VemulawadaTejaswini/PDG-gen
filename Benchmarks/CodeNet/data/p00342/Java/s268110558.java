import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static java.lang.Integer.parseInt;

/**
 * Maximization of Relational Expression
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		String[] words;

		int n = parseInt(br.readLine());

		long[] a = Arrays.stream(br.readLine().split(" "))
				.mapToLong(Long::parseLong)
				.sorted()
				.toArray();

		Map<Long, List<int[]>> max = new HashMap<>();
		Map<Long, List<int[]>> min = new HashMap<>();

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				max.putIfAbsent(a[j] + a[i], new ArrayList<>());
				max.get(a[j] + a[i]).add(new int[]{j, i});
				min.putIfAbsent(a[j] - a[i], new ArrayList<>());
				min.get(a[j] - a[i]).add(new int[]{j, i});
			}
		}

		Set<Double> ans = new TreeSet<>();

		for (long _max : max.keySet()) {
			for (long _min : min.keySet()) {
				outer:
				for (int[] __max : max.get(_max)) {
					for (int[] __min : min.get(_min)) {
						if (__max[0] != __min[0]
								&& __max[0] != __min[1]
								&& __max[1] != __min[0]
								&& __max[1] != __min[1]) {
							ans.add((double) _max / _min);
							break outer;
						}
					}
				}
			}
		}

		System.out.println(ans.stream().max(Comparator.naturalOrder()).get());

	}
}