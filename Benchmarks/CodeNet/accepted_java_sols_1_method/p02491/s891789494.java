import java.util.Scanner;
 class Main {
	private static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int d=0,r=0;
		double f=0;
		d = a/b;
		r = a%b;
		f = (double)a/b;
		System.out.printf("%d %d %.5f%n",d,r,f);
	}
 }