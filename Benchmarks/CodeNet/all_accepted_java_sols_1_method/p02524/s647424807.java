import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double S = (double) a*b*Math.sin(Math.toRadians(c))/2;
		double c2 = a*a+b*b-2*a*b*Math.cos(Math.toRadians(c));
		double L = a + b + Math.sqrt(c2);
		double h = b*Math.sin(Math.toRadians(c));
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}

}