import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int S = 0;
		int M = 0;

		for (int i = 0; i < N; i++) {
			int P = sc.nextInt();
			S += P;
			M = Math.max(M, P);
		}
		int ans = S - M / 2;
		System.out.println(ans);
	}
}