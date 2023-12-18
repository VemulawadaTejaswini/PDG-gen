import java.util.*;

class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		double a = sc.nextDouble(); double b = sc.nextDouble(); double angle = Math.toRadians(sc.nextDouble());
		double c = Math.sqrt(a*a+b*b-(2*a*b*Math.cos(angle)));
		
		double x = (a*a+b*b-c*c)/(2*a);
		double y = Math.sqrt(b*b-x*x);
		
		System.out.println(String.format("%.5f",a*y/2));
		System.out.println(String.format("%.5f",a+b+c));
		System.out.println(String.format("%.5f",y));
	}
}
