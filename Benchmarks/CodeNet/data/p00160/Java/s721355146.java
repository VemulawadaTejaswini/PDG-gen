
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int yen = 0;
			while (n-- > 0) {
				int sum = 0;
				for (int i = 0; i < 3; i++) {
					sum += scanner.nextInt();
				}
				int w = scanner.nextInt();
				if (sum <= 60 && w <= 2)
					yen += 600;
				else if (sum <= 80 && w <= 5)
					yen += 800;
				else if (sum <= 100 && w <= 10)
					yen += 1000;
				else if (sum <= 120 && w <= 15)
					yen += 1200;
				else if (sum <= 140 && w <= 20)
					yen += 1400;
				else if (sum <= 160 && w <= 25)
					yen += 1600;
				else
					yen += 0;
			}
			System.out.println(yen);
		}
	}
}