
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		String ans = "No";

		for (int i = 0; i < 3; i++) {

			if (n % 10 == 7) {
				ans = "Yes";
			}
			n = n / 10;
		}

		System.out.println(ans);
	}

}
