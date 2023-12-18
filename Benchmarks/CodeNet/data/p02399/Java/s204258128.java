

import java.util.Scanner;

class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.printf("%d %d %f\n", a/b, a%b, (double)a/b);
	}
}