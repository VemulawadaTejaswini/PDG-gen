import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char[] c = S.toCharArray();
		sc.close();

		for (int i = 1; i < 3; i++) {
			if (c[i - 1] != c[i]) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
