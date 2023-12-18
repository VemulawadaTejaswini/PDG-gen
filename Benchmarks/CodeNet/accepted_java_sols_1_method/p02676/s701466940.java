
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int K = scan.nextInt();
		String S = scan.next();
		String ans;

		if (S.length() <= K) {
			System.out.println(S);
		} else {
			ans = S.substring(0, K);
			ans = ans.concat("...");
			System.out.println(ans);

		}

		scan.close();

	}
}
