import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int C = sc.nextInt();

			double S = a*b*Math.sin(Math.toRadians(C))/2;
			double L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2*a*b*Math.cos(Math.toRadians(C)));
			double h = b*Math.sin(Math.toRadians(C));

			System.out.println(S);
			System.out.println(L);
			System.out.println(h);
		}
	}
}


