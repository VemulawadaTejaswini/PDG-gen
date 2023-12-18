import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			int n = sc.nextInt();
			if (n == 0) return;
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			int min = Integer.MAX_VALUE;
			Arrays.sort(a);
			for (int i = 0; i < n-1; i++) {
				min = Math.min(min, Math.abs(a[i]-a[i+1]));
			}
			System.out.println(min);

		}
	}
}
