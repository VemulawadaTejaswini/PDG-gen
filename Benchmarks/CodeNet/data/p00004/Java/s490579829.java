import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double d = sc.nextDouble();
		double e = sc.nextDouble();
		double f = sc.nextDouble();
		
		double x = 1/(a*e - b*d) * (e*c - b*f);
		double y = 1/(a*e - b*d) * (-d*c + a*f);
		
		
		
		x = (double)Math.round(1000*x) / 1000;
		y = (double)Math.round(1000*y) / 1000;
		
		
		System.out.printf("%.3f %.3f", x, y);
		
	}

}