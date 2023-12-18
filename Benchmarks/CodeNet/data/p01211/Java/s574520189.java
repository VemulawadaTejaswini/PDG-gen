
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	int p, q, r;
	final int DIV = 2000000;
	double s, t;
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			if( (p|q|r) == 0 ) break;
			s = p - q;
			t = (double)( p - q ) / q; 
			if( r == 0 ) System.out.println((double)2 * ( p - q ) * PI );
			else {
				double sum = 0;
				int loop = q / lcm(q, p-q);
				double sheta = 0;
				P p1 = hypotroid(sheta);
				for(int i=0;i<DIV;i++) {
					double dsheta = 2 * PI * loop / DIV * (i + 1);
					P p2 = hypotroid(dsheta);
					sum += d(p1, p2);
					sheta = dsheta;
					p1.x = p2.x; p1.y = p2.y;
				}
				System.out.println(sum);
			}
		}
	}
	
	int lcm( int a, int b ) {
		if( b == 0 ) return a;
		else return lcm(b, a%b);
	}
	
	P hypotroid( double sheta ) {
		double x = s * cos(sheta) + (double)r * cos( sheta * t );
		double y = s * sin(sheta) + (double)r * sin( sheta * t );
		return new P(x, y);
	}
	
	double d(P p1, P p2) {
		double dx = p1.x - p2.x;
		double dy = p1.y - p2.y;
		return sqrt( dx * dx + dy * dy );
	}
	
	class P {
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}