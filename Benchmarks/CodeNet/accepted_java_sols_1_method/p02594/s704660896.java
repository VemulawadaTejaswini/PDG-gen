import java.util.Scanner;

public class Main {
	public static void main(String[] args){



		try (Scanner scanner = new Scanner(System.in)) {

			int temp = scanner.nextInt();

			System.out.println(temp >= 30 ? "Yes" : "No");
		}
	}
}