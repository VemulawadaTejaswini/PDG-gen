
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		String S = in.next();
		int preCount = 0;
		int suffCount = 0;
		StringBuilder ans = new StringBuilder(S);
		for (int i = 0; i < N; i++) {
			if (S.charAt(i) == '(') {
				preCount++;
			}
			if (S.charAt(i) == ')') {
				suffCount++;
			}
			if (preCount > 0 && S.charAt(i) == ')') {
				preCount--;
				suffCount--;
			}
		}
		for (int i = 0; i < suffCount; i++) {
			ans.insert(0, '(');
		}
		for (int i = 0; i < preCount; i++) {
			ans.append(")");
		}
		System.out.println(ans.toString());
		in.close();
	}
}