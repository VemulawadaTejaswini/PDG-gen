import java.util.*;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int ang = scan.nextInt();
		double S = 1.0 / 2.0 * a * b * Math.sin(Math.toRadians(ang));
		double L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(ang)));
		double h = b * Math.sin(Math.toRadians(ang));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}