
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[][] arr = new int[n][2];

			for (int i = 0; i < n; i++) {
				arr[i][0] = sc.nextInt();
				arr[i][1] = sc.nextInt();
			}
			Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));

			int timer = 0;
			for (int i = 0; i < n; i++) {
				timer += arr[i][0];
				if (arr[i][1] < timer) {
					System.out.println("No");
					return;
				}
			}
			System.out.println("Yes");
		}
	}
}
