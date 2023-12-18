import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while (s.hasNextDouble()) {
			int[] n = new int[6];
			for (int i = 0; i < 6; ++i) {
				n[i] = s.nextInt();
			}
			double d = n[0] * n[4] - n[1] * n[3];
			System.out.printf("%.3f %.3f\n", (double)Math.round((n[2] * n[4] - n[1] * n[5]) * 1000 / d) / 1000, (double)Math.round((n[0] * n[5] - n[2] * n[3]) * 1000 / d) / 1000);
		}
	}
}