import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String[] s = new String[S.length()];
		for (int i = 0; i < S.length(); i++) {
			s[i] = String.valueOf(S.charAt(i));
		}
		String before = "";
		int district = 0;
		for (int i = 0; i < s.length; i++) {
			if (!before.equals(s[i])) {
				district++;
			}
			before = s[i];
		}
		System.out.println(district - 1);
	}
}