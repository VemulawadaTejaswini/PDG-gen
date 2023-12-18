
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int a[] = new int[3];
		int max = 0;
		for(int i=0;i<str.length();i++) {
			switch (str.charAt(i)) {
			case 'J':
				if( (a[1]|a[2]) == 0 )
					a[0]++;
				else {
					a[0] = 1;
					a[1] = a[2] = 0;
				}
				break;
			case 'O':
				if( a[2] == 0 && a[0] > a[1] ) a[1]++;
				else a[0] = a[1] = a[2] = 0;
				break;
			case 'I':
				if(a[1]-1 > a[2]) a[2]++;
				else {
					max = max(a[1], max);
					a[0] = a[1] = a[2] = 0;
				}
			}
//			debug(a);
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}