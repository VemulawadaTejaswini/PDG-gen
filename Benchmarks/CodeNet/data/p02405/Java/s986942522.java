import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h = 1;
		int w = 1;
		while (h != 0 || w != 0) {
			h = scanner.nextInt();
			w = scanner.nextInt();
			for (int i = 0; i < h; ++i) {
				if(i%2==0) {
				for (int c = 0; c < w; ++c) {
					if (c % 2 == 0) {
						System.out.print("#");
					} else {
						System.out.print(".");
					}
				}}
				else {
					for (int c = 0; c < w; ++c) {
						if (c % 2 == 0) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
				}
				System.out.println("");
			}
			if (h != 0 || w != 0) {
				System.out.println("");
			}
		}

	}
}
