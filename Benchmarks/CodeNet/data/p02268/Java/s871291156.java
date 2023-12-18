import java.util.Scanner;

public class Main {
	
	public static int BS(int[] arr, int l, int r, int target) {
		if (l <= r) {
			int mid = l + (r - l) / 2;
			if (arr[mid] == target) {
				return mid;
			}
			if (arr[mid] > target) {
				return BS(arr, l, mid - 1, target);
			}
			return BS(arr, mid + 1, r, target);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] sequence = new int[n];
		for (int i = 0; i < n; i++) {
			sequence[i] = in.nextInt();
		}
		
		int m = in.nextInt();
		int[] set_integer = new int[m];
		for (int i = 0; i < m; i++) {
			set_integer[i] = in.nextInt();
		}
		
		int res = 0;
		for (int i = 0; i < set_integer.length; i++) {
			int num = set_integer[i];
			if (BS(sequence, 0, n - 1, num) != -1) {
				res++;
			}
		}
		System.out.println(res);
		in.close();
	}
}
