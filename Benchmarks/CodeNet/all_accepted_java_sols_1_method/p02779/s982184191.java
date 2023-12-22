import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		long[] arr = new long[200000];

		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextLong();
		}

		Arrays.sort(arr);

		for (int i = 1; i < 200000; i++) {
			if (arr[i] > 0) {
				if (arr[i] == arr[i - 1]) {
					System.out.println("NO");
					break;
				}
			}
			if (i == 200000 - 1) {
				System.out.println("YES");
			}
		}
	}
}