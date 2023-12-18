import java.util.Scanner;

public class P0021 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			double[] p = new double[8];
			// 座標入力
			for (int j = 0; j < 8; j++) {
				p[j] = sc.nextDouble();
			}

			// 傾き
			double a1 = (p[3] - p[1]) / (p[2] - p[0]);
			double a2 = (p[7] - p[5]) / (p[6] - p[4]);

			// 判定
			if (a1 == a2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}