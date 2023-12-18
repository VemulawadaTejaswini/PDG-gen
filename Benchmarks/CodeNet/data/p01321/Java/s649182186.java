import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		while (n != 0) {
			int max = 0;
			int min = Integer.MAX_VALUE;
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int k = 0; k < 5; k++) {
					sum += in.nextInt();
				}
				if (max < sum) {
					max = sum;
				}
				if (min > sum) {
					min = sum;
				}
			}
			System.out.printf("%d %d", max, min);
			System.out.println();
			n = in.nextInt();
		}
	}
}