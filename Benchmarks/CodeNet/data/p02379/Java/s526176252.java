

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		//
		Scanner sc = new Scanner(System.in);
		// 最初の座標
		int firstX = 0;
		int firstY = 0;

		// 二つ目の座標
		int secondX = 0;
		int secondY = 0;

		while (sc.hasNext()) {
			// 最初の座標
			firstX = sc.nextInt();
			firstY = sc.nextInt();

			// 二つ目の座標
			secondX = sc.nextInt();
			secondY = sc.nextInt();

			break;
		}
		// 二つの座標の距離
		double answer;
		answer = Math.sqrt(((secondX - firstX) * (secondX - firstX))
				+ ((secondY - firstY) * (secondY - firstY)));

		System.out.println(answer);
	}
}