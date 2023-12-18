import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			double val = in.nextDouble();
			if (val < 0) {
				break;
			}
			if (val >= 256) {
				System.out.println("NA");
			} else {
				int seisu = (int) val;
				int syosu = (int) ((val - seisu) * 16);
				if ((val - seisu) * 16 - syosu != 0) {
					System.out.println("NA");
				} else {
					val *= 256;
					int a = 128 * 256;
					for (int i = 0; i < 12; i++) {
						int b = (int) (val / a);
						System.out.print(b);
						val = val - a * b;
						a /= 2;
						if (i == 7) {
							System.out.print(".");
						}
					}
					System.out.println();
				}
			}
		}
	}
}