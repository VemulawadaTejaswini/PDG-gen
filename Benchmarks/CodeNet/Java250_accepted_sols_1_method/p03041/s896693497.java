import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();
		String newStr;

		newStr = String.valueOf(S.toCharArray()[K - 1]).toLowerCase();

		for (int i = 0; i < N; i++) {
			if (i == K - 1) {
				System.out.print(newStr);
			} else {
				System.out.print(S.toCharArray()[i]);
			}
		}

		System.out.println();
	}
}
