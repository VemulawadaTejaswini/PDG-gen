import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			scanner.nextLine();
			Map<Integer, Integer> numberCountMap = new HashMap<>();
			IntStream.range(0, n).forEach(i -> {
				int number = scanner.nextInt();
				int integer = numberCountMap.getOrDefault(number, 0);
				numberCountMap.put(number, integer + 1);
			});
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
