import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			char[] s = scanner.next().toCharArray();
			char[] t = scanner.next().toCharArray();
			// sを2つ結合する
			char[] newS = new char[2 * s.length];
			System.arraycopy(s, 0, newS, 0, s.length);
			System.arraycopy(s, 0, newS, s.length, s.length);
			boolean result = false;
			for (int i = 0; i < s.length; i++) {
				int count = 0;
				while ((count < s.length) && (newS[i + count] == t[count])) {
					count++;
				}
				if (s.length == count) {
					result = true;
					break;
				}
			}
			System.out.println(result ? "Yes" : "No");
		}
	}
}
