import java.util.Scanner;

/**
 * A-Z-
 */
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = 'A' + sc.next();
		int count = 0;

		for (int i = 1; i < S.length(); i++) {
			if (S.charAt(i) <= S.charAt(i - 1)) count++;
		}

		System.out.println(count);
	}
}