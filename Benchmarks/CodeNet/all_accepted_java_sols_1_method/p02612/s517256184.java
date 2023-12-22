import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		try (Scanner scanner = new Scanner(System.in)) {
			int price = scanner.nextInt();

			System.out.println((price % 1000 == 0) ? 0 : 1000 - price % 1000);
		}
	}
}