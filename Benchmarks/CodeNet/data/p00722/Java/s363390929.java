import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		boolean[] prime = new boolean[1000001];
		Arrays.fill(prime, true);
		prime[0] = prime[1] = false;
		for (int i = 2; i < prime.length; ++i) {
			if (prime[i]) {
				for (long j = (long) i * i; j < prime.length; j += i) {
					prime[(int) j] = false;
				}
			}
		}
		while (true) {
			int A = sc.nextInt();
			if (A == 0) break;
			int D = sc.nextInt();
			int N = sc.nextInt();
			while (true) {
				if (prime[A]) {
					--N;
					if (N == 0) break;
				}
				A += D;
			}
			System.out.println(A);
		}
	}

}