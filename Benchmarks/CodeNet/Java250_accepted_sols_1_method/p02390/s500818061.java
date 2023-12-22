
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		int S;
		while(0 > (S = scanner.nextInt()) || S >= 86400 );

		int hour = S/3600;
		int minute = (S-hour*3600)/60;
		int second = (S-hour*3600-minute*60);
		System.out.println(hour+":"+minute+":"+second);

	}

}

