import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String[] tenki = {"Sunny","Cloudy","Rainy"};

			String n = scanner.next();
			int i;
			for (i = 0; i < 3; i++) {
				if (tenki[i].equals(n)) {
					break;
				}
			}
			System.out.println(i == 2 ? tenki[0] : tenki[i+1]);
		}
	}
}
