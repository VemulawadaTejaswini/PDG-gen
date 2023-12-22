import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		// int m = sc.nextInt();

		int n = s.length();
		boolean isPal = true;
		for (int i = 0; i < (n - 1) / 2; i++) {
			if (s.charAt(i) == s.charAt(n - 1 - i)) {
				continue;
			} else {
				isPal = false;
				break;
			}
		}
		for (int i = 0; i < n / 4; i++) {
			if (s.charAt(i) == s.charAt((n - 3) / 2 - i) && s.charAt((n + 3) / 2 - 1 + i) == s.charAt(n - 1 - i)) {
				continue;
			} else {
				isPal = false;
				break;
			}
		}
		if (isPal) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		sc.close();
	}
}