import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int count01 = 0;
		int count10 = 0;

		for (int i = 0; i < s.length(); i++) {
			if (Integer.parseInt(s.substring(i, i + 1)) == i % 2) {
				count01++;
			}
		}
		count10 = s.length() - count01;
		System.out.println(Math.min(count01, count10));

		sc.close();
	}
}