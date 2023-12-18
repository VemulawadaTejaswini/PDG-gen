import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			Map<String, Integer> words = new HashMap<String, Integer>();
			int n,m;
			n = scanner.nextInt();

			String s = "";
			// blue card input
			for (int i = 0; i < n; i++) {
				s = scanner.next();
				if (words.containsKey(s)) {
					words.put(s, words.get(s) + 1);
				} else {
					words.put(s, 1);
				}
			}
			// red card input
			m = scanner.nextInt();
			for (int i = 0; i < m; i++) {
				s = scanner.next();
				if (words.containsKey(s)) {
					words.put(s, words.get(s) - 1);
				} else {
					words.put(s, -1);
				}
			}
			// result output
			int max = -999;
			for (Entry<String, Integer> ent : words.entrySet()) {
				if (ent.getValue() > max) {
					max = ent.getValue();
				}
			}
			System.out.println(max < 0 ? 0 : max);

		}
	}
}