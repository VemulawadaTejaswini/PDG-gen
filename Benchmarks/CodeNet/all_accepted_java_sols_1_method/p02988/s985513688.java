import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int n = sc.nextInt();
		int p[] = new int[n];

		for (int i = 0; i < n; i++) {
			p[i] = sc.nextInt();
		}
		int ans = 0;

		//ansでカウントした回数を出力
		for (int i = 1; i < n - 1; i++) {
			if ((p[i - 1] < p[i]) && (p[i] < p[i + 1])) {
				ans++;
			} else if ((p[i - 1] > p[i]) && (p[i] > p[i + 1])) {
				ans++;
			}

		}
		System.out.println(ans);

	}

}