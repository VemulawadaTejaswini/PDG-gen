
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();

		char ch[] = new char[S.length()];

		int count = 0;

		for (int i = 0; i < S.length(); i++) {
			ch[i] = S.charAt(i);
		}

		for (int i = 0; i < S.length(); i++) {
			for (int j = i + 1; j < S.length(); j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
		}
		System.out.print(count == 2 ? "Yes" : "No");
	}
}
