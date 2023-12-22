import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		long ans = 0;
		for (int i = 0; i < N; i++) {
			A[i] = sc.nextInt();
			ans += map.getOrDefault(i - A[i], 0);
			int c = A[i] + i;
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		System.out.println(ans);
	}
}
