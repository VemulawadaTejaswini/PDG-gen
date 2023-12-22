import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.next();

		int nextDay = 0;

		// 次の日曜日
		switch (s) {
			case "SUN":
				nextDay = 7;
				break;
			case "MON":
				nextDay = 6;
				break;
			case "TUE":
				nextDay = 5;
				break;
			case "WED":
				nextDay = 4;
				break;
			case "THU":
				nextDay = 3;
				break;
			case "FRI":
				nextDay = 2;
				break;
			case "SAT":
				nextDay = 1;
				break;
		}

		System.out.println(nextDay);
	}
}