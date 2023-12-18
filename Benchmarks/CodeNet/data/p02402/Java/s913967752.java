import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int min = 1000000;
		int max = -1000000;
		long sum = 0;
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			if (n < 0 || n > 10000) {
				throw new RuntimeException();
			}
			int ai;
			for (int i = 1; i <= n; i++) {
				ai = sc.nextInt();
				if (ai < min) {
					min = ai;
				}
				if (ai > max) {
					max = ai;
				}
				sum += ai;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.printf("%d %d %d\n", min, max, sum);
	}
}