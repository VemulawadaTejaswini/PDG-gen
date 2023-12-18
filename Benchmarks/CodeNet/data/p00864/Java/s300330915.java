import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	class p implements Comparable<p>{
		int pos;
		int v;
		
		public int compareTo(p t){
			return t.v - v;
		}
	}

	void run() {
		for (;;) {
			int n = sc.nextInt();
			int w = sc.nextInt();

			if ((n | w) == 0) {
				break;
			}

			p data[] = new p[100/w+ 1];

			for (int i = 0; i < 100 / w + 1; i++) {
				data[i] = new p();
				data[i].pos = i;
			}

			int maxv = 0;
			int maxp = 0;
			for (int i = 0; i < n; i++) {
				int v = sc.nextInt() / w;
				
				data[v].v++;
				maxv = Math.max(data[v].v, maxv);
				maxp = Math.max(v, maxp);
			}
			data = Arrays.copyOf(data, maxp);
			Arrays.sort(data);
			double ans = 0;
			for (int i = 0; i < maxp ; i++) {
				ans += ((double)maxp  - data[i].pos) / (maxp ) * data[i].v / (double)maxv;
			}
			System.out.println(ans+0.01);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}