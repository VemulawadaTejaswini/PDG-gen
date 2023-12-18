import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.substring(i, i + 1).equals("0")) {
				count++;
			}
		}

		System.out.println(Math.min(2 * count, 2 * (s.length() - count)));
		sc.close();
	}
}