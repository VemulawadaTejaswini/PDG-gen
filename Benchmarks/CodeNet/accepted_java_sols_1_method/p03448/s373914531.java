import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 500
		int a = sc.nextInt();
		// 100
		int b = sc.nextInt();
		// 50
		int c = sc.nextInt();
		// 合計
		int x = sc.nextInt();

		int p = 0;

		for (int i = 0; i <= a; ++i) {
			for (int j = 0; j <= b; ++j) {
				for (int k = 0; k <= c; ++k) {
					if (i * 500 + j * 100 + k * 50 == x) {
						p++;
					}
				}
			}
		}

		// 出力
		System.out.println(p);
	}
}