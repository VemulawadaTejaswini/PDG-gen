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

			for(int i = 0; i < w; i++) {
				System.out.print("#");
			}
			System.out.println();
			for (int i = 1; i < h-1; i++) {

				System.out.print('#');
				for (int j = 1; j < w-1; j++) {
					System.out.print('.');
				}
				System.out.println('#');
			}
			for(int i = 0; i < w; i++) {
				System.out.print("#");
			}
			System.out.println();
			System.out.println();
		}

	}

}