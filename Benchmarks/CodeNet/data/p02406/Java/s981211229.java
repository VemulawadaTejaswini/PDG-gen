import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		for ( int i = 1; i <= n; ++i ) {
			int x = i;
			if ( x % 3 == 0 ) {
				System.out.print(" " + x);
			} else {
				for (; x != 0; x /= 10) {
					if ( x % 10 == 3 ) {
						System.out.print(" " + x);
					}
				}
			}
		}
		System.out.println();
	}
}

