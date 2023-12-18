import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			long n = scanner.nextLong();
			scanner.nextLine();
			long min = IntStream.range(0, 5).mapToLong(i -> {
				long number = scanner.nextLong();
				scanner.nextLine();
				return number;
			}).min().getAsLong();
			System.out.println((n - 1) / min + 5);
		}
	}
}
