import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = 1;
		int w = 1;
		StringBuilder sb = new StringBuilder();
		while (true) {
			h = scan.nextInt();
			w = scan.nextInt();
			if (h != 0 && w != 0) {
				for (int i = 0; i < w; i++) {
					sb.append("#");
				}
				sb.append("\n");
				for ( int j = 0; j < h - 2; j++) {
					sb.append("#");
					for (int i = 0; i < w - 2; i++) {
						sb.append(".");
					}
					sb.append("#");
					sb.append("\n");
				}
				for (int i = 0; i < w && h >= 2; i++) {
					sb.append("#");
				}
				sb.append("\n");
				sb.append("\n");
			}else {
				break;
			}
		}
		System.out.print(sb);
	}
}