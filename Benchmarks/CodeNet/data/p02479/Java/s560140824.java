import java.util.Scanner;
 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int r = sc.nextInt();
		double S=0,L=0;
		S = r*r*Math.PI;
		L = 2*r*Math.PI;
		System.out.printf("%.5f %.5f%n",S,L);
	}
 }