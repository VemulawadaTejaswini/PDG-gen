import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.next();
		scanner.close();
		int plus = 0, minus = 0;

		for (int n = 0; n < S.length(); n++) {
			String s = S.substring(n, n + 1);
			if (s.equals("+")) {
				plus++;
			} else if (s.equals("-")) {
				minus++;
			}
		}
		int A = plus - minus;
		System.out.println(A);
	}
}