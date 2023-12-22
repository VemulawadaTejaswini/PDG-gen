import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String[] weather = { "Sunny", "Cloudy", "Rainy" };
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		for (int i = 0; i < 3; i++) {
			if (s.equals(weather[i]))
				System.out.println(weather[(i + 1) % 3]);
		}
	}

}
