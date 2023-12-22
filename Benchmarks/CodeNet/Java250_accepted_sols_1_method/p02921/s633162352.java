import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String T = sc.next();
		char[] s = S.toCharArray();
		char[] t = T.toCharArray();
		int a = 0;
		sc.close();

		for (int i = 0; i < 3; i++) {
			if (s[i] == t[i]) {
				a++;
			}
		}
		System.out.println(a);
	}
}
