import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if ( a < b && b < c && a < c ) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}