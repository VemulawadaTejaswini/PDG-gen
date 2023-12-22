import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 人数
		int N = sc.nextInt();
		// ポイント
		int K = sc.nextInt();
		// 正解数
		int Q = sc.nextInt();
		// 正解した参加者
		int A[] = new int[Q];
		for (int i = 0; i < Q; i++) {
			A[i] = sc.nextInt();
		}

		// 参加者の得点
		int X[] = new int[N];
		Arrays.fill(X, K - Q);

		for (int i = 0; i < Q; i++) {
			X[A[i] - 1] = X[A[i] - 1] + 1;
		}


		for (int i = 0; i < N; i++) {
			if (X[i] <= 0) {
				System.out.println("No");
			} else {
				System.out.println("Yes");
			}
		}
	}
}
