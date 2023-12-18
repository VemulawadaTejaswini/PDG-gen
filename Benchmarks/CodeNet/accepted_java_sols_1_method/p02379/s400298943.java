

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		// 最初の座標
		double firstX = 0;
		double firstY = 0;

		// 二つ目の座標
		double secondX = 0;
		double secondY = 0;

		while (sc.hasNext()) {
			// 最初の座標
			firstX = sc.nextDouble();
			firstY = sc.nextDouble();

			// 二つ目の座標
			secondX = sc.nextDouble();
			secondY = sc.nextDouble();

			break;
		}
		// 二つの座標の距離
		double answer;
		answer = Math.sqrt(((secondX - firstX) * (secondX - firstX))
				+ ((secondY - firstY) * (secondY - firstY)));

		System.out.println(answer);
	}
}