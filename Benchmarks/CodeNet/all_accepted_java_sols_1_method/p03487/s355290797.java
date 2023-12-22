import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] a = new int[n];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			if (map.containsKey(a[i])) {
				map.put(a[i], map.get(a[i])+1);
			} else {
				map.put(a[i], 1);
			}
		}
		long ans = 0;
		for (Map.Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getKey() > e.getValue()) {
				ans += e.getValue();
			} else {
			ans += Math.abs(e.getValue()-e.getKey());
			}
		}
		System.out.println(ans);
	}
}
