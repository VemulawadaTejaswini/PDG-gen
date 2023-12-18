import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int R = sc.nextInt();
		System.out.println(judgeSun(H, R));
		sc.close();

	}

	private static int judgeSun(int H, int R) {
		int x = 1;

		if (Math.abs(H) == R) {
			if (H < 0) {
				x = 0;
			} else {
				x = 1;
			}
		} else if (Math.abs(H) > R) {
			if (H < 0) {
				x = -1;
			} else {
				x = 1;
			}
		}

		return x;
	}

}
