import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double n = in.nextDouble();

		double ans = 0.5;
		if ( n == 1.0 ) {
			ans = 1;
		} else if ( n % 2 == 1 ) {
			ans = Math.ceil(n / 2.0) / n;
		}

		System.out.println(ans);
		in.close();
	}
}