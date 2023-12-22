import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		String ans = "";

		for (int i = 0; i < s.length(); i++) {
			switch (s.substring(i, i + 1)) {
			case "1":
				ans += "1";
				break;
			case "0":
				ans += "0";
				break;
			case "B":
				if (ans.length() != 0) {
					ans = ans.substring(0, ans.length() - 1);
				}
				break;
			}
		}

		System.out.println(ans);

		sc.close();

	}
}
