import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		int h = sc.nextInt();
		int m = sc.nextInt();
		double num1 = 0.5*m + 30*h;
		double num2 = 6*m;
		double num3 = 0;
		
		if(num1 > num2) {
			num3 = num1 - num2;
		} else if (num2 > num1){
			num3 = num2 - num1;
		}
		
		if(num3 > 180) {
			num3 = 360- num3;
		}
		


		double cos =  Math.cos(Math.toRadians(num3));
		double c = (a*a+b*b)-(2*a*b*cos);
		double ans = Math.sqrt(c);
		System.out.println(ans);
	}
}
