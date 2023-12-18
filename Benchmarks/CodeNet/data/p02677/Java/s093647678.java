

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		//	0<=h<=11
		int h = scan.nextInt();
		//	0<=m<=59
		int m = scan.nextInt();

		double zishinKakudo = (Math.PI * h / 6) + (Math.PI * m / 6 / 60);
		double hunshinKakudo = Math.PI * 2 * m / 60;

		double diffOfKakudo = Math.abs(zishinKakudo - hunshinKakudo);

		if (diffOfKakudo > Math.PI) {
			diffOfKakudo = diffOfKakudo - Math.PI;
		}

		double L = Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b * Math.cos(diffOfKakudo));
		double l = Math.sqrt(L);
		System.out.println(l);

	}

}
