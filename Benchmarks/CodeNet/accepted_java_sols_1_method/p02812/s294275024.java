import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		long N = scanner.nextLong();
		String S = scanner.next();

		long ans = 0;
		for (int i = 0; i < N - 2; i++) {
			boolean a = S.charAt(i) == 'A';
			boolean b = S.charAt(i + 1) == 'B';
			boolean c = S.charAt(i + 2) == 'C';
			if (a && b && c) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}