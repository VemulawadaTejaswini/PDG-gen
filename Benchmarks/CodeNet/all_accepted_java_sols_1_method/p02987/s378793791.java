import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			Map<Character, Integer> map = new HashMap<>();
			for (char c : sc.next().toCharArray()) {
				map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
			}
			if (map.size() == 2) {
				for (int cnt : map.values()) {
					if (cnt != 2) {
						System.out.println("No");
						return;
					}
				}
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}