import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		int div = 1;
		while ( div < 10 ) {
			int rem = n % div;
			int quo = n / div;
			if ( rem == 0 && quo < 10 ) {
				System.out.println("Yes");
				return;
			} else {
				div++;
			}
		}
		System.out.println("No");
	}
}
