import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			if (N == 0) break;
			int[] v = new int[N];
			for (int i = 0; i < N; ++i) {
				v[i] = sc.nextInt();
			}
			int sum = 0;
			for (int i = 0; i < K; ++i) {
				sum += v[i];
			}
			int ans = sum;
			for (int i = K; i < N; ++i) {
				sum += v[i] - v[i - K];
				ans = Math.max(ans, sum);
			}
			System.out.println(ans);
		}
	}
}