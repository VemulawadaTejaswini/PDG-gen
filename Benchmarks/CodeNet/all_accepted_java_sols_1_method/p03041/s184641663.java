
import java.util.Scanner;

public class Main {
	public static void main(String arg[]) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int K = sc.nextInt();

		String S = sc.next();
		char[] ch = new char[N];

		for (int i = 0; i < N; i++) {
			ch[i] = S.charAt(i);

			if (i == K - 1) {
				if (ch[i] == 'A') {
					ch[i] = 'a';
				} else if (ch[i] == 'B') {
					ch[i] = 'b';
				} else if (ch[i] == 'C') {
					ch[i] = 'c';
				}
			}
		}

		for (int i = 0; i < N; i++) {
			System.out.print(ch[i]);
		}

	}
}
