import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			int k = scanner.nextInt();

			Set<String> result = new HashSet<>();
			for (char c = 'a'; c <= 'z'; c++) {
				int from = 0;
				while (s.indexOf(c, from) >= 0) {
					int index = s.indexOf(c, from);
					for (int i = 1; i <= k; i++) {
						if (s.length() < index + i) {
							break;
						}
						result.add(s.substring(index, index + i));
					}
					from = index + 1;
				}
				if (result.size() >= k) {
					break;
				}
			}

			List<String> sortResult = new ArrayList<>(result);
			Collections.sort(sortResult);

			System.out.println(sortResult.get(k - 1));
		}
	}
}
