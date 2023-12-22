import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double D8 = 0.08;
		final double D10 = 0.10;
		int a = sc.nextInt();
		int b = sc.nextInt();

		for(int i = 0; i <= 100 / D8; i++) {
			if( a == (int)( i * D8) ) {
				if( b == (int)(i * D10) ) {
					System.out.println(i);
					System.exit(0);
				}
			}
		}
		System.out.println(-1);
	}
}
