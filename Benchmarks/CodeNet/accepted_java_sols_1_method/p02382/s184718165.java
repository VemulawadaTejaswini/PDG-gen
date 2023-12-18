

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		double x[] = new double[N];
		double y[] = new double[N];

		double p1 = 0;
		double p2 = 0;
		double p3 = 0;
		double pmuge = -1;

		//入力を分ける
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			y[i] = sc.nextDouble();
		}
		for (int i = 0; i < N; i++) {
			double ans = Math.abs(x[i] - y[i]);
			p1 += ans;
			p2 += ans * ans;
			p3 += ans * ans * ans;
			pmuge = Math.max(pmuge, ans);
		}
		System.out.println(p1);
		//平方根 2乗の時
		System.out.println(Math.sqrt(p2));
		//立方根 3乗の時
		System.out.println(Math.cbrt(p3));
		System.out.println(pmuge);

	}

}

