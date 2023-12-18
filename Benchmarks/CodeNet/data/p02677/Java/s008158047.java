import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int H = sc.nextInt();
		int M = sc.nextInt();

		// 角度計算M
		double angleM = ((double)M / 60) * 360;
//		System.out.println("M is " + angleM);

		// 角度計算H
		double tmpM = ((double)M / 60) * 30;;
		double angleH = (double)(H*30 + tmpM);

//		System.out.println("H is " + angleH);
//		System.out.println();

		// 角度計算
		double theta = angleH - angleM;
		if (theta > 180)
			theta = angleM - angleH;

//		System.out.println(theta);

		// 計算
		double ans = A * A + B * B - 2 * A * B * Math.cos(Math.toRadians(theta));
		double r_ans = Math.sqrt(ans);

		System.out.println(r_ans);

	}

}
