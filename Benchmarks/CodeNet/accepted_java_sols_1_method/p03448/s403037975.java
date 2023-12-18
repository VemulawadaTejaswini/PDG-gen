import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		int ans = 0;

		for (int i = 0; i <= X / 500; i++) {
			if (i > A) {
				continue;
			}
			for (int j = 0; j <= (X - i * 500) / 100; j++) {
				if (j > B) {
					continue;
				}
				if ((X - i * 500 - j * 100) / 50 <= C) {
					ans++;
				}
			}
		}

		// 出力
		System.out.println(ans);
	}
}
