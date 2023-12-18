import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int W = sc.nextInt();
		int H = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int r = sc.nextInt();

		int north = y + r;
		int south = y - r;
		int east = x + r;
		int west = x - r;

		if((H - north >= 0) && (W - east >= 0)
				&& (south >= 0) && (west >= 0)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
