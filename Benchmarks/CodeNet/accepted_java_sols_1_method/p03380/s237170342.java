import java.util.*;

public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int max = arr[n - 1];
		int min = Integer.MAX_VALUE;
		int val = 0;
		for (int i = 0; i < n - 1; i++) {
			int x;
			if (max % 2 == 0) {
				x = Math.abs(max / 2 - arr[i]);
			} else {
				if (max / 2 >= arr[i]) {
					x = max / 2 - arr[i];
				} else {
					x = arr[i] - (max / 2 + 1);
				}
			}
			if (x < min) {
				min = x;
				val = arr[i];
			}
		}
		System.out.println(max + " " + val);
	}
}
