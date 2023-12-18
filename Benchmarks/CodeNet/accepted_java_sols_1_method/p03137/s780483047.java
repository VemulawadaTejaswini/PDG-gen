import java.util.Arrays;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);

		int[] between = new int[M - 1];
		for (int i = 1; i < X.length; i++) {
			between[i - 1] = Math.abs(X[i - 1] - X[i]);
		}
		Arrays.sort(between);

		int ans = 0;
		for (int i = 0; i < (between.length - N + 1); i++) {
			ans += between[i];
		}

		System.out.println(ans);
	}
}