import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long numCount;
		List<String> lists = new ArrayList<String>();

		numCount = scan.nextLong();

		for (int i = 0; i < numCount; i++) {
			lists.add(scan.next());
		}

		Map<String, Long> map = new HashMap<String, Long>();

		for (String s : lists) {
			if (map.containsKey(s)) {
				Long count = map.get(s);
				count++;
				map.put(s, count);
			} else {
				map.put(s, Long.parseLong("1"));
			}
		}

		Optional<Long> maxCount = map.values().stream().max(Long::compareTo);
		Long maxmax = maxCount.get();
		List<String> ansString = new ArrayList<>();

		for (String key : map.keySet()) {
			if (map.get(key) == maxmax) {
				ansString.add(key);
			}
		}

		Collections.sort(ansString);

		ansString.forEach(System.out::println);

	}

}