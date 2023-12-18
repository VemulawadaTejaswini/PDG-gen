import java.util.*;
public class Main {
	
	static long N, A, B, C, D, ans, INF = Long.MAX_VALUE;
	static Map<Long, Long> m;

	static long dfs(long N) {
		if(m.containsKey(N))
			return m.get(N);
		if(N < INF / D)
			ans = N * D;
		else
			ans = INF;
		for(int i = -1; i <= 1; i++)
			if((N + i) % 2 == 0)
				ans = Math.min(ans, dfs((N+i)/2) + A + Math.abs(i*D));
		for(int i = -1; i <= 1; i++)
			if((N + i) % 3 == 0)
				ans = Math.min(ans, dfs((N+i)/3) + B + Math.abs(i*D));
		for(int i = -2; i <= 2; i++)
			if((N + i) % 5 == 0)
				ans = Math.min(ans, dfs((N+i)/5) + C + Math.abs(i*D));
		m.put(N, ans);
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			N = sc.nextLong();
			A = sc.nextInt();
			B = sc.nextInt();
			C = sc.nextInt();
			D = sc.nextInt();
			m = new HashMap<>();
			m.put(0L, 0L);
			m.put(1L, D);
			System.out.println(dfs(N));
		}
	}

}