import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp;

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 || i % 10 == 3) {
				System.out.print(" " + i);
			}
			temp = i;
			while (true) {
				if (temp / 10 <= 10) {
					if (temp == 3 || temp % 10 == 3) {
						System.out.print(" " + i);
					}
					break;
				}
				temp = temp / 10;
			}
		}
		System.out.println();
	}

}