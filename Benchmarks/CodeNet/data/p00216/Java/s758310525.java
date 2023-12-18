
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int w = sc.nextInt();
			if(w == -1) break;
			int ret = 0;
			if( w > 30 ) {
				ret += 160 * (w-30);
				w = 30;
			}
			if( w > 20 ) {
				ret += 140 * (w-20);
				w = 20;
			}
			if( w > 10 ) {
				ret += 125 *(w-10);
			}
			System.out.println( 4280 - (ret+1150) );
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}