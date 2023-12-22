
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Long X = Long.parseLong(scanner.next());
		Double num = 100.0;
		int year= 0;
		do {
			year++;
			num = Math.floor(num * 1.01);
		} while (num < X);
		System.out.println(year);
	}

}
