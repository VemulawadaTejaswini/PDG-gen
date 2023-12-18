import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();

		int V[] = new int[N];

		for (int i = 0; i < N; ++i) {
			V[i] = sc.nextInt();
		}

		int C[] = new int[N];
		for (int i = 0; i < N; ++i) {
			C[i] = sc.nextInt();
		}

		int ans = 0;
		for (int i = 0; i < N; ++i) {
			if (V[i] > C[i]) {
				ans += V[i] - C[i];
			}
		}

		System.out.println(ans);

	}

}