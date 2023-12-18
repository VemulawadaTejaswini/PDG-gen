
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int days[] = {31, 29, 31, 30, 31 , 30, 31, 31, 30, 31, 30, 31};
	String[] to = {"Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday"};
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int m = sc.nextInt();
			int d = sc.nextInt();
			if( (m|d) == 0 ) break;
			int dd = 0;
			for(int i=1;i<m;i++) dd+= days[i-1];
			dd += d-1;
			System.out.println( to[dd%7] );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}