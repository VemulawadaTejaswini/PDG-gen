import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Map<String, Integer> map = new HashMap<>();
			int maxCount = 0;
			for (int i = 0; i < n; i++) {
				String si = sc.next();
				int newCount = map.getOrDefault(si, 0) + 1;
				map.put(si, newCount);
				if (maxCount < newCount) {
					maxCount = newCount;
				}
			}
			SortedSet<String> keySet = new TreeSet<>(map.keySet());
			for (String key : keySet) {
				if (map.get(key) == maxCount) {
					System.out.println(key);
				}
			}
		}
	}

}
