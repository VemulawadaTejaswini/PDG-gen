import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int X = scan.nextInt();
		int A = scan.nextInt();
		int ans = 0 ;

		if ( X >= A ) {
			ans = 10;
		}
		System.out.println(ans);
	}
}