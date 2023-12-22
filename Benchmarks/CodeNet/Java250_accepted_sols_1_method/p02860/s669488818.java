import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean ans = true;
		String s = sc.next();
		char c[] = s.toCharArray();
		if (n % 2 == 1) {
			System.out.println("No");
		} else {
			for (int i = 0; i <= (s.length() / 2) - 1; i++) {
				if (c[i] != c[i +( s.length() / 2)]) {
					//System.out.println("!");
					ans = false;
				}
			}
			if (ans) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}

	}
}