import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t = sc.nextInt();
		int min = Integer.MAX_VALUE;
		int[] benefit = new int[n];
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			benefit[i] = Math.max(0, x - min);
			min = Math.min(min, x);
		}
		Arrays.sort(benefit);
		int prev = benefit[n - 1];
		int count = 1;
		for (int i = n - 2; i >= 0; i--) {
			if (prev == benefit[i]) {
				count++;
			}
		}
		System.out.println(count);
	}
}
