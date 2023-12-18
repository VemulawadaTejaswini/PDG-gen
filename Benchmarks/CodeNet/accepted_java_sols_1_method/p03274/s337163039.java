import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			int[] x = new int[n];
			IntStream.range(0, n).forEach(i -> x[i] = scanner.nextInt());
			System.out.println(IntStream.range(0, n - k + 1).map(i -> {
				if (x[i + k - 1] <= 0) {
					// 最大値が負数の場合
					return Math.abs(x[i]);
				} else if (x[i] >= 0) {
					// 最小値が整数の場合
					return x[i + k - 1];
				} else {
					return Math.max(-x[i], x[i + k - 1]) + 2 * Math.min(-x[i], x[i + k - 1]);
				}
			}).min().getAsInt());
		}
	}
}
