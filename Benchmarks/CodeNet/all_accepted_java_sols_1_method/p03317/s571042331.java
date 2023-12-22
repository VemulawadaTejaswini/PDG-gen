import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			IntStream.range(0, n).forEach(i -> scanner.nextInt());
			System.out.println((n + k - 3) / (k - 1));
		}
	}
}
