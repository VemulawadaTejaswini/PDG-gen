import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			if (n != 0) {
				int[] sumLine = new int[n];
				Arrays.fill(sumLine, 0);
				int sum = 0;
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						int v = in.nextInt();
						System.out.printf("%5d", v);
						sum += v;
						sumLine[j] += v;
					}
					System.out.printf("%5d", sum);
					System.out.println();
					sum = 0;
				}
				for (int i = 0; i < n; i++) {
					System.out.printf("%5d", sumLine[i]);
					sum += sumLine[i];
				}
				System.out.printf("%5d", sum);
				System.out.println();
			}
		}
	}
}