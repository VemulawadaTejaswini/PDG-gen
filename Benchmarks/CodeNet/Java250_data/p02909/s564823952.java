import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		if (input.equals("Sunny")) {
			System.out.println("Cloudy");
		} else if (input.equals("Rainy")) {
			System.out.println("Sunny");
		} else {
			System.out.println("Rainy ");
		}
	}
}
