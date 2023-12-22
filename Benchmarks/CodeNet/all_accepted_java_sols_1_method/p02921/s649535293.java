import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		char[] sChar = s.toCharArray();
		char[] tChar = t.toCharArray();

		int cnt = 0;
		for (int i = 0; i < 3; i++) {
			if (sChar[i] == tChar[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}