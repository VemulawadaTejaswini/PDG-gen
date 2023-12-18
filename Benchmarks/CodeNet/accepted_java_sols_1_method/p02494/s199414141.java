import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int w = scan.nextInt();
		int i, j;

		while (h != 0 || w != 0) {
			for (j = 1; j <= h; j++) {
				for (i = 1; i <= w; i++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
			h = scan.nextInt();
			w = scan.nextInt();

		}
	}

}