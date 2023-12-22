
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();

		int ans_n =( n * (n-1) ) / 2;
		int ans_m =( m * (m-1) ) / 2;

		System.out.println( ans_n + ans_m );

		sc.close();

	}

}
