
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int y = 0;
		int counter = 0;
		for (int j = 1; j <= n; j+=2) {

			y = 0;
			for (int i = 1; i <= j; i++) {
				if (j % i == 0) {
					y++;
				}
			}
				if (y == 8) {
					counter++;
				}
			
		}
		System.out.println(counter);

	}

}