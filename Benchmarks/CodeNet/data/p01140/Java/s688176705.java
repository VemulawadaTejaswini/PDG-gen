import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	
	
	void run() {
		int n, m;
		List<Integer> hlist = new ArrayList<Integer>();
		while (true) {
			n = sc.nextInt(); m = sc.nextInt();
			if (n == 0 && m == 0) break;
			int[] h = new int[n+1];
			int[] w = new int[m+1];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			
			hlist.clear();
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
			Collections.sort(hlist);
			
			int ans = 0;
			
			for (int i = 1; i <= m; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += w[j];
				for (int j = 0; j <= m-i; j++) {
					int index = Collections.binarySearch(hlist, sum);
					int count = 0;
					if (index >= 0) {
						int k = index;
						while (k < hlist.size() && hlist.get(k) == sum) {
							count++;
							k++;
						}
						k = index-1;
						while (k >= 0 && hlist.get(k) == sum) {
							count++;
							k--;
						}
					}
					ans += count;
					
					sum -= w[j];
					sum += w[j+i];
				}
			}
			out.printf("%d\n",ans);
			
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}