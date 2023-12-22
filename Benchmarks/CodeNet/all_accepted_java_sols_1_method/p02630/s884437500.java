import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> m = new HashMap<>();
		long ans = 0;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			m.put(a, m.getOrDefault(a, 0) + 1);
			ans += a;
		}
		int Q = sc.nextInt();
		for(int i = 0; i < Q; i++){
			int b = sc.nextInt();
			int c = sc.nextInt();
			ans += (long)(c - b) * m.getOrDefault(b, 0);
			m.put(c, m.getOrDefault(b, 0) + m.getOrDefault(c, 0));
			m.remove(b);
			System.out.println(ans);
		}
	}

}