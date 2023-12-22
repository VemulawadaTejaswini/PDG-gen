import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int four = 0;
		int two = 0;
		int others = 0;
		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			if (a % 4 == 0) {
				four++;
			} else if (a % 2 == 0) {
				two++;
			} else {
				others++;
			}
		}
		if ((two >= 2 && four >= others) ||
			(two == 0 && four >= others - 1) ||
			(four >= others + two - 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
