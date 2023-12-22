import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double C = sc.nextDouble();
		
		double S = 0.5*a*b*Math.sin(Math.toRadians(C));
		double c = Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2)-(2*a*b*Math.cos(Math.toRadians(C))));
		double L = a + b + c;
		double h = 2*S / a;
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);

	}
}