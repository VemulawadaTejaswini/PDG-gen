import java.util.Scanner;

class Main
{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		Double Sin = Math.sin(Math.toRadians(c));
		
		double d = (a * a) + (b * b) - (2 * a * b * Math.cos(Math.toRadians(c)));
		
		double S = 0.5 * a * b * Sin;
		double L = a + b + Math.sqrt(d);
		double h = b * Sin;
		
		System.out.printf("%.8f\n", S);
		System.out.printf("%.8f\n", L);
		System.out.printf("%.8f\n", h);
	}
}
