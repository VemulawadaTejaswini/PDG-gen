import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long ans = 0L;
		long[] cnt = new long[100001];
		for(int i = 0; i < n; i++) {
			int cur = in.nextInt();
			cnt[cur] += 1;
			ans += cur;
		}
		int q = in.nextInt();
		for(int i = 0; i < q; i++) {
			int a = in.nextInt();
			int b = in.nextInt();
			long cnt_rem = cnt[a];
			if(cnt[a] >= 0) {
				long rem = cnt_rem * a;
				ans -= rem;
				ans += cnt_rem * b;
				cnt[b] += cnt[a];
				cnt[a] = 0;
			}
			System.out.println(ans);
		}
	}
}