import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		Integer n = Integer.parseInt(scan.nextLine());
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String text = scan.nextLine();
			int count = 1;
			if (map.containsKey(text)) {
				count = map.get(text) + 1;
			}
			map.put(text, count);
		}

		int max = map.values().stream().max(Comparator.comparing(Integer::valueOf)).get();
		List<String> results = map.keySet().stream().filter(key -> map.get(key) == max).collect(Collectors.toList());
		Collections.sort(results);
		for (String result : results) {
			System.out.println(result);
		}

		scan.close();
	}
}