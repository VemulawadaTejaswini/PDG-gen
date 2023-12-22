import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		long ans = 0;

		for (int b = 1; b <= N; b++) {
			int div = N / b;
			int mod = N % b;
			ans += div * Math.max(0, b - K) + Math.max(0, mod - K + 1);
		}
		if (K == 0)
			ans -= N;

		System.out.println(ans);
	}
}