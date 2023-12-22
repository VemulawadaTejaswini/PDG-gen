import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int x = scanner.nextInt();
			int[] l = new int[n];
			IntStream.range(0, n).forEach(i -> l[i] = scanner.nextInt());
			int sum = 0;
			int i = 0;
			for (i = 0; i < n; i++) {
				sum += l[i];
				if (sum > x) {
					break;
				}
			}
			System.out.println(i + 1);
		}
	}
}
