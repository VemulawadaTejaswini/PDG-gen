
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < n; i++) sb.append(sc.nextInt());
			
			int min = n;
			for(int i=0;i<n;i++) for(int c=1;c<3;c++){
				StringBuilder tmp = new StringBuilder(sb.substring(0, i) + c + sb.substring(i+1));
				while(true) {
					int s = 0, g = 0; 
					for(s=0;s<tmp.length();s++) {
						g = s;
						while(g < tmp.length() && tmp.charAt(s) == tmp.charAt(g)) g++;
						if(g-s>3) break;
					}
					if( g-s<=3 ) break;
					tmp = new StringBuilder(tmp.substring(0, s) + tmp.substring(g));
				}
				min = min(tmp.length(), min);
			}
			
			System.out.println(min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}