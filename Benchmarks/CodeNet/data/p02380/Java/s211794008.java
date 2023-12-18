import java.util.Scanner;

public class Main{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		double a,b,C;
		double S,L,h;
		a = sc.nextDouble();
		b = sc.nextDouble();
		C = sc.nextDouble();
		S = Math.sin(Math.toRadians(C)) * ((a * b) / 2);
		L = a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(C)));
		h = Math.sin(Math.toRadians(C)) * b;
		System.out.println(S);
		System.out.println(L);
		System.out.println(h);
	}
}