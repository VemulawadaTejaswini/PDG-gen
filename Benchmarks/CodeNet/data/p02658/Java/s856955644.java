import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		long[] A = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			if (A[i] == 0) {
				System.out.println(0);
				sc.close();
				return;
			}
		}

		long product = 1;
		for (long a : A) {
			try {
				product = Math.multiplyExact(product, a);

				if (product > (long) Math.pow(10, 18)) {
					System.out.println(-1);
					sc.close();
					return;
				}
			} catch (Exception e) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}

		// 結果の出力
		System.out.println(product);

		sc.close();
	}
}
