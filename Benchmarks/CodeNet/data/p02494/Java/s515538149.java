import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0 && W == 0) {
				break;
			}
			for (H = 0; H > 0; H++) {
				for (W = 0; W < 301; W++)
					System.out.println("#");
			}
		}

	}

}