import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder text = new StringBuilder();

		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();

			if (H == 0 && W == 0) {
				sc.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				for (int i = 0; i < H; i++) {
					for (int t = 0; t < W; t++) {
						text.append("#");
					}
					text.append("\n");
				}
				text.append("\n");
			}

		}
	}

}

