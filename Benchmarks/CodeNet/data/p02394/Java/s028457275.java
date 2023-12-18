import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();
		boolean isContainsWidth = false;
		boolean isContainsHeight = false;

		if ((x - r) >= 0 && (x + r) <= W)
			isContainsWidth = true;

		if ((y - r) >= 0 && (y + r <= H))
			isContainsHeight = true;

		if (isContainsWidth && isContainsHeight) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}