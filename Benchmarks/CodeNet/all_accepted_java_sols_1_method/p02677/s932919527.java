import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double aAng = h * 30 + m * 0.5;
		double bAng = m * 6;
		System.out.println(
				Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a * b * Math.cos(Math.toRadians(Math.abs(360-(aAng - bAng))))));
	}

}
