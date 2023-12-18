import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double a = sc.nextDouble(), b = sc.nextDouble(),
			   C = sc.nextDouble();
		
		double S = 0.5 * a * b * Math.sin(Math.toRadians(C)),
			   L = a + b + Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(C))),
			   h = b * Math.sin(Math.toRadians(C));
		
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}