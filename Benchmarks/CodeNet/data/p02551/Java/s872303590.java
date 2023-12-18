import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			int n = scanner.nextInt(), q = scanner.nextInt();
			int[] bottom = new int[n], right = new int[n];
			Arrays.fill(bottom, n);
			Arrays.fill(right, n);
			long result = (n - 2) * (long) (n - 2);
			for (int i = 0; i < q; i++) {
				int command = scanner.nextInt(), x = scanner.nextInt();
				if (1 == command) {
					result -= bottom[x] - 2;
					IntStream.range(1, bottom[x]).forEach(j -> right[j] = Math.min(right[j], x));
				} else {
					result -= right[x] - 2;
					IntStream.range(1, right[x]).forEach(j -> bottom[j] = Math.min(bottom[j], x));
				}
			}
			System.out.println(result);
		}
	}
}
