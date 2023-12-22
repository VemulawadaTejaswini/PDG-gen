import java.util.*;

public class Main {

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		long a = 0;
		long b = 0;
		for (int i = n - 1; i > 0; i--) {
			if (arr[i] == arr[i - 1]) {
				if (a == 0) {
					a = arr[i];
					i -= 1;
				} else {
					b = arr[i];
					break;
				}
			}
		}
		System.out.println(a * b);
	}
}
