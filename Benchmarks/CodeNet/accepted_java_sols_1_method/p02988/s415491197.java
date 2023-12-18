import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			final int N = s.nextInt();
			final int[] P = IntStream.generate(s::nextInt).limit(N).toArray();

			int ret = 0;
			for (int i = 1; i < N - 1; i++) {
				if (P[i - 1] < P[i] && P[i] < P[i + 1]) {
					ret++;
				}
				if (P[i - 1] > P[i] && P[i] > P[i + 1]) {
					ret++;
				}
			}
			System.out.println(ret);
		}
	}
}
