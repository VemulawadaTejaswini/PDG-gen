import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int st = 0;
		int end = 0;
		int x = 0;
		int cnt = 0;

		Scanner sc= new Scanner(System.in);

		st = sc.nextInt();
		end = sc.nextInt();
		x = sc.nextInt();

		for ( int i = st ; i <= end ; i++ ) {
			if ( x % i == 0) {
				cnt++;
			}
				}
		System.out.println( cnt );
		sc.close();
	}
}

