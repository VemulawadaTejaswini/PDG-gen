import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int MOD = 998244353;
		int N = sc.nextInt();
		int S = sc.nextInt();
		int[] A = new int[N];
		Arrays.setAll(A, i -> sc.nextInt());
		long ans = 0;
		long[] t = new long[N+1];
		t[0] = 1;
		for(int i = 1; i <= N; i++)
			t[i] = t[i-1] * 2 % MOD;
		Map<Integer, Map<Integer, Integer>> m = new HashMap<>();
		m.put(0, new HashMap<>());
		m.get(0).put(0, 1);
		for(int i = 0; i < N; i++) {
			m.put(i+1, new HashMap<>());
			for(int j = i; j >= 0; j--) {
				for(int k : m.get(j).keySet())
					if(k + A[i] <= S)
						m.get(j+1).put(k + A[i], m.get(j+1).getOrDefault(k + A[i], 0) + m.get(j).get(k));
			}
		}
		for(int i = 1; i <= N; i++) {
			ans += m.get(i).getOrDefault(S, 0) * t[N-i];
			ans %= MOD;
		}
		System.out.println(ans);
	}

}