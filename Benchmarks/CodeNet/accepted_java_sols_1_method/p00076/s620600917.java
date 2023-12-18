
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		while (true) {
			int num = scanner.nextInt();
			if (num == -1) {
				break;
			}
			double c = 0;
			double d = 0;
			for (int i = 1; i <= num; i++) {
				c = Math.sqrt(1 + c * c);
				if (i != num)
					d += Math.atan2(1, c);
			}
			System.out.println(Math.cos(d) * c);
			System.out.println(Math.sin(d) * c);
		}
	}
}