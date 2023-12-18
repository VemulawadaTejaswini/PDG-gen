import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Map<Long,Long> drink = new TreeMap<Long,Long>();
		for(int i = 0; i < n; i++) {
			long a = sc.nextLong();
			long b = sc.nextLong();
			if(drink.containsKey(a)) {
				drink.put(a,drink.get(a)+b);
			}
			else {
				drink.put(a, b);
			}
		}
		long ans = 0;
		for(long key:drink.keySet()) {
			int buy = (int) Math.min(m, drink.get(key));
			ans += buy*key;
			m -= buy;
		}
		System.out.println(ans);
	}
}