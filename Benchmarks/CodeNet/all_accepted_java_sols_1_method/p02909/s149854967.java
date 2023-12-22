import java.util.*;

public class Main {
	public static void main(String[] args) {
		// practice contest

		Scanner sc = new Scanner(System.in);

		String s = sc.nextLine();

		String a[] = { "Sunny", "Cloudy", "Rainy" };
		if (s.equals(a[0])) {
			System.out.println("Cloudy");
		} else if (s.equals(a[1])) {
			System.out.println("Rainy");
		} else if (s.equals(a[2])) {
			System.out.println("Sunny");
		}
	}
}
