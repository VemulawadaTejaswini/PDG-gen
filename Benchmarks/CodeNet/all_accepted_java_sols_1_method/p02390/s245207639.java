import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inSec = sc.nextInt();

		int minutes = 60;
		int hour = minutes * 60;

		int h = 0, m = 0, s = 0;

		if (hour <= inSec) {
			h = inSec / hour;
			inSec %= hour;
		}
		if (minutes <= inSec) {
			m = inSec / minutes;
			inSec %= minutes;
		}
		s = inSec;

		System.out.println(h + ":" + m + ":" + s);

	}

}
