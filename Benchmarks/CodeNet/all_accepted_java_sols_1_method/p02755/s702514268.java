import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();

		double x8 = (double)A * (100.0 / 8.0);
		double x10 = (double)B * 10.0;

		int floor8 = (int)(Math.floor(x8));
		int floor10 = (int)(Math.floor(x10));

		int num = 0;
		for (int i = (int)Math.ceil(x8); true; i++) {
			int floorZei8 = (int)(Math.floor((double)i * 0.08));
			int floorZei10 = (int)(Math.floor((double)i * 0.1));

			if (floorZei8 == A && floorZei10 == B) {
				num = i;
				break;
			}
			else {
				if (floorZei8 != A && floorZei10 != B) {
					num = -1;
					break;
				}
				else {
					continue;
				}
			}
		}

		System.out.println(num);
	}
}