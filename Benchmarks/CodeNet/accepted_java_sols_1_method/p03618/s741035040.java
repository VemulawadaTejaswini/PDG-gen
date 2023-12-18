import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		long answer = (long) s.length() * (long) (s.length() - 1) / 2;

		for (int i = 0; i < 26; i++) {
			long c = 0;
			for (int j = 0; j < s.length(); j++) {
				if ((int) (s.charAt(j) - 'a') == i) {
					c++;
				}
			}
			answer -= c * (c - 1) / 2;
		}

		System.out.println(answer + 1);
	}
}
