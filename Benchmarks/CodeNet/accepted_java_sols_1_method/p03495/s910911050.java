import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[]A = new int[N];
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			set.add(A[i]);
		}
		sc.close();
		int[]c = new int[N + 1];
		for(int i = 0; i < N; i++) {
			c[A[i]]++;
		}
		int l = set.size();
		int[]cnt = new int[l];
		int idx = 0;
		for(int i = 1; i <= N; i++) {
			if(c[i] != 0) {
				cnt[idx] = c[i];
				idx++;
			}
		}
		Arrays.sort(cnt);
		if(l <= K) {
			System.out.println(0);
			System.exit(0);
		}

		int sum = 0;
		for(int i = 0; i < l; i++) {
			sum += cnt[i];
			if(l - i - 1<= K) {
				System.out.println(sum);
				System.exit(0);
			}

		}
	}
}