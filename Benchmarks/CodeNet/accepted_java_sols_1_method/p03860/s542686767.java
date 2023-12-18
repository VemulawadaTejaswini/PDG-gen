import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		boolean flag = false;

		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		String[] contest = s.split(" ");

		if (contest.length == 3 && contest[1].length() < 101
				&& "AtCoder".equals(contest[0]) && "Contest".equals(contest[2])) {
			if (Character.isUpperCase(contest[1].charAt(0))) {
				if (contest[1].length() > 1
						&& Character.isLowerCase(contest[1].charAt(1))) {
					flag = true;
				} else if (contest[1].length() == 1) {
					flag = true;
				}
			}
		}

		String ans = new String();

		if (flag) {
			for (int i = 0; i < contest.length; i++) {
				ans = ans + contest[i].charAt(0);
			}

			System.out.println(ans);

		}
	}
}