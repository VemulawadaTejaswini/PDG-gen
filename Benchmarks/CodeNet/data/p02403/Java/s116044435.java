import java.util.Scanner;
import java.io.IOException;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		while (true) {
			String[] strAry = scan.nextLine().split(" ");
			int h = Integer.parseInt(strAry[0]);
			int w = Integer.parseInt(strAry[1]);
			if (h == 0 && w == 0) {
				break;
			}
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					System.out.print("#");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}