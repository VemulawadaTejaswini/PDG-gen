import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		double ma = 360 / 60 * m;
		double ha = 360 / 12 * h + 30.0 / 60 * m;
		
		double x = Math.abs(ma - ha);
		x = Math.min(x, 360 - x);
		x = Math.toRadians(x);
		
		double ans = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(x));
		
		System.out.println(ans);
		
	}
}