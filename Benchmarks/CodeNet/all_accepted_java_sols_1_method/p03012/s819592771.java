import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] d = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			d[i] = scanner.nextInt();
			sum = sum + d[i];
		}
		int diff = sum;
		int s1 = 0;
		for (int i = 0; i < n; i++) {
			s1 = s1 + d[i];
			int sabun = Math.abs((sum - s1) - s1);
			if (diff < sabun) {
				break;
			} else {
				diff = sabun;
			}
		}
		System.out.println(diff);
	}
}
