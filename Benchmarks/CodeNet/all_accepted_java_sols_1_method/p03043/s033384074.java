import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), k = scanner.nextInt();
			double sum = IntStream.rangeClosed(1, Math.min(n, k)).mapToDouble(i -> {
				double result = 1.0d;
				// iがkを超えるまでコインを振り続ける
				while (i < k) {
					i <<= 1;
					result /= 2.0d;
				}
				return result;
			}).sum();
			sum += (n > k) ? (n - k) : 0.0d;
			System.out.println(sum / n);
		}
	}
}
