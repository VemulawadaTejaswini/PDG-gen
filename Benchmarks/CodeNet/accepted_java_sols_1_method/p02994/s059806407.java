import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {

		Scanner sysin = new Scanner(System.in);
		final int n = sysin.nextInt();
		final int l = sysin.nextInt();
		sysin.close();

		System.out.println(
			IntStream.range(l, l + n)
				.boxed()
				.sorted((a, b) -> Math.abs(a) - Math.abs(b))
			//	.peek(System.out::println)
				.skip(1)
				.mapToInt(Integer::intValue)
				.sum()
		);
	}
}