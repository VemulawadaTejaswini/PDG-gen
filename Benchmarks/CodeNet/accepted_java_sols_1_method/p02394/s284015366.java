import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Integer W = sc.nextInt();
		Integer H = sc.nextInt();
		Integer x = sc.nextInt();
		Integer y = sc.nextInt();
		Integer r = sc.nextInt();

		if (x - r < 0 || y - r < 0 || x + r > W || y + r > H) {
			System.out.println("No");
			return;
		}

		System.out.println("Yes");

	}

}

