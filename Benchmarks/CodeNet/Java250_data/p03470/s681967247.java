import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Integer d[] = new Integer[N];

		for (int i = 0; i < N; i++) {
			d[i] = sc.nextInt();
		}

		sc.close();
		Arrays.sort(d, Collections.reverseOrder());

		int ans = 1;
		for (int i = 0; i < N-1; i++) {
			if (d[i] > d[i+1]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
