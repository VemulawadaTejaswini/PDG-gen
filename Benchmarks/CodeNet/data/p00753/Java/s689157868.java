import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean[] prime = new boolean[300001];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; i < prime.length; ++i) {
			if (prime[i]) {
				for (long j = (long) i * i; j < prime.length; j += i) {
					prime[(int) j] = false;
				}
			}
		}
		int[] count = new int[prime.length];
		for (int i = 1; i < count.length; ++i) {
			count[i] = count[i - 1] + (prime[i] ? 1 : 0);
		}
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			System.out.println(count[2 * N] - count[N]);
		}
	}

}