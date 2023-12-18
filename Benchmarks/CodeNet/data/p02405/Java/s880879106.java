import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StringBuilder text = new StringBuilder();
		while (true) {
			int H = scan.nextInt();
			int W = scan.nextInt();
			if (H == 0 && W == 0) {
				scan.close();
				text.deleteCharAt(text.lastIndexOf("\n"));
				System.out.println(text.toString());
				break;
			} else {
				boolean nextChar = true;
				for (int i = 0; i < H; i++) {
					if(i % 2 == 0)
						nextChar = true;
					else
						nextChar = false;
					for (int t = 0; t < W; t++) {
						if (nextChar) {
							text.append("#");
							nextChar = false;
						} else {
							text.append(".");
							nextChar = true;
						}
					}
					text.append("\n");
				}
				text.append("\n");
			}
		}
	}
}