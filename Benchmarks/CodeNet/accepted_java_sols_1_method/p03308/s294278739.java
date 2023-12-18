import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		int min = (int) Math.pow(10, 9), max = 0;

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			if (max < x) {
				max = x;
			}
			if (x < min) {
				min = x;
			}
		}
		
		System.out.println((max - min));

		sc.close();
	}
}
