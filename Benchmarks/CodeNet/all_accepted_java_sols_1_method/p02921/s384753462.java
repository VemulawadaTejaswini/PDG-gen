import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		String t = sc.next();
		int r = 0;
		for (int i = 0; i < 3; i++) {
			if (s.charAt(i) == t.charAt(i)) {
				r++;
			}
		}
		System.out.println(r);
		sc.close();
	}
}
