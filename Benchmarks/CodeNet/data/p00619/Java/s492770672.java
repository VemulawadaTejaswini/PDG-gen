import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

//Kuru-Kuru Robot
public class Main{

	final double EPS = 1e-10;
	int INF = 1<<29;
	
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
	boolean crossing(double[] a, double[] b, double[] s, double[] t){
		//A-B, S-Tª¤É½sÌêA2üªÔÌ£ª0©Û©Åð·ð»è·é
		if(Math.abs(cross(sub(b, a), sub(t, s)))<EPS){
			return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))))<EPS;
		}
		if(ex(a, b, s)*ex(a, b, t)>0)return false;
		if(ex(b, a, s)*ex(b, a, t)>0)return false;
		if(ex(s, t, a)*ex(s, t, b)>0)return false;
		return ex(t, s, a)*ex(t, s, b)<EPS;
		//±±Åex(,,)*ex(,,)<EPSÆ·éÆA(0,0)(1,0)-(2,0)(3.0)Ìæ¤Èê¼üÉÀñÅ¢Äð·µÄ¢È¢àÌàtrueÆÈÁÄµÜ¤
	}
	//Segment a-b Point p
	double dist(double[] a, double[] b, double[] p){
		if(dot(sub(b, a), sub(p, a))<EPS)return norm(a, p);
		if(dot(sub(a, b), sub(p, b))<EPS)return norm(b, p);
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	//Segment a-b Segment s-t
	double dist(double[] a, double[] b, double[] s, double[] t){
		if(crossing(a, b, s, t))return 0;
		return Math.min(dist(a, b, s), Math.min(dist(a, b, t), Math.min(dist(s, t, a), dist(s, t, b))));
	}
	//Line a-b Point p
	double distLP(double[] a, double[] b, double[] p){
		return Math.abs(cross(sub(b, a), sub(p, a)))/norm(a, b);
	}
	//TODO verify
	double[] cp(double[] a, double[] b, double[] s, double[] t){
		double ds = distLP(a, b, s), dt = distLP(a, b, t);
		double k = ds/(ds+dt);
		double[] d = sub(t, s);
		return new double[]{s[0]+k*d[0], s[1]+k*d[1]};
	}
	double thita(double[] a, double[] b){
//		return Math.acos(norm(a)*norm(b)/cross(a, b));
		return Math.atan2(cross(a, b), dot(a, b))*180/Math.PI;
	}
	
	int P = 107;
	int trans(int a, int b, int s, int t){
		return (a*P+b)*P*P+s*P+t;
	}
	Map<Integer, Double> d;
	void run(){
		Scanner sc = new Scanner(System.in);
//		for(;;){
//		double[] A = {sc.nextDouble(), sc.nextDouble()}, B = {sc.nextDouble(), sc.nextDouble()};
//		double[] S = {sc.nextDouble(), sc.nextDouble()}, T = {sc.nextDouble(), sc.nextDouble()};
//		double[] c = cp(A, B, S, T);
//		System.out.println(c[0]+","+c[1]);
//		}
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			LinkedList<double[][]> list = new LinkedList<double[][]>();
			for(int i=0;i<n;i++){
				double[][] p = new double[2][2];
				for(int j=0;j<2;j++)for(int k=0;k<2;k++)p[j][k]=sc.nextDouble();
				list.add(p);
			}
			boolean con = true;
			while(con){
				con = false;
				for(int i=0;i<list.size();i++)for(int j=i+1;j<list.size();j++){
					if(con)break;
					double[][] a = list.get(i), b = list.get(j);
					if(Math.abs(cross(sub(a[1], a[0]), sub(b[1], b[0])))<EPS&&crossing(a[0], a[1], b[0], b[1])){
						double minx = Math.min(a[0][0], Math.min(a[1][0], Math.min(b[0][0], b[1][0])));
						double maxx = Math.max(a[0][0], Math.max(a[1][0], Math.max(b[0][0], b[1][0])));
						double miny = Math.min(a[0][1], Math.min(a[1][1], Math.min(b[0][1], b[1][1])));
						double maxy = Math.max(a[0][1], Math.max(a[1][1], Math.max(b[0][1], b[1][1])));
						double[][] r = new double[2][2];
						r[0][0] = minx; r[0][1] = miny; r[1][0] = maxx; r[1][1] = maxy;
						list.remove(j); list.remove(i);
						list.add(r);
						con = true;
					}
				}
			}
			n = list.size();
			double[][][] ps = new double[n][2][2];			
			for(int i=0;i<n;i++)ps[i] = list.get(i);
			double[] S = {sc.nextDouble(), sc.nextDouble()}, G = {sc.nextDouble(), sc.nextDouble()};
			boolean end = false;
			boolean[][] e = new boolean[n][n+2];
			double[][][] cp = new double[n][n+2][2];
			for(int i=0;i<n;i++){
				e[i][n] = crossing(ps[i][0], ps[i][1], S, S);
				e[i][n+1] = crossing(ps[i][0], ps[i][1], G, G);
				if(e[i][n]&&e[i][n+1])end = true;
				if(e[i][n])cp[i][n] = S;
				if(e[i][n+1])cp[i][n+1] = G;
			}
			if(norm(S, G)<EPS||end){
				System.out.println("0.00000000"); continue;
			}
			for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
				e[i][j] = e[j][i] = crossing(ps[i][0], ps[i][1], ps[j][0], ps[j][1]);
				if(e[i][j])cp[i][j] = cp[j][i] = cp(ps[i][0], ps[i][1], ps[j][0], ps[j][1]);
			}
//			debug(e);
			double res = INF;
			d = new HashMap<Integer, Double>();
			PriorityQueue<Integer> q = new PriorityQueue<Integer>(n, new Comparator<Integer>() {
				public int compare(Integer o1, Integer o2) {
					return (int) Math.signum(d.get(o1)-d.get(o2));
				}
			});
			for(int i=0;i<n;i++){
				if(!e[i][n])continue;
				for(int j=0;j<n;j++){
					if(i==j||!e[i][j])continue;
					d.put(trans(i, j, i, n), 0.0);
					q.add(trans(i, j, i, n));
				}
			}
			while(!q.isEmpty()){
				int v = q.poll();
				int v1 = v/(P*P), v2 = v%(P*P);
				int i = v1/P, j = v1%P, pi = v2/P, pj = v2%P;
//				System.out.println(i+"-"+j+" "+pi+"-"+pj);
				if(j==n+1){
					res = d.get(v); break;
				}
				double[] b1 = sub(cp[i][j], cp[pi][pj]);
				for(int m=0;m<n+2;m++){
					if(j==m||!e[i][m])continue;
					double[] b2 = sub(cp[i][m], cp[i][j]);
					if(norm(b2)<EPS)continue;
					double cost = d.get(v)+Math.abs(thita(b1, b2));
					int nx = trans(i, m, i, j);
					if(!d.containsKey(nx)||cost<d.get(nx)){
//						System.out.println(print(cp[i][j])+" -> "+print(cp[i][m]) + " thita:"+Math.abs(thita(b1, b2)));
//						System.out.println("NX:"+nx+" "+d.get(nx)+" -> "+cost);
						if(d.containsKey(nx))q.remove(nx);
						d.put(nx, cost); 
						q.add(nx);
					}
				}
//				for(int k=0;k<n;k++){
					int k = j;
					if(!e[i][k])continue;
					for(int m=0;m<n+2;m++){
						if(i==m||k>=n||!e[k][m])continue;
						double[] b2 = sub(cp[k][m], cp[i][j]);
						if(norm(b2)<EPS)continue;
						double cost = d.get(v)+Math.abs(thita(b1, b2));
						int nx = trans(k, m, i, j);
						if(!d.containsKey(nx)||cost<d.get(nx)){
//							System.out.println(print(cp[i][j])+" -> "+print(cp[k][m])+" thita:"+Math.abs(thita(b1, b2)));
							if(d.containsKey(nx))q.remove(nx);
							d.put(nx, cost); 
							q.add(nx);
						}
					}
//				}
			}
			if(res==INF)System.out.println("-1");
			else System.out.printf("%.8f\n", res);
		}
	}
	String print(double[] a){
		return "("+a[0]+","+a[1]+")";
	}
	void debug(Object...o){
		System.out.println(Arrays.deepToString(o));
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}