import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n, m;
		List<Integer> hlist = new ArrayList<Integer>();
		List<Integer> wlist = new ArrayList<Integer>();
		while (true) {
			n = sc.nextInt(); m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			
			hlist.clear(); wlist.clear();
			int sum;
			for (int i = 1; i <= n; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += h[j];
				for (int j = 0; j <= n-i; j++) {
					hlist.add(sum);
					sum -= h[j];
					sum += h[j+i];
				}
			}
			for (int i = 1; i <= m; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += w[j];
				for (int j = 0; j <= m-i; j++) {
					wlist.add(sum);
					sum -= w[j];
					sum += w[j+i];
				}
			}
			
			Collections.sort(hlist);
			Collections.sort(wlist);
			
			int ans = 0;
			for (int a : hlist) {
				int index = Collections.binarySearch(wlist, a);
				int count = 0;
				if (index >= 0) {
					int k = index;
					while (k < wlist.size() && wlist.get(k) == a) {
						count++;
						k++;
					}
					k = index-1;
					while (k >= 0 && wlist.get(k) == a) {
						count++;
						k--;
					}
				}
				ans += count;
			}
			out.printf("%d\n",ans);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}