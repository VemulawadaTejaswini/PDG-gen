import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int num[] = new int[n];
		int arr[] = new int[n];
		int t;
		boolean f = false;
		for (int i = 0; i < n; i++) {
			t = in.nextInt();
			num[i] = t;
			arr[i] = t;
		}
		Arrays.sort(arr);
		for (int i = 0; i < n; i++) {
			for (int j = n - 1; j >= 0; j--) {
				if (!f && num[i] == arr[j]) {
					f = true;
					continue;
				}
				if (num[i] != arr[j]) {
					System.out.println(arr[j]);
					f = false;
					break;
				} else if (num[i] == arr[j] && f) {
					System.out.println(arr[j]);
					f = false;
					break;
				}
			}
		}
		in.close();
	}
}
