
import java.text.DecimalFormat;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			String a = sc.next();
			int l = sc.nextInt();
			if( a.equals("0") && l == 0 ) break;
			String dec = "";
			for(int i=0;i<l;i++) dec += "0";
			DecimalFormat df = new DecimalFormat(dec);
			int[] ans = new int[21];
			ans[0] = Integer.parseInt(a);
			for(int i=1;i<21;i++) {
				a = df.format(Integer.parseInt(a));
				char[] ca = a.toCharArray();
				sort(ca);
				int min = Integer.parseInt( String.valueOf(ca) );
				rev(ca);
				int max = Integer.parseInt( String.valueOf(ca) );
				ans[i] = max - min;
				a = String.valueOf(max - min);
			}
			int sel1 = -1, sel2 = -1, val = -1;;
			for(int i=1;i<21;i++) for(int j=0;j<i;j++) {
				if( ans[i] == ans[j] && sel1 == -1 ) {
					sel1  = j; 
					sel2 = i-j;
					val = ans[i];
				}
			}
			
			System.out.println(sel1 + " " + val + " " + sel2);
		}
	}
	
	void rev(char[] c) {
		int n = c.length;
		for(int i=0;i<n/2;i++) {
			char tmp = c[i];
			c[i] = c[n-i-1];
			c[n-i-1] = tmp;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}