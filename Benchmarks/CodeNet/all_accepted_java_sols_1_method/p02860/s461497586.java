import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N	 = scan.nextInt();
		String S = scan.next();
		String front	= S.substring(0, S.length()/2);
		String behind	= S.substring(S.length()/2, S.length());

		if (N % 2 == 0 && front.equals(behind)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}