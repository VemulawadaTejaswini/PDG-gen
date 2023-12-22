import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = scan.nextInt();
		long A[] = new long[N];

		for (int i = 0; i < N; i++) {
			A[i] = scan.nextLong();
			if (A[i] == 0) {
				// 0が含まれてたら終了
				System.out.println(0);
				return;
			}
		}

		long ans = A[0];
		for (int i = 1; i < N; i++) {
			if (A[i] <= (1000000000000000000L / ans)) {
				ans *= A[i];
			} else {
				// 10の18乗超えた
				System.out.println(-1);
				return;
			}
		}

		System.out.println(ans);
	}

}