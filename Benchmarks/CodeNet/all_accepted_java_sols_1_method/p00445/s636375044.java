import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while (sc.hasNext()) {
			int ci = 0;
			int cj = 0;
			char[] s = sc.next().toCharArray();
			for (int i = 0; i < s.length - 2; ++i) {
				if (s[i] == 'I' && s[i + 1] == 'O' && s[i + 2] == 'I') ++ci;
				if (s[i] == 'J' && s[i + 1] == 'O' && s[i + 2] == 'I') ++cj;
			}
			System.out.println(cj);
			System.out.println(ci);
		}
	}

}