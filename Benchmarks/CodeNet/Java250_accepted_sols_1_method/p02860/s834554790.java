import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String S = sc.next();

		if (S.length() <= 1) {
			System.out.println("No");
		}
		else {
			String left = S.substring(0, N / 2);
			String right = S.substring((N / 2));
			if (left != null && left.equals(right)) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
	}
}
