import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String S;
		Scanner sc = new Scanner(System.in);
		S = sc.next();
		int minIndex = 0;
		int maxIndex = S.length() - 1;
		while (minIndex < maxIndex) {
			if (S.charAt(minIndex++) != S.charAt(maxIndex--)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		minIndex = 0;
		maxIndex = (S.length() - 1) / 2 - 1;
		while (minIndex < maxIndex) {
			if (S.charAt(minIndex++) != S.charAt(maxIndex--)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		minIndex = (S.length() + 3) / 2 - 1;
		maxIndex = S.length() - 1;
		while (minIndex < maxIndex) {
			if (S.charAt(minIndex++) != S.charAt(maxIndex--)) {
				System.out.println("No");
				System.exit(0);
			}
		}
		System.out.println("Yes");
		sc.close();
	}

}