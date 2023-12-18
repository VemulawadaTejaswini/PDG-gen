import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

//Railroad Conflict
public class Main{

	final double EPS = 1e-10;

	double norm(double[] a){
		return Math.hypot(a[0], a[1]);
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	boolean intersectSS(double[] a1, double[] a2, double[] b1, double[] b2){
		return cross(sub(a2, a1), sub(b1, a1))*cross(sub(a2, a1), sub(b2, a1)) < EPS &&
		cross(sub(b2, b1), sub(a1, b1))*cross(sub(b2, b1), sub(a2, b1)) < EPS;
	}
	double[] crossPointSS(double[] a1, double[] a2, double[] b1, double[] b2){
		if(!intersectSS(a1, a2, b1, b2))return null;
		double[] b = sub(b2, b1);
		double d1 = Math.abs(cross(b, sub(a1, b1)));
		double d2 = Math.abs(cross(b, sub(a2, b1)));
		double t = d1/(d1+d2);
		double[] a = sub(a2, a1);
		return new double[]{a1[0]+a[0]*t, a1[1]+a[1]*t};
	}

	double[] A, B;

	class P implements Comparable<P>{
		double[] p;
		boolean mine;
		boolean up;
		public P(double[] p, boolean mine, boolean up) {
			this.p = p;
			this.mine = mine;
			this.up = up;
		}
		public int compareTo(P o) {
			double[] s1 = sub(p, A);
			double[] s2 = sub(o.p, A);
			double d1 = s1[0]*s1[0]+s1[1]*s1[1];
			double d2 = s2[0]*s2[0]+s2[1]*s2[1];
			return d1<d2?-1:d2<d1?1:0;
		}
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T--!=0){
			A = new double[2];
			B = new double[2];
			A[0] = sc.nextDouble();
			A[1] = sc.nextDouble();
			B[0] = sc.nextDouble();
			B[1] = sc.nextDouble();
			int n = sc.nextInt();
			List<P> l = new ArrayList<P>();
			while(n--!=0){
				double[] s = new double[2];
				double[] t = new double[2];
				s[0] = sc.nextDouble();
				s[1] = sc.nextDouble();
				t[0] = sc.nextDouble();
				t[1] = sc.nextDouble();
				int o = sc.nextInt();
				int u = sc.nextInt();
				double[] r = crossPointSS(s, t, A, B);
				if(r==null)continue;
				l.add(new P(r, o==1, u==1));
			}
			Collections.sort(l);
			int res = 0;
			boolean f = true;
			boolean up = true;
			for(P p:l){
//				System.out.println("P:" + p.p[0]+","+p.p[1]+" MINE?" + p.mine + " UP?"+p.up);
				if(f){
					f = false;
					if(p.mine)up = p.up;
					else up = !p.up;
				}
				else{
					if(p.mine && p.up!=up){
						up = p.up;
						res++;
					}
					else if(!p.mine && p.up==up){
						up = !p.up;
						res++;
					}
				}
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}