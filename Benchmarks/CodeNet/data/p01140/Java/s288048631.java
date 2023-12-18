import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	class I implements Comparable<I>{
		int i;
		I(int i) {
			this.i = i;
		}
		@Override
		public int compareTo(I obj) {
			if (this.i < obj.i) return -1;
			if (this.i > obj.i) return 1;
			return 0;
		}
		@Override
		public boolean equals(Object o) {
			if (o instanceof I) {
				I obj = (I) o;
				if (this.i == obj.i)
					return true;
			}
			return false;
		}
	}
	
	void run() {
		int n, m;
		List<I> hlist = new ArrayList<I>();
		List<I> wlist = new ArrayList<I>();
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
					hlist.add(new I(sum));
					sum -= h[j];
					sum += h[j+i];
				}
			}
			for (int i = 1; i <= m; i++) {
				sum = 0;
				for (int j = 0; j < i; j++) sum += w[j];
				for (int j = 0; j <= m-i; j++) {
					wlist.add(new I(sum));
					sum -= w[j];
					sum += w[j+i];
				}
			}
			
			Collections.sort(hlist);
			Collections.sort(wlist);
			
			int ans = 0;
			for (I a : hlist) {
				int index = Collections.binarySearch(wlist, a);
				int count = 0;
				if (index >= 0) {
					int k = index;
					while (k < wlist.size() && wlist.get(k).i == a.i) {
						count++;
						k++;
					}
					k = index-1;
					while (k >= 0 && wlist.get(k).i == a.i) {
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