import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {

			//a^2 = b^2 + c^2 - 2*b*c*cosA
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			double h  = sc.nextInt();
			double m = sc.nextInt();
			
			//calc radius from h and m
			double radius = (h / 12 + m/(60*12) - m /60) * Math.PI * 2.0;
//			if ( radius > Math.PI) {
//				radius = 2*Math.PI - radius;
//			}
//			System.out.println((h/12 - m / 60) * 360);
//			System.out.println(radius);
//			System.out.println(Math.pow(a, 2));
//			System.out.println(Math.pow(b, 2));
//			System.out.println(2 * a * b * Math.cos(radius));
			
			double ans = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2) - 2*a*b*Math.cos(radius));
			
			System.out.println(ans);
			
		}
	}

}