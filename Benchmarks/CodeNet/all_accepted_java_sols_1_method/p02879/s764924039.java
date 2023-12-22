import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		if( a < 0 || a > 20) {
			System.err.println("a is not in [0,20]");
			System.exit(1);
		}
		int b = sc.nextInt();
		if( b < 0 || b > 20) {
			System.err.println("b is not in [0,20]");
			System.exit(1);
		}
		if( a <= 9 && b <= 9) {
			System.out.println( a * b );
		}
		else {
			System.out.println("-1");
		}
	}
}
