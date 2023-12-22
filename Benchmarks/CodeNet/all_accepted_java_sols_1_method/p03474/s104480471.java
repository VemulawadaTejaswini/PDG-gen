import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		String S = sc.next();
		sc.close();
		char c[] = S.toCharArray();
		if (c[A] == '-') {
			int sum = 0;
			for (int i = 0; i < S.length(); i++) {
				if ('0' <= c[i] && c[i] <= '9') {
					sum++;
				}
			}
			if (sum == S.length() - 1) {
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
