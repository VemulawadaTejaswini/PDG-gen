import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder str = new StringBuilder();

		while (true) {
			int h = scan.nextInt();
			int w = scan.nextInt();

			if (h == 0 && w == 0)
				break;

			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					str.append("#");
				}
				str.append("\n");
			}
			str.append("\n");
		}
		System.out.print(str);

	}
}