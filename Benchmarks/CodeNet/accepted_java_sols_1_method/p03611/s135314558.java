import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		int[] a = new int[n];
		int[] cnt = new int[100010];

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
			cnt[a[i] + 1]++;
			cnt[a[i]]++;
			cnt[a[i] + 2]++;
		}

		Arrays.sort(cnt);

		System.out.println(cnt[100009]);

	}
}