import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;


//Roads on Towns
public class Main{

	int NA, NB;
	double INF = 1L<<50, res = INF;

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
	double[] mid(double[] a, double[] b){
		return new double[]{(a[0]+b[0])/2, (a[1]+b[1])/2};
	}
	double area(double[] a, double[] b, double[] c){
		double res = cross(a, b)+cross(b, c)+cross(c, a);
		return Math.abs(res)/2;
	}
	double ex(double[] a, double[] b, double[] c){
		double[] s1 = sub(b, a), s2 = sub(c, a);
		return cross(s1, s2);
	}
	double angleTan(double[] a, double[] b){
		return Math.atan2(cross(a, b), dot(a, b));
	}
	double angleCos(double[] a, double[] b){
		double na = norm(a), nb = norm(b);
		return Math.acos(dot(a, b)/na/nb);
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

	double[][][] p;
	int[] ua, ub;
	int ka, kb;
	
	double[] d;
	double dijkstraA(double D){
		Arrays.fill(d, INF);
		d[0] = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(NB, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return (int)Math.signum(d[o1]-d[o2]);
			}
		});
		q.add(0);
		while(!q.isEmpty()){
			int v = q.poll();
			if(v==1)return d[1];
			for(int i=1;i<NA;i++){
				double w = d[v] + norm(p[0][v], p[0][i]);
				if(res+EPS < w)continue;
				boolean ok = true;
				for(int j=0;j+1<=kb&&ok;j++)if(crossing(p[1][ub[j]], p[1][ub[j+1]], p[0][v], p[0][i]))ok = false;
				if(ok && w < d[i]){
					q.remove(i); d[i] = w; q.add(i);
				}
			}
		}
		return INF;
	}
	double dijkstraB(double D){
		Arrays.fill(d, INF);
		d[0] = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(NB, new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return (int)Math.signum(d[o1]-d[o2]);
			}
		});
		q.add(0);
		while(!q.isEmpty()){
			int v = q.poll();
			if(v==1)return d[1];
			for(int i=1;i<NB;i++){
				double w = d[v] + norm(p[1][v], p[1][i]);
				if(res+EPS < w)continue;
				boolean ok = true;
				for(int j=0;j+1<=ka&&ok;j++)if(crossing(p[0][ua[j]], p[0][ua[j+1]], p[1][v], p[1][i]))ok = false;
				if(ok && w < d[i]){
					q.remove(i); d[i] = w; q.add(i);
				}
			}
		}
		return INF;
	}
	
	void fa(){
		double d = norm(p[0][0], p[0][1]);
		ua[1] = 1;
		ka = 1;
		res = Math.min(res, d+dijkstraB(d));
		for(int k=2;k<NA;k++){
			d = norm(p[0][0], p[0][k]) + norm(p[0][k], p[0][1]);
			ka = 2;
			ua[1] = k; ua[2] = 1;
			res = Math.min(res, d+dijkstraB(d));
		}
	}
	void fb(){
		double d = norm(p[1][0], p[1][1]);
		ub[1] = 1;
		kb = 1;
		res = Math.min(res, d+dijkstraA(d));
		for(int k=2;k<NB;k++){
			d = norm(p[1][0], p[1][k]) + norm(p[1][k], p[1][1]);
			kb = 2;
			ub[1] = k; ub[2] = 1;
			res = Math.min(res, d+dijkstraA(d));
		}
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		NA = sc.nextInt(); NB = sc.nextInt();
		p = new double[2][][];
		p[0] = new double[NA][2]; p[1] = new double[NB][2];
		for(int i=0;i<NA;i++)for(int j=0;j<2;j++)p[0][i][j]=sc.nextDouble();
		for(int i=0;i<NB;i++)for(int j=0;j<2;j++)p[1][i][j]=sc.nextDouble();
		ua = new int[NA]; ub = new int[NB];
		d = new double[1000];
		fa(); fb();
		if(res==INF)System.out.println(-1);
		else System.out.printf("%.10f\n", res);
	}

	public static void main(String[] args) {
		new Main().run();
	}
}