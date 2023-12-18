
import java.util.*;

import static java.lang.Math.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			int[] a = new int[n];
			for (int i = 0; i < n; i++) a[i] = sc.nextInt();
			
			int min = n;
			for(int i=0;i<n;i++) for(int c=1;c<=3;c++){
				int tmp = a[i];
				a[i] = c;
				int l = i, r = i, cnt = 0;
				while(l>=0) {
					int cc = a[l];
					while( l > 0 && cc == a[l-1] ) l--;
					while( r < n-1 && cc == a[r+1] ) r++;
					if( r-l-cnt+1 < 4 ) break;
					cnt += r-l-cnt+1;
					l--;
				}
				a[i] = tmp;
				min = min(n - cnt, min);
			}
			
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}