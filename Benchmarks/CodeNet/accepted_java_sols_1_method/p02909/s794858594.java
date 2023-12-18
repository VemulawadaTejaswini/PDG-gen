import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if (s.equals("Sunny")) {
			System.out.println("Cloudy");
		} else if (s.equals("Cloudy")) {
			System.out.println("Rainy");
		} else {
			System.out.println("Sunny");
		}
	}
}
