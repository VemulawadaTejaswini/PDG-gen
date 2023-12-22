import java.util.Scanner;

//AtCoder Beginner Contest 147
//B	Palindrome-philia
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		int ans = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != S.charAt(S.length() - 1 - i)) {
				ans++;
			}
			if (i >= (S.length() / 2 - 1)) {
				break;
			}
		}
		System.out.println(ans);
	}
}
