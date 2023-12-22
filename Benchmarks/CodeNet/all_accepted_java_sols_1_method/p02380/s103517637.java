import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();
		double h = b * Math.sin(Math.toRadians(C));
		double S = a * h / 2;
		double c = Math.sqrt(a * a + b * b - (2 * a * b * Math.cos(Math.toRadians(C))));
		double L = a + b + c;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}