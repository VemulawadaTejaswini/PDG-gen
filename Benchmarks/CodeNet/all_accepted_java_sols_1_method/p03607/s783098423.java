
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i = 0 ; i < N ; i++) {
			A[i] = sc.nextInt();
		}
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0 ; i < N ; i++) {
			if(map.containsKey(A[i])) {
				map.put(A[i], map.get(A[i]) + 1);
			} else {
				map.put(A[i], 1);
			}
		}
		int ans = 0;
		for(int key : map.keySet()) {
			if(map.get(key) % 2 == 1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}