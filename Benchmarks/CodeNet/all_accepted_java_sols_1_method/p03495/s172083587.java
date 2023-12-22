import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			String[] array = br.readLine().split(" ");
			int N = Integer.parseInt(array[0]);
			int K = Integer.parseInt(array[1]);

			int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

			Map<Integer, Integer> map = new HashMap<>();

			for (Integer a : A) {
				if (map.containsKey(a)) {
					map.put(a, map.get(a) + 1);
				} else {
					map.put(a, 1);
				}
			}

			int count = map.entrySet().stream().sorted(Entry.comparingByValue()).limit(Math.max(map.size() - K, 0))
					.mapToInt(s -> s.getValue()).sum();

			System.out.println(count);
		}
	}
}
