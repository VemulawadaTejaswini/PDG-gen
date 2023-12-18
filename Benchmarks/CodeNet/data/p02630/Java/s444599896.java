import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i])+1);
			} else {
				map.put(A[i], 1);
			}
		}
		long ans = 0L;
		ArrayList<Integer> key = new ArrayList<Integer>(map.keySet());
		ArrayList<Integer> vall = new ArrayList<Integer>(map.values());
		for (int i=0;i<key.size();i++) {
			ans += (long)key.get(i)*vall.get(i);
		}
		int Q = sc.nextInt();
		int[] B = new int[Q];
		int[] C = new int[Q];
		for (int i=0;i<Q;i++) {
			B[i] = sc.nextInt();
			C[i] = sc.nextInt();
			if (map.containsKey(B[i])) {
				int val = map.get(B[i]);
				ans -= (long)B[i]*val;
				ans += (long)C[i]*val;
				if (map.containsKey(C[i])) {
					map.put(C[i], map.get(C[i])+val);
				} else {
					map.put(C[i], val);
				}
			}
			System.out.println(ans);
		}
	}
}