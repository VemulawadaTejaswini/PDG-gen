
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] num = new int[7];
		while (n-- > 0) {
			double a = scanner.nextDouble();
			if (a < 165)
				num[1]++;
			else if (a < 170)
				num[2]++;
			else if (a < 175)
				num[3]++;
			else if (a < 180)
				num[4]++;
			else if (a < 185)
				num[5]++;
			else
				num[6]++;
		}
		for (int i = 1; i < 7; i++) {
			System.out.print(i + ":");
			for (int j = 0; j < num[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}