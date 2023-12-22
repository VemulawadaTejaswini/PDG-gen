
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int count = 0;
		int count8 = 0;
		int n = scan.nextInt();

		int i = 1;
		int j = 1;
		while (i <= n) {
			while (j <= i) {
				if (i % j == 0) {
					count++;
				}

				j = j + 1;
			}
			if (count == 8) {
				count8 = count8 + 1;
			}
			count = 0;
			i = i + 2;
			j = 1;

		}
		System.out.println(count8);
	}

}
