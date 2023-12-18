import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			long[] arr = new long[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextLong();
			}
			Arrays.sort(arr);
			long ans = 0;
			for (int i = 0; i < n - 2; i++) {
				for (int j = i + 1; j < n - 1; j++) {
					if (arr[i] == arr[j]) {
						continue;
					}
					long hen = arr[i] + arr[j];
					for (int k = j + 1; k < n; k++) {
						if (arr[k] >= hen) {
							break;
						}
						if (arr[j] == arr[k]) {
							continue;
						}
						ans++;
					}
				}
			}
			System.out.println(ans);
		}
	}
}