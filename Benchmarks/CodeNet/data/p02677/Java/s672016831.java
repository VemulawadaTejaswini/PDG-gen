import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double angle = 0;
		double hAngle = h * 30 + m * 0.5;
		int mAngle = m * 6; 
		if(Math.abs(mAngle - hAngle) > 180 ) {
			angle = 360- mAngle - hAngle;
		}else {			
			angle = mAngle - hAngle;
		}
		double cos = Math.cos(Math.toRadians(angle));
		double result =  Math.sqrt(a*a + b*b - (2*a*b*cos));
		System.out.println(result);
		sc.close();
	}
}
