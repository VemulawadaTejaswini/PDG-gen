import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0) {
				break;
			}
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for(int i=1;i<=n;i++) {
				h[i] = h[i-1] + sc.nextInt();
			}
			for(int i=1;i<=m;i++) {
				w[i] = w[i-1] + sc.nextInt();
			}
			HashMap<Integer, Integer> a = count(h);
			HashMap<Integer, Integer> b = count(w);
			int ans = 0;
			for(Entry<Integer,Integer> p:b.entrySet()) {
				if (a.containsKey(p.getKey())) {
					ans += a.get(p.getKey()) * p.getValue();
				}
			}
			System.out.println(ans);
		}
	}

	static HashMap<Integer,Integer> count(int[] x) {
		int n = x.length;
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				int d = x[j] - x[i];
				if (count.containsKey(d)) {
					count.put(d, count.get(d) + 1);
				}else{
					count.put(d, 1);
				}
			}
		}
		return count;
	}

}