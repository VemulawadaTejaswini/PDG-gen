

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int n = sc.nextInt();
			int[] s = new int[n];
			int sum = 0;

			if (n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				s[i] = sc.nextInt();
//点数を合計する
				sum += s[i];
			}
//平均を出す
			double ave = sum / (double) n;
			double a = 0;
			for (int i = 0; i < n; i++) {
//偏差求める
				a += (s[i] - ave) * (s[i] - ave);
			}
//分散を求める
			a = a / (double) n;
//分散の正の平方根を計算
			System.out.println(Math.sqrt(a));
		}

	}
}
