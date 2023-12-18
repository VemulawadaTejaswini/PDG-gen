import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (int val = arr[0]; val <= arr[arr.length - 1]; val++) {
			int m = 0;
			for (int i = 0; i < n; i++) {
				m += (arr[i] - val) * (arr[i] - val);
			}
			min = Math.min(min, m);
		}
		
		System.out.println(min);
	}
}
