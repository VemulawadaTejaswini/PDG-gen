
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a, b, C, S, L, h;
		a = scan.nextDouble();
		b = scan.nextDouble();
		C = scan.nextDouble();
		S = (a * b * Math.sin(Math.toRadians(C)))/2;
		L = (a + b) + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
		h = b * Math.sin(Math.toRadians(C));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}