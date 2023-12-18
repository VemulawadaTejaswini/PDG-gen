import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = scn.nextInt();
		int[] brr = new int[n];
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] % arr[j] == 0)
					brr[i]++;
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (arr[i] % arr[j] == 0)
					brr[i]++;
			}
		}
		int ans = 0;
		for (int i = 0; i < n; i++) {
			if (brr[i] == 0)
				ans++;
		}
		System.out.println(ans);
	}
}
