import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		sc.useDelimiter("\\s");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int C = sc.nextInt();

		double L = a + b + Math.sqrt(a*a + b*b - 2.0*a*b*Math.cos(Math.toRadians(C)));
		double h = b*Math.sin(Math.toRadians(C));
		double S = a*h/2.0;

		System.out.printf("%.8f\n",S);
		System.out.printf("%.8f\n",L);
		System.out.printf("%.8f\n",h);
	}
}