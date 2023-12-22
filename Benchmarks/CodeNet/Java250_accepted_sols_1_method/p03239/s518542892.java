import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int T = sc.nextInt();

		int c[] = new int[N];
		int t[] = new int[N];

		for (int i = 0; i < N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
		}

		int mincost = 1001;
		for (int i = 0; i < N; i++) {
			if (t[i] <= T) {
				mincost = Math.min(mincost, c[i]);

			}
		}
		System.out.println(mincost == 1001 ? "TLE" : mincost);

	}
}