import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			s.nextInt();
			final int K = s.nextInt();
			s.nextLine();
			final String S = s.nextLine();

			char[] cs = S.toCharArray();
			switch (cs[K - 1]) {
			case 'A':
				cs[K - 1] = 'a';
				break;
			case 'B':
				cs[K - 1] = 'b';
				break;
			default:
				cs[K - 1] = 'c';
				break;
			}
			System.out.println(new String(cs));
		}
	}
}
