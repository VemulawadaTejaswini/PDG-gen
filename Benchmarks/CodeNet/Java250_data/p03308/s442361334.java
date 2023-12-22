import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int result = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++) {
				result = Math.max(a[i] - a[j], result);
			}
		System.out.println(result);
	}
}