import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		final int a = sc.nextInt();
		final int b = sc.nextInt();
		final int C = sc.nextInt();
		
		final double h = Math.sin(Math.toRadians(C)) * b;
		
		final double c = C >= 90 ? Math.sqrt(a * a + b * b) : Math.sqrt(Math.max(a, b) * Math.max(a, b) - Math.min(a, b) * Math.min(a, b));
		
		System.out.printf("%.7f\n%.7f\n%.7f\n", a * h / 2, a + b + c, h);
		
	}
}