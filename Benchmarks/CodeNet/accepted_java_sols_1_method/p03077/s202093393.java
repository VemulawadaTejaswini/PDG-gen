import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			scanner.nextLine();
			List<Long> list = new ArrayList<>();
			for (int i = 0; i < 5; i++) {
				list.add(scanner.nextLong());
				scanner.nextLine();
			}
			list.sort((x, y) -> {
				if (x > y) {
					return 1;
				} else if (x == y) {
					return 0;
				} else {
					return -1;
				}
			});
			System.out.println((n - 1) / list.get(0) + 5);
		}
	}
}