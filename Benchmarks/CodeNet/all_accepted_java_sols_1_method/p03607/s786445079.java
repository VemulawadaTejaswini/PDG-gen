import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Long, Integer> sheSaid = new HashMap<>();

		int turns = Integer.parseInt(scanner.nextLine());
		for (int turn = 0; turn < turns; turn++) {
			long number = Long.parseLong(scanner.nextLine());
			sheSaid.put(number, Optional.ofNullable(sheSaid.get(number)).orElse(0) + 1);
		}

		System.out.println(sheSaid.entrySet().stream().filter(e -> e.getValue() % 2 != 0).count());
	}
}
