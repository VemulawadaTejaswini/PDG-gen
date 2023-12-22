import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		if (S.length() % 2 != 0) {
			S = S.substring(0, S.length()/ 2) + S.substring(S.length() / 2 + 1);
		}

		String before = S.substring(0, S.length() / 2);
		String after = S.substring(S.length() / 2);
		int answer = 0;

		for (int i = 0; i < S.length() / 2; i++) {
			if (!(before.charAt(i) == after.charAt(S.length() / 2 - i - 1))) answer++;
		}

		System.out.println(answer);
	}
}
