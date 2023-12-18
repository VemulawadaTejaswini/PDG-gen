
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;sc.hasNext();) {
			P ps[] = new P[4];
			for(int i=0;i<4;i++) ps[i] = new P(sc.nextDouble(), sc.nextDouble());
			boolean flg = true;
			for(int i=0;i<3;i++) if( ps[i].sub(ps[(i+1)%3]).det(ps[i].sub(ps[3])) * ps[i].sub(ps[(i+2)%3]).det(ps[i].sub(ps[3])) >= 0.0 )
				flg = false;
			
			System.out.println( (flg? "YES": "NO") );
		}
	}
	
	class P {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		P sub(P p) {
			return new P( x-p.x, y-p.y );
		}
		
		double det(P p) {
			return x * p.y - y * p.x;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}