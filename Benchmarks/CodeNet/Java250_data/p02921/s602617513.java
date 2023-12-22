import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] forecast = sc.next().split("");
		String[] actual = sc.next().split("");

		int count = 0;
		for (int i = 0; i < forecast.length; i++) {
			if (forecast[i].equals(actual[i])) {
				count++;
			}
		}
		System.out.println(count);

	}

}
