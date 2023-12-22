import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double H = sc.nextDouble();
		double M = sc.nextDouble();
		
		//時針と分針の角度
		double minuteHand = M / 60;
		double hourHand = (H + minuteHand) / 12;
		double angle = Math.abs(minuteHand - hourHand);

		// 結果の出力
		System.out.println(Math.pow(Math.pow(A, 2) + Math.pow(B, 2) - (2 * A * B * Math.cos(2 * Math.PI * angle)), 0.5));
		
		sc.close();
	}
}
