import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt();
			int k = scanner.nextInt();
			int q = scanner.nextInt();
			// 全員のポイント
			int[] p = new int[n];
			Arrays.fill(p, k - q);
			IntStream.range(0, q).forEach(i -> p[scanner.nextInt() - 1]++);
			Arrays.stream(p).mapToObj(i -> (i > 0) ? "Yes" : "No").forEach(System.out::println);
		}
	}
}
