import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		for(int i = 0; i < N; i++) L[i] = sc.nextInt();
		Arrays.sort(L);
		int ans = 0;

		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				// |a - b|より大きい最小の棒のindex
				int low = -1, high = N - 1;
				while(high - low > 1) {
					int mid = (high + low) / 2;
					if(L[mid] > Math.abs(L[i] - L[j])) {
						high = mid;
					} else {
						low = mid;
					}
				}
				int lower = high;

				// a + bより小さい最大の棒のindex
				low = 0; high = N;
				while(high - low > 1) {
					int mid = (high + low) / 2;
					if(L[mid] < L[i] + L[j]) {
						low = mid;
					} else {
						high = mid;
					}
				}
				int upper = low;
				int count = Math.max(0, upper - j);
				ans += count;
			}
		}

		System.out.println(ans);
	}
}