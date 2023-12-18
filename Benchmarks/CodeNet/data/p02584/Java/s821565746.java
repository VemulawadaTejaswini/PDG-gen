import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long K = scan.nextLong();
		long D = scan.nextLong();

		boolean f = false;

		if (X >= 0) f = X - (K * D) <= 0;
		else f = X + (K * D) > 0;

		if (f) {
			if (X >= 0) {
				long i =  K - (long)(Math.floor(X / D));
				if (i % 2 == 0) System.out.println(X % D);
				else System.out.println(Math.abs((X % D) - D));
			}
			else {
				long i = K + (long)(Math.ceil(X / D));
				if (i % 2 == 0) System.out.println(X % D);
				else System.out.println((Math.abs(X % D) + D));
			}
		}
		else {
			if (X >= 0) System.out.println(X - (K * D));
			else System.out.println(X + (K * D));
		}
 	}
}