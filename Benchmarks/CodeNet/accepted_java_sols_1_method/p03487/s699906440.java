import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[] = new int[N];
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		for(int i = 0; i < N; i++) {
			a[i] = sc.nextInt();
			if(num.containsKey(a[i])) {
				num.put(a[i], num.get(a[i]) + 1);
			} else {
				num.put(a[i], 1);
			}
		}
		
		int ans = 0;
		for(int key : num.keySet()) {
			int value = num.get(key);
			if(value < key) {
				ans += value;
			} else if(key < value) {
				ans += value - key;
			}
		}
		
		System.out.println(ans);
	}
}
