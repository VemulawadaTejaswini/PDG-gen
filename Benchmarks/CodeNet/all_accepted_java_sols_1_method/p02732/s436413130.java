import java.util.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long A[] = new long[N];
		HashMap<Long, Long> map = new HashMap<Long, Long>();
		for(int i = 0; i < N; i++) {
			A[i] = sc.nextLong();
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], (long)1);
			}
		}
		
		long ans = 0;
		for(Map.Entry<Long, Long> entry : map.entrySet()) {
			ans += entry.getValue() * (entry.getValue() - 1) / 2;
		}
		
		for(int i = 0; i < N; i++) {
			System.out.println(ans - (map.get(A[i]) - 1));
		}
	}
}
