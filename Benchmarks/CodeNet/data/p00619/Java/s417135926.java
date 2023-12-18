
import java.util.*;
import java.math.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.math.BigInteger.*;
public class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	void debug(Object...os){
//		System.err.println(deepToString(os));
	}
	void run(){
		Scanner sc=new Scanner(System.in);
		for(;;){
			int n=sc.nextInt();
			if(n==0)return;
			S[] ss = new S[n];
			for(int i=0;i<n;i++){
				ss[i] = new S(new P(sc.nextDouble(),sc.nextDouble()),new P(sc.nextDouble(),sc.nextDouble()));
			}
			A[][] segs = new A[n][2];
			for(int i=0;i<n;i++){
				ArrayList<P> list = new ArrayList<P>();
				list.add(ss[i].p1);list.add(ss[i].p2);
				for(int j=0;j<n;j++)if(i!=j){
					P cr = ss[i].intersection(ss[j]);
					if(cr!=null && !list.contains(cr))list.add(cr);
				}
				sort(list);
//				for(int j=0;j<n;j++){
//					
//				}
				segs[i][0]=new A();
				segs[i][1] = new A();
				for(int j=1;j<list.size();j++){
					segs[i][0].add(new S(list.get(j-1), list.get(j)));
					segs[i][1].add(new S(list.get(j),list.get(j-1)));
				}
				
			}
			V[][][] vs=new V[n][2][];
			P st = new P(sc.nextDouble(),sc.nextDouble());
			P go = new P(sc.nextDouble(),sc.nextDouble());
			PriorityQueue<E> que=new PriorityQueue<E>();
			for(int i=0;i<n;i++){
				for(int j=0;j<2;j++){
					vs[i][j] = new V[segs[i][0].size()];
					for(int k=0;k<vs[i][j].length;k++){
						vs[i][j][k]=new V();
						if(segs[i][j].get(k).p2.equals(go))vs[i][j][k].goal=true;
						if(segs[i][j].get(k).p1.equals(st)){
							vs[i][j][k].d = 0;
							que.offer(new E(vs[i][j][k],0));
						}
					}
//					debug(segs[i][j]);
				}
			}
			for(int i=0;i<n;i++){
				for (int j = 0; j < 2; j++) {
					for (int k = 0; k < vs[i][j].length; k++) {
						for (int i2 = 0; i2 < n; i2++) {
							for (int j2 = 0; j2 < 2; j2++) {
								for (int k2 = 0; k2 < vs[i2][j2].length; k2++) {
									S s = segs[i][j].get(k) , t = segs[i2][j2].get(k2);
									if(s.p2.equals(t.p1)){
										vs[i][j][k].es.add(new E(vs[i2][j2][k2], segs[i][j].get(k).arg(segs[i2][j2].get(k2))/PI*180 ));
									}
								}
							}
						}
					}
				}
			}
			double res = INF;
			while(!que.isEmpty()){
				V now = que.poll().to;
				debug(now);
				if(now.goal){
					res=min(res,now.d);
					break;
				}
				for(E e:now.es){
					debug(e);
					if(e.to.d > now.d + e.d){
						e.to.d = now.d+e.d;
						que.offer(new E(e.to,now.d + e.d));
					}
				}
			}
			System.out.println(res==INF ? "-1" : res);
		}
	}
	class A extends ArrayList<S>{}
	int INF=1<<28;
	class V{
		boolean goal = false;
		ArrayList<E> es = new ArrayList<E>();
		double d = INF;
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ""+d;
		}
	}
	class E implements Comparable<E>{
		V to;
		double d;
		E(V to,double d){
			this.to = to;
			this.d=d;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return ""+d;
		}
		@Override
		public int compareTo(E o) {
			return (int)signum(d-o.d);
		}
	}
	boolean eq(double a,double b){
		return abs(a-b)<EPS;
	}
	class S{
		P p1,p2;
		
		double arg(S s){
			return p2.sub(p1).arg(s.p2.sub(s.p1));
		}
		
		public S(P p1, P p2) {
			super();
			this.p1 = p1;
			this.p2 = p2;
		}
		P intersection(S s) {// IF 'truly' intersect '1' point THEN point ELSE null.
			P r = p2.sub(p1), t = s.p2.sub(s.p1);
			double d = t.det(r);
			if (sig(d)==0)
				return null;// parallel.
			P p = p1.add(r.mul(t.det(s.p1.sub(p1)) / d)); // intersection if line.
			if (contains(p) >= 0 && s.contains(p) >= 0)
				return p;
			return null;
		}
		int contains(P p) { // OUT,ON,IN -> -1,0,1
			if (p1.equals(p) || p2.equals(p))
				return 0;
			P r1 = p1.sub(p), r2 = p2.sub(p);
			if (eq(r1.det(r2), 0) && eq(r1.dot(r2), -r1.norm() * r2.norm()))
				return 1;
			return -1;
		}

		@Override
		public String toString() {
			return "S [p1=" + p1 + ", p2=" + p2 + "]";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + ((p1 == null) ? 0 : p1.hashCode());
			result = prime * result + ((p2 == null) ? 0 : p2.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			S other = (S) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (p1 == null) {
				if (other.p1 != null)
					return false;
			} else if (!p1.equals(other.p1))
				return false;
			if (p2 == null) {
				if (other.p2 != null)
					return false;
			} else if (!p2.equals(other.p2))
				return false;
			return true;
		}

		private Main getOuterType() {
			return Main.this;
		}
		
	}
	class P implements Comparable<P>{
		ArrayList<P> ps = new ArrayList<P>();
		double x,y;
		P add(P p){return new P(x+p.x,y+p.y);}
		P sub(P p){return new P(x-p.x,y-p.y);}
		P mul(double d){return new P(x*d,y*d);}
		P div(double d){return new P(x/d,y/d);}
		double dot(P p){return x*p.x+y*p.y;}
		double det(P p){return x*p.y-y*p.x;}
		double norm(){return hypot(x,y);}
		double dist(P p){return sub(p).norm();}
		double arg(P p){return acos(dot(p)/(norm()*p.norm()));}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			long temp;
			temp = Double.doubleToLongBits(x);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			temp = Double.doubleToLongBits(y);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			P other = (P) obj;
			return compareTo(other)==0;
		}

		private Main getOuterType() {
			return Main.this;
		}

		public P(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}
		
		@Override
		public int compareTo(P o) {
			// TODO Auto-generated method stub
			return sig(x-o.x)!=0 ? sig(x-o.x) : sig(y-o.y);
		}
		
		@Override
		public String toString() {
			return "P [x=" + x + ", y=" + y + "]";
		}
		
	}
	int sig(double d){
		return d<-EPS ? -1 : d>EPS ? 1 : 0;
	}
	double EPS = 1e-6;
}