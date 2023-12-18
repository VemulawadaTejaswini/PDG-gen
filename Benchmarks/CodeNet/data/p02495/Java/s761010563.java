import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w, i, j;
		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 || w == 0)
				break;
			for (i = 0; i < h; i++) {
				for (j = 0; j < w; j++) {
					if ((i + j) % 2 == 0)
						System.out.printf("#");
					else
						System.out.printf(".");
				}
				System.out.printf("\n");
			}
			System.out.printf("\n");
		}
	}
}