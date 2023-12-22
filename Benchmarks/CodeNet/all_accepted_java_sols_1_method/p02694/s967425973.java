
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long X = scan.nextLong();
		long cash = 100;
		int year = 0;

		while(cash < X) {
			cash = (long) Math.floor(cash * 1.01);
			year++;
		}

		System.out.println(year);
		scan.close();
	}
}
