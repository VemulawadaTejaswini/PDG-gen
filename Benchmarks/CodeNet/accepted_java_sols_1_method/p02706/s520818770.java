import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), m = scanner.nextInt();
			int result = n - IntStream.range(0, m).map(i -> scanner.nextInt()).sum();
			System.out.println((result >= 0) ? result : -1);
		}
	}
}
