import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int K = sc.nextInt();
		String S = sc.next();

		int A = S.length();

		if (A > K) {

			String B = S.substring(0, K);

			System.out.print(B + "...");
		} else {
			System.out.print(S);
		}
	}

}
