import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[200000];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = arr[0];
		for (int i = 1; i < n; i++) {
			max = Math.max(max, arr[i] - min);
			min = Math.min(min, arr[i]);
		}
		System.out.println(max);
	}
}