import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int[] A = IntStream.generate(s::nextInt).limit(N).toArray();

			int x = Arrays.stream(A).sum()
					- 2 * IntStream.range(1, N)
							.filter(i -> i % 2 == 1)
							.mapToObj(i -> A[i])
							.mapToInt(i -> i).sum();
			System.out.print(x);
			for (int i = 1; i < N; i++) {
				x = 2 * A[i - 1] - x;
				System.out.print(" " + x);
			}
			System.out.println();
		}
	}
}
