
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int t = sc.nextInt();

		int minTime = 0;
		if (n % x == 0) {
			minTime = (n / x) * t;
		} else {
			minTime = (n / x + 1) * t;
		}
		System.out.println(minTime);

		sc.close();

	}

}
