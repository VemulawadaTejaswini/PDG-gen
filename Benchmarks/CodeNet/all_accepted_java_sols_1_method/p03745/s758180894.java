import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++) arr[i] = sc.nextLong();
		int[] dp1 = new int[n];
		int[] dp2 = new int[n];
		dp1[0] = dp2[0] = 1;
		for (int i = 1; i < n; i++) {
			if (arr[i] > arr[i-1]) {
				dp1[i] = Math.min(dp1[i-1], dp2[i-1] + 1);
				dp2[i] = Math.min(dp1[i-1] + 1, dp2[i-1] + 1);
			} else if (arr[i] < arr[i-1]) {
				dp1[i] = Math.min(dp1[i-1] + 1, dp2[i-1] + 1);
				dp2[i] = Math.min(dp1[i-1] + 1, dp2[i-1]);
			} else {
				dp1[i] = dp1[i-1];
				dp2[i] = dp2[i-1];
			}
		}
		
		System.out.println(Math.min(dp1[n-1], dp2[n-1]));
	}
}
