import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		while(N --> 0) {
			int a = sc.nextInt();
			if(num.containsKey(a)) {
				num.put(a, num.get(a) + 1);
			} else {
				num.put(a, 1);
			}
		}
		int cnt = 0;
		for(Entry<Integer, Integer> entry:num.entrySet()) {
			int n = entry.getKey();
			int x = entry.getValue();
			if(n > x) {
				cnt += x;
			} else {
				cnt += x-n;
			}
		}
		System.out.println(cnt);
	}
}