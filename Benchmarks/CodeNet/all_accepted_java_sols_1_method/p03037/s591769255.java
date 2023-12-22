import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < m; i++) {
			int left = sc.nextInt() - 1;
			int right = sc.nextInt() - 1;
			arr[left]++;
			if (right < n - 1) {
				arr[right + 1]--;
			}
		}
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (i != 0) {
				arr[i] = arr[i - 1] + arr[i];
			}
			if (arr[i] == m) {
				count++;
			}
		}
		System.out.print(count);
	}
}
