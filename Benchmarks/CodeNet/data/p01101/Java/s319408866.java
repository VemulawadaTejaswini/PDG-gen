import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			execute(scanner);
		}
	}

	private static void execute(Scanner scanner) {
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		if (n == 0 && m == 0)
			System.exit(0);
		String line = scanner.nextLine();
		List<Integer> priceList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).sorted()
				.collect(Collectors.toList());

		int max = -1;
		for (int i = priceList.size() - 1; i >= 0; i--) {
			int first = priceList.get(i);
			if (first > m) {
				continue;
			}
			for (int j = priceList.size() - 1; j >= 0; j--) {
				if (i == j) {
					continue;
				}
				int second = priceList.get(j);
				if (first + second > m) {
					continue;
				}
				if (max < first + second) {
					max = first + second;
					break;
				}
			}
		}
		if (max == -1) {
			System.out.println("NONE");
		} else {
			System.out.println(max);
		}
	}
}