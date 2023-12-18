import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			if (map.containsKey(-A[i]+i)) {
				map.put(-A[i]+i, map.get(-A[i]+i)+1);
			} else {
				map.put(-A[i]+i, 1);
			}
		}

		long ans = 0L;
		for (int i=0;i<N;i++) {
			if (map.get(-A[i]+i)>1) {
				map.put(-A[i]+i, map.get(-A[i]+i)-1);
			} else {
				map.remove(-A[i]+i);
			}

			if (map.containsKey(A[i]+i)) ans += map.get(A[i]+i);
		}
		System.out.println(ans);
	}
}