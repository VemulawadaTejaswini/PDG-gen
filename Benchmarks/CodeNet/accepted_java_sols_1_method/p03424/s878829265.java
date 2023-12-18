import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S[] = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
			char c[] = S[i].toCharArray();
			if (c[0] == 'Y') {
				System.out.println("Four");
				sc.close();
				return;
			}
		}
		sc.close();
		System.out.println("Three");
	}
}
