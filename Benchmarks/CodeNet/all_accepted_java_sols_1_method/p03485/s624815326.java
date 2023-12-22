import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int ave = ( a + b ) / 2;
		int ans = 0;

		if ( ( a + b ) % 2 == 0) {
			ans = ave;
		} else {
			ans = ave + 1;
		}

		System.out.println( ans );
	}
}