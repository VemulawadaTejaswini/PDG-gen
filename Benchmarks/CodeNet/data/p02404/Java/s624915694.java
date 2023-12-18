
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
			lineMaker01(w);
			for (int j = 0; j < h - 2; j++) {
				lineMaker02(w);
			}
			lineMaker01(w);
			System.out.println("");
		}
		//System.out.println("");
	}

	static void lineMaker01(int w) {
		for (int i = 0; i < w; i++) {
			System.out.print("#");
		}
		System.out.println("");
	}

	static void lineMaker02(int w) {
		System.out.print("#");
		for (int i = 0; i < w - 2; i++) {
			System.out.print(".");
		}
		System.out.print("#");
		System.out.println("");
	}
}