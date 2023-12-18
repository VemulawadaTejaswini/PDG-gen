import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), d = scanner.nextInt();
			System.out.println(IntStream.range(0, n).filter(i -> {
				int x = scanner.nextInt(), y = scanner.nextInt();
				return (Math.sqrt((double) x * x + (double) y * y) <= d);
			}).count());
		}
	}
}
