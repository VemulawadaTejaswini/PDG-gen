
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			if( (x|y) == 0 ) break;
			
			System.out.println( (1.0*x*x + 2.0*x*sqrt(1.0*y*y+1.0*x*x/4) ) );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}