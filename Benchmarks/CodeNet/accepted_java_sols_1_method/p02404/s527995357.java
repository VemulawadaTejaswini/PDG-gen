import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in);) {

			while (true) {
				long H = sc.nextInt();
				long W = sc.nextInt();

				if (H == 0 && W == 0) break;

				StringBuilder sb = new StringBuilder();

				for (int i = 0; i < H; i++) {
					for (int j = 0; j < W; j++) {
						if (j == 0 || j == W - 1 || i == 0 || i == H - 1) {
							sb.append("#");
						} else {
							sb.append(".");
						}
					}
					sb.append("\n");
				}

				System.out.println(sb.toString());
			}
		}
	}
}
