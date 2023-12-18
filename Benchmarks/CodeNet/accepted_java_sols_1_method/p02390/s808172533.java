import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int S = Integer.parseInt(input);
		int hour = 0;
		int minutes = 0;
		int second = 0;

		if (S >= 0 && S <= 86400) {
			if (S >= 60) {
				minutes = S / 60;
				second = S % 60;
			} else {
				second = S;
			}

			if (minutes >= 60) {
				hour = minutes / 60;
				minutes = minutes % 60;
			}
		}
		System.out.println(hour + ":" + minutes + ":" + second);
	}

}

