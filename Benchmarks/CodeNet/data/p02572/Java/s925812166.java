import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		long[] A = new long[N];
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
		}
		
		// 結果の出力
		long ans = 0;
		long divisor = (long) (Math.pow(10, 9)) + 7;
		for (int i = 0; i < (N - 1); i++) {
			for (int j = (i + 1); j < N; j++) {
				ans += (A[i] * A[j]) % divisor;
				ans = ans % divisor;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
