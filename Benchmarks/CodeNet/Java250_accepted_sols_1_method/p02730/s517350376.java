import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String S  = scan.next();
		int N = S.length();
		int f = 0;

		for (int i = 0; i < N/2; i++) {
			if (S.charAt(i) != S.charAt(N-1-i)) {
				f++;
				break;
			}
		}

		for (int i = 0; i < N/4; i++) {
			if (S.charAt(i) != S.charAt((N-3)/2 - i)) {
				f++;
				break;
			}
		}

		if (f == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}