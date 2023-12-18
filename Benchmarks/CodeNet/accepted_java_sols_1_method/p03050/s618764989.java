import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();

		long sum = 0;
		long SQRT = (long)Math.sqrt(N);
		for (long i = 1; i < SQRT; i++) {
			if ((N - i) % i == 0) {
				long v = (N - i) / i;
				// System.out.println(i + ":" + v);
				sum += v;
			}
		}
		long limit = (N - SQRT) / SQRT + 1;
		// System.out.println("-");
		for (long i = 1; i <= limit; i++) {
			if (N / i == N % i) {
				// System.out.println(i);
				sum += i;
			}
		}

		System.out.println(sum);
	}
}
