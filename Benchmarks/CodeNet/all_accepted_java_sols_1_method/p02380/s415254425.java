import java.util.*;
import java.lang.*;


class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		System.out.println(a * b / 2 * Math.sin(Math.toRadians(c)));
		System.out.println(a + b + Math.sqrt(Math.pow(a,2) + Math.pow(b, 2) - 2 * a * b * Math.cos(Math.toRadians(c))));
		System.out.println(b * Math.sin(Math.toRadians(c)));
		
	}
}
