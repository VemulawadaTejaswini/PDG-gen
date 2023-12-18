
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h, w, i;

		while (true) {
			h = sc.nextInt();
			w = sc.nextInt();
			if (h == 0 && w == 0)
				break;
			for (int j = 0; j < h; j++) {
				if (j % 2 == 1) {
					for (i = 0; i < w; i++)
						if (i % 2 == 1)
							System.out.print("#");
						else
							System.out.print(".");

				}

				if (j % 2 == 0) {
					for (i = 0; i < w; i++)
						if (i % 2 == 1)
							System.out.print(".");
						else
							System.out.print("#");

				}
				System.out.println("");
			}
		}
		sc.close();
	}
}