import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		String ans = "AC";
		int cnt = 0;

		if (!s.startsWith("A")) {
			ans = "WA";
		} else {
			for (int i = 1; i < s.length(); i++) {
				if (i == 1) {
					if (Character.isUpperCase(s.substring(i).charAt(0))) {
						ans = "WA";
						break;
					}
				} else if (i > 1 && i < s.length() - 1) {
					if (s.substring(i, i + 1).equals("C")) {
							cnt++;
					}
				} else {
					if (Character.isUpperCase(s.substring(i).charAt(0))) {
						ans = "WA";
						break;
					} else if (cnt != 1) {
						ans = "WA";
						break;
					}
				}
			}
		}
		System.out.println(ans);

		sc.close();
	}
}
