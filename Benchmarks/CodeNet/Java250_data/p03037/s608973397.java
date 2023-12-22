import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// input
		int min = 1;
		int max = scan.nextInt();
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			int left = scan.nextInt();
			int right = scan.nextInt();
			if (left > min) {
				min = left;
			}
			if (right < max) {
				max = right;
			}
		}

		// answer
		if (max - min < 0) {
			System.out.println(0);
		} else {
			System.out.println(max - min + 1);
		}

	}
}
