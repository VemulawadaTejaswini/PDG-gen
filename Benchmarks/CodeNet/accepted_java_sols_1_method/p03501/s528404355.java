import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();

		int AA = A * N;
		int ans = 0;

		if ( AA < B ) {
			ans = AA ;
		} else if ( AA > B ) {
			ans = B ;
		} else {
			ans = AA ;
		}
		System.out.println( ans );
	}
}