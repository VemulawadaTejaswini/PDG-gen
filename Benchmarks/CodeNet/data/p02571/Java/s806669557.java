import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String t = sc.nextLine();

		int ans = 1000;

		for (int i = 0; i <= s.length() - t.length(); i++) {
			int tmp = 0;

			for (int j = 0; j < t.length(); j++) {
				if (!(s.substring(i + j, i + j + 1).equals(t.substring(j, j + 1)))) {
					tmp++;
				}
			}

			if (tmp < ans) {
				ans = tmp;
			}

		}

		System.out.println(ans);

		sc.close();
	}

}