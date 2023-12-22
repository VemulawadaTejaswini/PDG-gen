import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int total = 0;
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			arr[i] = x;
			total += x;
		}
		int min = Integer.MAX_VALUE;
		int minIdx = 0;
		for (int i = 0; i < n; i++) {
			int x = Math.abs(arr[i] * n - total);
			if (min > x) {
				min = x;
				minIdx = i;
			}
		}
		System.out.println(minIdx);
	}
}