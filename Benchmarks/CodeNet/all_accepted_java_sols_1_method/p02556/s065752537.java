import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			long[] p = new long[n], q = new long[n];
			IntStream.range(0, n).forEach(i -> {
				long x = scanner.nextLong(), y = scanner.nextLong();
				p[i] = x + y;
				q[i] = x - y;
			});
			System.out
					.println(Math.max(Math.abs(Arrays.stream(p).max().getAsLong() - Arrays.stream(p).min().getAsLong()),
							Math.abs(Arrays.stream(q).max().getAsLong() - Arrays.stream(q).min().getAsLong())));
		}
	}
}
