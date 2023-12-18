import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double C = Math.toRadians(sc.nextDouble());
		double S = (Math.sin(C) * a) * b/ 2;
		double L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(C));
		double h = b*Math.sin(C);
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
		sc.close();
	}
}

