import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int N = sc.nextInt();
		int t[] = new int[N + 1];
		int x[] = new int[N + 1];
		int y[] = new int[N + 1];
		t[0] = 0;
		x[0] = 0;
		y[0] = 0;
		for (int i = 1; i < N + 1; i++) {
			t[i] = sc.nextInt();
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}

		String ans = "Yes";
		int dt = 0;
		int dx = 0;
		int dy = 0;
		int chk = 0;

		for (int i = 0; i < N; i++) {
			dt = t[i + 1] - t[i];
			dx = x[i + 1] - x[i];
			dy = y[i + 1] - y[i];
			chk = dt - (dx + dy);

			if (!(chk >= 0 && chk % 2 == 0)) {
				ans = "No";
				break;
			}
		}

		// 出力
		System.out.println(ans);
	}
}
