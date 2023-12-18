import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();

		int ret = -1;
		for ( int i = 0 ; i <= 1100; i++ ) {
			if ( i * 8 / 100 == A && i * 10 / 100 == B ) {
				ret = i;
				break;
			}
		}
		System.out.println(ret);
	}
}
