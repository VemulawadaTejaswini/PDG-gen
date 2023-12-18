import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int cnt = 0;
		boolean b = true;
		for (int i = 0; i < n; i++) {
			if (x - a[i] >= 0) {
				cnt++;
				x -= a[i];
			} else {
				b = false;
				break;
			}
		}
		if (x > 0 && b) {
			cnt--;
		}
		System.out.println(cnt);
	}
}
