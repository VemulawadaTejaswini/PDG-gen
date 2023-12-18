import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = (String)sc.next();
		String Ti;
		int cnt = 0;
		// proceed if T[i](next sc) does not equal to "END_OF_TEXT".
		while (!((Ti = (String)sc.next()).equals("END_OF_TEXT"))) {
			// not distinguish A/a.
			if (Ti.toLowerCase().equals(W.toLowerCase()))
				++cnt;
		}
		System.out.println(cnt);
	}
}
