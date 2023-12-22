import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		int n = Integer.parseInt(line);

		System.out
				.println(n / 3600 + ":" + n % 3600 / 60 + ":" + n % 3600 % 60);

	}

}

