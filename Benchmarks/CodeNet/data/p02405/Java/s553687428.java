
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner("3 5 4 2 0 0 8 8");
		Scanner scanner = new Scanner(System.in);
		int h;
		int w;
		while (true) {
			h = scanner.nextInt();
			w = scanner.nextInt();
			if (h == 0 && w == 0) {
				break;
			}
			if (0 == h % 2) {
				for (int i = 0; i < (h / 2); i++) {
					lineMaker01(w);
					lineMaker02(w);
				}
			} else {
				for (int j = 0; j < (h / 2); j++) {
					lineMaker01(w);
					lineMaker02(w);
				}
				lineMaker01(w);
			}
			System.out.println("");
		}
		// System.out.println("");
	}

	static void lineMaker01(int w) { // #.#. ??¶??°?????´???
		if (0 == w % 2) {
			for (int i = 0; i < w / 2; i++) {
				System.out.print("#");
				System.out.print(".");
			}
		} else {
			for (int i = 0; i < (w / 2); i++) {
				System.out.print("#");
				System.out.print(".");
			}
			System.out.print("#");
		}
		System.out.println("");
	}

	static void lineMaker02(int w) { // .#.# ?\???°?????´???
		if (0 == w % 2) {
			for (int i = 0; i < (w / 2); i++) {
				System.out.print(".");
				System.out.print("#");
			}
		} else {
			for (int i = 0; i < (w / 2); i++) {
				System.out.print(".");
				System.out.print("#");
			}
			System.out.print(".");
		}
		System.out.println("");

	}

}