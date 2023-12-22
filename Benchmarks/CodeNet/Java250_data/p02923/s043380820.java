import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		int t = a[n - 1];
		int max = 0, cnt = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (t <= a[i]) {
				cnt++;
				max = Math.max(max, cnt);
			} else {
				cnt = 0;
			}
			t = a[i];
		}
		System.out.println(max);
	}
}