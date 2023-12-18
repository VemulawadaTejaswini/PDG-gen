
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			String str = sc.next();
			int joi = 0;
			int ioi = 0;
			for(int i=0;i<str.length()-2;i++) {
				if(str.charAt(i) == 'J' && str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I')
					joi++;
				if(str.charAt(i) == 'I' && str.charAt(i+1) == 'O' && str.charAt(i+2) == 'I')
					ioi++;
			}
			System.out.println(joi);
			System.out.println(ioi);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}