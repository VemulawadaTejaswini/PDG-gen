import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();
		String[] weather = { "Sunny", "Cloudy", "Rainy" };
		for (int i = 0; i < weather.length; i++) {
			if (S.equals(weather[i])) {
				if (i == 2) {
					System.out.println(weather[0]);
				} else {
					System.out.println(weather[i + 1]);
				}
			}
		}
	}
}
