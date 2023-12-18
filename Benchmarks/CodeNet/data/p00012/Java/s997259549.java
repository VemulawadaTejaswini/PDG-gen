
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	double EPS = 1e-30;

	void run() {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			P ps[] = new P[4];
			for(int i=0;i<4;i++) ps[i] = new P(sc.nextDouble(), sc.nextDouble());
			
			boolean flg = true;
			for(int i=0;i<3;i++) if(cross(ps[i], ps[(i+1)%3], ps[(i+2)%3], ps[3])){
				flg = false;
				break;
			}
			System.out.println( (flg? "YES": "NO") );
		}
	}
	
	//線分交差判定
	boolean cross(P p1, P p2, P q1, P q2) {
		return ccw(p1, p2, q1) * ccw(p1, p2, q2) <= 0 &&
			ccw(q1, q2, p1) * ccw(q1, q2, p2) <= 0;
	}
	
	//時計回りなのか．反時計回りなのか，直線状なのか，とにかく位置関係をみる
	int ccw (P a, P b, P c) {
		P s = b.sub(a);
		P t = c.sub(a);
		if( s.det(t) > EPS ) return 1;
		if( s.det(t) < -EPS ) return -1;
		if( s.dot(t) < -EPS ) return 2;
		if( s.dot(s) + EPS < t.dot(t) ) return -2;
		return 0;
	}
	
	public class P {
		double EPS = 1e-10;
		double x, y;
		P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		
		double add(double a, double b) {	//誤差を考慮
			if( abs(a+b) < EPS * ( abs(a) + abs(b) ) ) return 0;
			return a + b;
		}
		
		P add(P p) {	//和
			return new P(x+p.x, y+p.y);
		}
		
		P sub(P p) {	//差
			return new P(x-p.x, y-p.y);
		}
		
		double dot(P p) {	//内積
				return add(x*p.x, y*p.y);
		}
		
		double det(P p) {	//外積
			return add(x*p.y, -y*p.x);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}