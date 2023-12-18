
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	P[] ps;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			ps = new P[n];
			for(int i=0;i<n;i++) {
				ps[i] = new P(sc.nextDouble(), sc.nextDouble());
			}
			int cnt_max = 0;
			int cnt = 0;
			for(int i=0;i<n-1;i++) for(int j=i+1;j<n;j++) {
				
				if( sqrt(dis( ps[i], ps[j] )) < 2.0 ) {
					P m = new P( (ps[i].x+ps[j].x)/2, (ps[i].y+ps[j].y)/2);
					double d = sqrt(1-dis(ps[i], m ));
					P dp = new P((ps[i].y-ps[j].y), -(ps[i].x-ps[j].x));
					dp.nom();
					dp.mult(d);
					P c[] = new P[2];
					c[0] = m.add(dp);
					dp.mult(-1.0);
					c[1] = m.add(dp);
					for(int l=0;l<2;l++) {
						cnt = 0;
//						LinkedList<Double> dist = new LinkedList<Double>();
//						LinkedList<Integer> ind = new LinkedList<Integer>();
						for(int k=0;k<n;k++) {
//							debug(dis(c[l], ps[k]));
							if(sqrt(dis(c[l], ps[k])) < 1.0 || k==i||k==j) {
//								dist.add(dis(c[l], ps[k]));
//								ind.add(k);
								cnt++;
							}
						}
//						debug(dis( ps[i], ps[j] ), cnt_max, cnt);
						cnt_max = max(cnt_max, cnt);
					}
				}
			}
			System.out.println(cnt_max);
		}
	}
	
	double dis( P p1, P p2 ) {
		return (p1.x-p2.x)*(p1.x-p2.x)+(p1.y-p2.y)*(p1.y-p2.y);
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
	
	class P {
		double x, y;
		P (double x, double y) {
			this.x = x;
			this.y = y;
		}
		void nom() {
			double nom = sqrt(x*x + y*y);
			x /= nom;
			y /= nom;
		}
		P add(P p) {
			x += p.x;
			y += p.y;
			return new P(x, y);
		}
		P mult(double d) {
			x *= d;
			y *= d;
			return new P(x, y);
		}
	}
}