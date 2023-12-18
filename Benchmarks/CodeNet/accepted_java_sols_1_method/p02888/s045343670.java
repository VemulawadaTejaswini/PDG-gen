import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		Arrays.sort(a);
		int count = 0;
		for (int i = 0; i < n; i++) {
			int idx = i + 1;
			for (int j = 0; j < i; j++) {
				int ab = a[i] + a[j];
				while (idx < n && a[idx] < ab) idx++;
				count += Math.max(0, idx - i - 1);
			}
		}
		System.out.println(count);
	}
}
