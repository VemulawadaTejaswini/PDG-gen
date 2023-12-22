import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h, w;
		while (true) {
			h = scanner.nextInt();
			w = scanner.nextInt();
			if (h == 0 && w == 0) break;
			for (int j = 0; j < h; j ++) {
				if (j % 2 == 0) {
					for (int i = 0; i < w; i ++) {
						if (i % 2 == 0) System.out.print("#");
						else System.out.print(".");
					}
					System.out.print("\n");
				}
				else {
					for (int i = 0; i < w; i ++) {
						if (i % 2 == 0) System.out.print(".");
						else System.out.print("#");
					}
					System.out.print("\n");
				}
			}
			System.out.print("\n");		
		}
		
	}
}