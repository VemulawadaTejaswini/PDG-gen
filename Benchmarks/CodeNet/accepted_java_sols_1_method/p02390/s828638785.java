import java.util.Scanner;

public class Main {

	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		int min, hour;

		min = sec / 60;
		sec = sec % 60;

		hour = min / 60;
		min = min % 60;

		System.out.println(hour + ":" + min + ":" + sec);

	}

}

