import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long N, K;
		N = sc.nextLong();
		K = sc.nextLong();

		long a = 0;
		for (int i = 1; i <= N; i++) {
			if (i % K == 0) {
				a++;
			}
		}

		long b = 0;
		for (int i = 1; i <= N; i++) {
			if (i % K == K/2) {
				b++;
			}
		}

		long ans = a * a * a;
		if (K % 2 == 0) {
			ans += b * b * b;
		}

		System.out.println(ans);
	}
}