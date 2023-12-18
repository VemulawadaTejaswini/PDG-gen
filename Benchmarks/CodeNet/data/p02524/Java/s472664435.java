import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int  a,b,C;
		double S,L,h;
		a = sc.nextInt();
		b = sc.nextInt();
		C = sc.nextInt();
		S = 1/2 * a * b * Math.sin(C);
		L = a + b + Math.sqrt(a*a + b*b - 2*a*b*Math.cos(C));
		h = 2*S / a;
		System.out.printf("%8f\n%8f\n%8f", S,L,h);
	}
}