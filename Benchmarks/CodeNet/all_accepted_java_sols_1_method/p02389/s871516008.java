import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int S = a*b;
		int L = 2*(a+b);
		System.out.println(S+" "+L);
	}
}