import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int a = sc.nextInt();
		int b = sc.nextInt();
		String s = sc.next(), ans = "Yes";

		for (int i = 0; i < s.length(); i++) {
			if (i == (a)) {
				if (!s.substring(i, i + 1).equals("-")) {
					ans = "No";
					break;
				}
			} else {
				if (!s.substring(i, i + 1).matches("1|2|3|4|5|6|7|8|9|0")) {
					ans = "No";
					break;
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}
}