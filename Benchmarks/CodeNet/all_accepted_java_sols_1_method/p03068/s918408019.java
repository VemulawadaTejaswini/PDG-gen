
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String S = scanner.next();
		int K = scanner.nextInt();
		// N == S.length();
		char c_replace = S.charAt(K - 1);
		char[] ans = new char[N];
		for (int i = 0; i < N; i++) {
			if(S.charAt(i) == c_replace) {
				ans[i] = c_replace;
			}else {
				ans[i] = '*';
			}
		}
		for(char c: ans) {
			System.out.print(c);
		}
		scanner.close();
	}
}
