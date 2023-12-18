import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		sc.close();

		if ( N % 2 != 0 ) {
			System.out.println("No");
		} else {
			boolean ans = true;
			for ( int i = 0 ; i < N / 2 ; i++ ) {
				if ( S.charAt(i) != S.charAt(i + N / 2) ) {
					ans = false;
					break;
				}
			}
			System.out.println(ans ? "Yes" : "No");
		}
	}
}
