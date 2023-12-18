import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			String weather = sc.next();

			if ("Sunny".equals(weather)) System.out.println("Cloudy");
			else if ("Cloudy".equals(weather)) System.out.println("Rainy");
			else if ("Rainy".equals(weather)) System.out.println("Sunny");
		}
	}
}