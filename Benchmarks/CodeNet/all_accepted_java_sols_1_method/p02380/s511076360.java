import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();

		double h=b*Math.sin(Math.toRadians(c));
		double S=a*h/2;
		double l=Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(c)))+a+b;
		System.out.printf("%f", S);
		System.out.println();
		System.out.printf("%f", l);
		System.out.println();
		System.out.printf("%f", h);


	}
}
