import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		double C  =  Math.toRadians(sc.nextInt());
		double S = a * b * Math.sin(C) / 2;
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C));
		double h = S * 2 / a;
		System.out.printf("%.8f\n%.8f\n%.8f\n",S, L, h);
	}

}