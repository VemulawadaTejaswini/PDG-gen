import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int num = 0;

		if (n >= 3 * 5 * 7) {
			num++;
			if (n >= 3 * 5 * 11) {
				num++;
				if (n >= 3 * 5 * 13) {
					num++;
				}
			}
		}

		if (n >= 3 * 3 * 3 * 5) {
			num++;
			if (n >= 3 * 3 * 3 * 7) {
				num++;

			}
		}

		System.out.println(num);

	}
}