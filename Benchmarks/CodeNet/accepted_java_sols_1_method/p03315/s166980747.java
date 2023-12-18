
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		sc.close();

		int p = 0;
		int m = 0;

		char ch[] = new char[S.length()];

		for (int i = 0; i < S.length(); i++) {
			ch[i] = S.charAt(i);

			if (ch[i] == '+') {
				p++;
			} else if (ch[i] == '-') {
				m++;
			}
		}
		System.out.print(p-m);
	}
}