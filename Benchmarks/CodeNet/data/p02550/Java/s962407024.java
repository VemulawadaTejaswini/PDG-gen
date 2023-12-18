import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		long X = sc.nextInt();
		int M = sc.nextInt();
		long prev = X, ans = 0;
		int st = 0, end = 0;
		long[] sum = new long[M+1];
		sum[0] = X;
		List<Long> l = new ArrayList<>();
		Set<Long> s = new HashSet<>();
		l.add(X);
		for(int i = 1; i <= N; i++) {
			long mod = prev * prev % M;
			sum[i] = sum[i-1] + mod;
			if(!s.contains(mod)) {
				ans += mod;
				s.add(mod);
				l.add(mod);
			}
			else {
				end = i;
				st = l.indexOf(mod);
				break;
			}
			prev = mod;
		}
		int T = end - st;
		if(end != 0) {
			ans = (N - st) / T * (sum[end] - sum[st]);
			if(st != 0)
				ans += sum[st-1];
			if((N - st) % T != 0)
				ans += sum[(int)((N - st) % T - 1) + st] - sum[st];
		}
		System.out.println(ans);
	}

}
