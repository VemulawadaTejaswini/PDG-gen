import java.util.*;

public class Main {
	static final int MOD = 1000000007;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 2; i <= n; i++) {
		    int x = i;
		    for (int j = 2; j * j <= x; j++) {
		        while (x % j == 0) {
		            if (map.containsKey(j)) {
		                map.put(j, map.get(j) + 1);
		            } else {
		                map.put(j, 1);
		            }
		            x /= j;
		        }
		    }
		    if (x != 1) {
		        if (map.containsKey(x)) {
		            map.put(x, map.get(x) + 1);
		        } else {
		            map.put(x, 1);
		        }
		    }
		}
		int[] arr = new int[5]; //2, 4, 14, 24, 74
		for (int x : map.values()) {
		    if (x >= 2) {
		        arr[0]++;
		    }
		    if (x >= 4) {
		        arr[1]++;
		    }
		    if (x >= 14) {
		        arr[2]++;
		    }
		    if (x >= 24) {
		        arr[3]++;
		    }
		    if (x >= 74) {
		        arr[4]++;
		    }
		}
		long ans = 0;
		ans += arr[4];
		ans += arr[3] * (arr[0] - 1);
		ans += arr[2] * (arr[1] - 1);
		ans += arr[1] * (arr[1] - 1) / 2 * (arr[0] - 2);
		System.out.println(ans);
	}
}
