import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int num = scan.nextInt();
		int uneven = 0;
		for (int i = 0; i < num; i++) {
			int temp = scan.nextInt();
			if (temp % 2 != 0) {
				uneven++;
			}
		}

		// answer
		if (uneven % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

	}
}
