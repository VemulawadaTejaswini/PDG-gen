import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int x = 0;
		int y = 0;
		int tmp = 0;
		Scanner sc= new Scanner(System.in);

		while( true ) {

			x = sc.nextInt();
			y = sc.nextInt();

			if( ( x == 0 ) && ( y == 0 ) ) {
				break;
			}

			if( x > y ) {
				tmp = x;
				x = y;
				y = tmp;
			}
			
			System.out.println( x + " " + y );
		}
		sc.close();
	}

}
