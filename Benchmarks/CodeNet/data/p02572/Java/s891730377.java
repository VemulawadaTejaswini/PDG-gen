import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//定義
		final int mod = 1000000007;
		long sum = 0;
		long tmp = 0;

		//入力値の取得
		int N = sc.nextInt();
		long[] A = new long[N];
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();

			//2番目以降の合計値
			if(i > 0) {
				tmp = add(tmp, A[i], mod);
			}
		}

		//計算
		for(int i=0; i < N-1; i++) {
			sum = add(sum, multiple(A[i],tmp, mod), mod);
			tmp = subtract(tmp, A[i+1], mod);
		}

		System.out.print(sum);
	}

	private static long multiple(long A, long B, int mod) {
		long ans = 0;
		ans = (A*B)%mod;
		return ans;
	}

	private static long add(long A, long B, int mod) {
		long ans = 0;
		ans = (A+B)%mod;
		return ans;
	}

	private static long subtract(long A, long B, int mod) {
		long ans = 0;
		ans = (A-B)%mod;
		return ans;
	}
}
