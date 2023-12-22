import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		int N = sc.nextInt();
		int M = sc.nextInt();
		long sum = 0;
		for (int i = 0; i < M; i++) {
			sum += sc.nextInt();
			if (sum > N) {
				System.out.println(-1);
				sc.close();
				return;
			}
		}
		
		// 結果の出力
		System.out.println(N - sum);

		sc.close();
	}
}
