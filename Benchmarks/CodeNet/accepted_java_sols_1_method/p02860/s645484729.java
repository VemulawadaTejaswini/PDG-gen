import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		String str = S.substring(S.length() / 2);

		if (S.equals(str + str)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
