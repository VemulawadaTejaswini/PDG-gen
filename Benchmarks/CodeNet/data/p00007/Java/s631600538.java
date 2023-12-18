import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println( calc_debt( sc.nextInt() ) );
		sc.close();
	}

	private static long calc_debt(int nextInt) {
		int n = nextInt;
		long d = 100;

			for (int i = 0; i < n; i++) {
				d = (long)Math.ceil( d * 1.05);
			}
			
		long debt = d * 1000;
		return debt;
	}

}
