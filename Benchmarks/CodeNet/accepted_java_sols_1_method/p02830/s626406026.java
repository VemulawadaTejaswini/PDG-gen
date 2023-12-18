
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			int N = sc.nextInt();

			String S = sc.next();
			String T = sc.next();

			char[] s = S.toCharArray();
			char[] t = T.toCharArray();

			char[] c = new char[2 * N];
			for (int i = 0; i < N; i++) {
				c[2 * i] = s[i];
				c[2 * i + 1] = t[i];
			}

			System.out.println(new String(c));

		}
	}

}
