
import java.util.Scanner;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {

		int height = scanner.nextInt();
		int length = scanner.nextInt();;

		scanner = new Scanner(System.in);
		while(height < 1 );
		while(length > 100);

		int round = 2*height + 2*length;
		int area = length * height;

		System.out.println(area + " " + round);
	}
}

