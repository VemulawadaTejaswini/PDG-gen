import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] n = new int[N + 1];
		int t = 0, c = 0;

		// 入力値を設定
		for (int i = 0; i < N; i++) {
			n[i] = sc.nextInt();
		}
		t = n[0] + T - 1;
		c = T;
		for (int i = 1; i < N; i++) {
			if (t < n[i]) {
				c += T;
			} else {
				c += T - (1 + (t - n[i]));
			}
			t = n[i] + T - 1;
		}
		
		System.out.print(c);

		sc.close();
	}
}
