import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextInt();

		long d = (int)(a/b);
		long r = (int)(a%b);
		double f = a/b;
		//System.out.println(d+" "+r+" "+f);
		System.out.printf("%d %d %.7f%n",d,r,f);
	}
}