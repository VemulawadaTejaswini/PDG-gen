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
		
		long[] S = new long[N];
		S[N - 1] = A[N - 1];
		for (int i = N - 2; i > 0; i--) {
			S[i] = S[i + 1] + A[i];
		}
		// 結果の出力
		long ans = 0;
		long divisor = (long) (Math.pow(10, 9)) + 7;
		for (int i = 0; i < (N - 1); i++) {
			ans = (ans % divisor) + ((A[i] * S[i + 1]) % divisor);
		}
		System.out.println(ans);
		sc.close();
	}
}
