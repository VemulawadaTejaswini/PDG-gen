import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int h = sc.nextInt();
		int m = sc.nextInt();
		int num1 = 30*h;
		int num2 = 6*m;
		int num3 = 0;
		
		if(num1 > num2) {
			num3 = num1 - num2;
		} else {
			num3 = num2 - num1;
		}
		
		if(num3 > 180) {
			num3 = 360- num3;
		}
		
		
		if(num3 == 0) {
			if(a > b) {
				System.out.println(a-b);
				return;
			} else if (b > a) {
				System.out.println(b-a);
				return;
			} else if (a == b) {
				System.out.println(0);
				return;
			}
		}
		
		if(num3 == 180) {
			System.out.println(a+b);
		}
		
	
		
		

		double cos =  Math.cos(Math.toRadians(num3));

		double aa = (a*a+b*b)-(2*a*b*cos);
		double ans = Math.sqrt(aa);
		System.out.println(ans);
	}
}