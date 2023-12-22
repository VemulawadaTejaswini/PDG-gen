import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] wd = {
				"SAT",
				"FRI",
				"THU",
				"WED",
				"TUE",
				"MON",
				"SUN",
		};
		String s = sc.next();
		int ans = 99;
		for (int i = 0; i < wd.length; i++) {
			if (s.equals(wd[i])) {
				ans = i + 1;
				break;
			}
		}
		System.out.println(ans);
		sc.close();
	}
}
