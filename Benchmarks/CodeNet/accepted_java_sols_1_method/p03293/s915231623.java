import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		boolean possible = false;

		for (int i = 0; i < S.length(); i++) {
			S = S.substring(1) + S.substring(0, 1);
			if (S.equals(T)) possible = true;
		}

		if (possible) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
