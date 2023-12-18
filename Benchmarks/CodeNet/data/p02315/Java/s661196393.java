import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		if (line == null) {
			System.out.println(0);
			return;
		}

		String[] params = line.split(" ");

		if (params.length < 2) {
			System.out.println(0);
			return;
		}

		int maxCnt = Integer.parseInt(params[0]);
		int maxWeight = Integer.parseInt(params[1]);

		Map<Integer, Integer> last = new HashMap<>();
		last.put(0, 0);

		int idx = 0;
		while (idx < maxCnt) {
			line = br.readLine();

			if (line == null) {
				break;
			}

			params = line.split(" ");
			if (line.length() < 2) {
				break;
			}

			idx++;
			Map<Integer, Integer> current = new HashMap<>();
			current.putAll(last);

			List<Integer> pair = Arrays.stream(params)
					.map(Integer::parseInt)
					.collect(Collectors.toList());
			Integer currentValue = pair.get(0);
			Integer currentWeight = pair.get(1);

			for (Map.Entry<Integer, Integer> entry : last.entrySet()) {
				int totalWeight = entry.getValue() + currentWeight;
				if (totalWeight <= maxWeight) {
					merge(current, entry.getKey() + currentValue, totalWeight);
				}
			}
			merge(current, currentValue, currentWeight);
			last = current;
		}
		System.out.println(Collections.max(last.keySet()));
	}

	private static void merge(Map<Integer, Integer> current, int newValue, int newWeight) {
		current.merge(newValue, newWeight,
				(oldWgt, newWgt) -> {
					if (oldWgt < newWgt) {
						return oldWgt;
					} else {
						return newWgt;
					}
				});
	}
}
