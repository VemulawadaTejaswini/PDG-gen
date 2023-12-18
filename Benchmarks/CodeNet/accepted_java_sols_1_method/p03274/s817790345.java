import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		long[] X = new long[N];
		for (int i = 0; i < N; i++) {
			X[i] = in.nextLong();
		}
		long ans = Long.MAX_VALUE;
		for (int i = 0; i + K - 1 < N; i++) {
			long left = X[i];
			long right = X[i + K - 1];
			ans = Math.min(ans, Math.min(Math.abs(left), Math.abs(right)) + right - left);
		}
		System.out.println(ans);
		in.close();
	}
}