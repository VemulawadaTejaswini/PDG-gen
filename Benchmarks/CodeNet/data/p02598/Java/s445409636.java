import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値取得
		int N = scan.nextInt();
		long K = scan.nextLong();

		long[] A = new long[N];

		long left = 0L;
		long right = 0L;

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
			if (A[i] > right) {
				right = A[i];
			}
		}

		//演算
		if (K != 0L) {
			while (right - left >1) {
				long mid = (left + right) / 2L;

				long result = 0L;

				for (int i = 0; i < N; i++) {
					result += (A[i] + mid - 1) / mid - 1L;
				}

				if (result > K) {
					left = mid;
				} else {
					right = mid;
				}
			}
		}

		//結果出力
		System.out.println(right);
	}
}
