import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] s = scanner.next().toCharArray();
		char[] r = new char[s.length];
		for (int i = s.length - 1, j = 0; i >= 0; i--, j++) {
			r[j] = s[i];
		}
		System.out.println(r);
	}
}