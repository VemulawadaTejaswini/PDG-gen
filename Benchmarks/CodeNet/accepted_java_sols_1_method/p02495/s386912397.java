import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		while (true) {
			double h = scan.nextDouble();
			double w = scan.nextDouble();
			if (h == 0 && w == 0)
				break;
			boolean sw1 = true;
			boolean sw2 = true;
			for (int i = 0; i < h; i++) {
				for (int j = 0; j < w; j++) {
					if (sw1) {
						if (sw2) {
							System.out.print("#");
						} else {
							System.out.print(".");
						}
					} else if (sw2) {
						System.out.print(".");
					} else {
						System.out.print("#");
					}
					sw2 = !sw2;
				}
				System.out.println();
				sw1 = !sw1;
				sw2 = true;
			}
			System.out.println();
		}
	}
}