import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			Map<Integer, Integer> numberCountMap = new HashMap<>();
			for (int i = 0; i < n; i++) {
				int number = scanner.nextInt();
				if (null == numberCountMap.get(number)) {
					numberCountMap.put(number, 1);
				} else {
					numberCountMap.put(number, numberCountMap.get(number) + 1);
				}
			}
			int size = numberCountMap.size();
			if (size <= k) {
				System.out.println(0);
			} else {
				System.out.println(
						numberCountMap.entrySet().stream().mapToInt(x -> x.getValue()).sorted().limit(size - k).sum());
			}
		}
	}
}