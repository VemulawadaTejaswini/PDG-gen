import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A, B, C, X, Y;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		long ans = Long.MAX_VALUE;
		for (int k = 0; k <= 100000; k++) {
			int res = 2 * C * k + Math.max(X - k, 0) * A + Math.max(Y - k, 0) * B;
			ans = Math.min(ans, res);
		}

		System.out.println(ans);
	}
}