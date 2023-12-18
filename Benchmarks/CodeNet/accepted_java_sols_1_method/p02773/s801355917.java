import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String in = sc.nextLine();
			int count = map.getOrDefault(in, 0);
			map.put(in, count + 1);
		}
		SortedSet<String> set = new TreeSet<>();
		int max = 0;
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getValue();
				set = new TreeSet<>();
				set.add(entry.getKey());
			} else if (max == entry.getValue()) {
				set.add(entry.getKey());
			}
		}
		set.forEach(System.out::println);
	}
}
