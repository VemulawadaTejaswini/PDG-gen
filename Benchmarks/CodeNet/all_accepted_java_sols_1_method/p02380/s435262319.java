import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		double c=Math.toRadians(sc.nextInt());
		double S,L,h;
		sc.close();
		double x=b*Math.tan(c)/Math.sin(c)-a;
		L=Math.sqrt(a*a+b*b-2*a*b*Math.cos(c))+a+b;
		S=a*Math.sin(c)*b/2;
		h=b*Math.sin(c);
		System.out.printf("%f %f %f%n",S,L,h);
				

	}
}