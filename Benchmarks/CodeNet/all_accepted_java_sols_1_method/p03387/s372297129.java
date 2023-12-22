import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			if (a == b && b == c) {
				System.out.println("0");
				return;
			}

			List<Integer> list = Arrays.asList(a, b, c);
			Collections.sort(list);

			int result = 0;
			int max = list.get(2);
			int min = list.get(0);
			if (list.get(1) != max) {
				result += max - list.get(1);
				min += result;
			}

			result += (max - min) / 2;
			if ((max - min) % 2 == 1) {
				result += 2;
			}

			System.out.println(result);
		}
	}
}
