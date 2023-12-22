import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int K = scanner.nextInt();
		char st[] = new char[s.length()];
		boolean flag = true;
		for (int i = 0; i < st.length; i++) {
			st[i] = (char) (s.charAt(i) - 'a');
			if (st[i] != 0 && flag) {
				if (K - 26 + st[i] >= 0) {
					K = K - 26 + st[i];
					st[i] = 0;
				} else {
					// flag = false;
				}
			}
		}
		st[st.length - 1] = (char) ((st[st.length - 1] + K) % 26);
		for (int i = 0; i < st.length; i++) {
			System.out.print((char) (st[i] + 97));
		}
		System.out.println("");

	}
}
