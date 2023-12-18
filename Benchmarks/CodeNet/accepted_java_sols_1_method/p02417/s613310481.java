import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean f = true;
		int[] c = new int['z' - 'a' + 1];
		while (s.hasNext()) {
			char[] chars = s.next().toLowerCase().toCharArray();
			for (char ch : chars) {
				if (Character.isLetter(ch)) {
					c[ch - 'a']++;
				}
			}
		}
		for (int i = 0; i < c.length; ++i) {
			System.out.printf("%c : %d\n", (char)('a' + i), c[i]);
		}
	}
}