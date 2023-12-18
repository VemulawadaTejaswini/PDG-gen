import java.util.Scanner;

public class Main {

	static Main instance = new Main();

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		//入力値
		int N = scan.nextInt();

		//WK変数
		long sum = 0L;
		//演算
		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				for (int k = 1; k <= N; k++) {

					int x1, y1;
					if (i > j) {
						x1 = i;
						y1 = j;
					} else {
						x1 = j;
						y1 = i;
					}
					while (x1 % y1 != 0) {
						int tmp = x1;
						x1 = y1;
						y1 = (tmp % y1);
					}

					int x2, y2;
					if (y1 > k) {
						x2 = y1;
						y2 = k;
					} else {
						x2 = k;
						y2 = y1;
					}
					while (x2 % y2 != 0) {
						int tmp = x2;
						x2 = y2;
						y2 = tmp % y2;
					}

					sum += y2;
				}
			}
		}
		//結果出力
		System.out.println(sum);
	}
}