import java.util.Scanner;

class Main {

	public static void main(String[] args) {

		int h, w;

		Scanner stdIn = new Scanner(System.in);

		while (true) {

			h = stdIn.nextInt();
			w = stdIn.nextInt();

			if((h+w) == 0) {
				System.exit(0);
			}

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
		}

	}

}