import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] S = scanner.next().toCharArray();

			Map<Character, Integer> map = new HashMap<>();

			for (char c : S) {
				map.put(c, map.getOrDefault(c, 0) + 1);
			}

			String ans = "No";
			if (map.size() == 2) {

				if (map.get(S[0]) == 2) {
					ans = "Yes";
				}

			}

			System.out.println(ans);
		}
	}
}
