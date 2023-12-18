import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

//Area Separation
public class Main{

	final double EPS = 1e-10;
	
	double dot(double[] a, double[] b){
		return a[0]*b[0]+a[1]*b[1];
	}
	double cross(double[] a, double[] b){
		return a[0]*b[1]-a[1]*b[0];
	}
	double norm(double[] a){
		return Math.hypot(a[0], a[1]);
	}
	double norm(double[] a, double[] b){
		return Math.hypot(a[0]-b[0], a[1]-b[1]);
	}
	double[] sub(double[] a, double[] b){
		return new double[]{a[0]-b[0], a[1]-b[1]};
	}
	double area(double[] a, double[] b, double[] c){
		double res = cross(a, b)+cross(b, c)+cross(c, a);
		return Math.abs(res)/2;
	}
	double ex(double[] a, double[] b, double[] c){
		double[] s1 = sub(b, a), s2 = sub(c, a);
		return cross(s1, s2);
	}
	boolean crossing(double[] a, double[] b, double[] s, double[] t){
		if(Math.abs(cross(sub(b, a), sub(t, s)))<EPS){
			return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))))<EPS;
		}
		if(ex(a, b, s)*ex(a, b, t)>0)return false;
		if(ex(b, a, s)*ex(b, a, t)>0)return false;
		if(ex(s, t, a)*ex(s, t, b)>0)return false;
		return ex(t, s, a)*ex(t, s, b)<EPS;
	}
	double dist(double[] a, double[] b, double[] p){
		if(dot(sub(b, a), sub(p, a))<EPS)return norm(a, p);
		if(dot(sub(a, b), sub(p, b))<EPS)return norm(b, p);
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double dist(double[] a, double[] b, double[] s, double[] t){
		if(crossing(a, b, s, t))return 0;
		return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))));
	}
	double distLP(double[] a, double[] b, double[] p){
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	double[] cp(double[] a, double[] b, double[] s, double[] t){
		double ds = distLP(a, b, s), dt = distLP(a, b, t);
		double k = ds/(ds+dt);
		double[] d = sub(t, s);
		return new double[]{s[0]+k*d[0], s[1]+k*d[1]};
	}
	
	class P{
		double x, y;
		public P(double x, double y) {
			this.x = x;
			this.y = y;
		}
		public boolean equals(Object obj) {
			P o = (P)obj;
			return Math.sqrt((x-o.x)*(x-o.x)+(y-o.y)*(y-o.y))<EPS;
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			double[][][] l = new double[n][2][2];
			int res = 1;
			for(int i=0;i<n;i++){
				for(int j=0;j<2;j++)for(int k=0;k<2;k++)l[i][j][k]=sc.nextDouble();
				Set<P> s = new HashSet<P>();
				for(int j=0;j<i;j++){
					if(!crossing(l[i][0], l[i][1], l[j][0], l[j][1]))continue;
					double[] cp = cp(l[i][0], l[i][1], l[j][0], l[j][1]);
					if(Math.abs(cp[0])==100||Math.abs(cp[1])==100)continue;
					s.add(new P(cp[0], cp[1]));
				}
				res+=s.size()+1;
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}