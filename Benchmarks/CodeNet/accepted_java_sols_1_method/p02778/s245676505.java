import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();

		IntStream.range(0, str.length()).forEach(x -> System.out.print("x"));
		scan.close();
	}
}