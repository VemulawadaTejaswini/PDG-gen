import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		int K = sc.nextInt();
		int a[] = new int[N];
		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();
		Arrays.sort(a);
		int ans = 0, cnt = 0, st = 0;
		for (int i = 0; i < N;) {
			if (cnt == C) {
				ans++; cnt = 0;
			} else if (cnt == 0) {
				st = a[i++] + K;
				cnt++;
			} else {
				if (a[i] <= st) {
					cnt++; i++;
				} else {
					ans++; cnt = 0;
				}
			}
		}
		if (cnt > 0) {
			ans++;
		}
		System.out.println(ans);
	}
}
