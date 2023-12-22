import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int[] cnt = new int[N+1];
		for (int i = 0; i < K; i++) {
			for (int d = sc.nextInt(); d > 0; d--) {
				cnt[sc.nextInt()]++;
			}
		}
		int ans = 0;
		for (int i = 1; i <=N; i++) {
			if(cnt[i] == 0) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}
