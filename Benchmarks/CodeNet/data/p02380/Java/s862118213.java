import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int r = sc.nextInt();
		
		double h = Math.sin(Math.toRadians(r))*b;
		double S = a*h/2.0;
		
		double l1 = Math.cos(Math.toRadians(r))*b;
		double l2 = a-l1;
		double c = Math.sqrt(l2*l2+h*h);
		
		System.out.println(String.format("%.5f", S));
		System.out.println(String.format("%.5f", a+b+c));
		System.out.println(String.format("%.5f", h));
	}
}

