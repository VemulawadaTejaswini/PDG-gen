import java.util.*;

public class Main {
	public static void main(String... args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();

		if("Sunny".equals(n)) {
			System.out.println("Cloudy");
		}
		if("Cloudy".equals(n)) {
			System.out.println("Rainy");
		}
		if("Rainy".equals(n)) {
			System.out.println("Sunny");
		}

	}
}