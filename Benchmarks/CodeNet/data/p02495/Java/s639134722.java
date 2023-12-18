import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int n = 1; n > 0; n++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if (x == 0 && y == 0) {
				break;
			}
			for (int a = 1; a <= x; a++) {
				for (int b = 1; b <= y; b++) {
					System.out.print("#");
					b++;
					if (b <= y) {
						System.out.print(".");
					}
				}
				System.out.println("");
				a++;
				if (a <= x) {
					for (int b = 1; b <= y; b++) {
						System.out.print(".");
						b++;
						if (b <= y) {
							System.out.print("#");
						}
					}
					System.out.println("");
				}
			}

		}
	}
}