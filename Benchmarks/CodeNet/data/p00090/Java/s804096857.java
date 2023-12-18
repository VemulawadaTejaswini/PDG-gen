import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		sc.useDelimiter("[, \r\n]+");
		while(true){
			int n=sc.nextInt();
			if(n==0)break;
			C[] clist=new C[n];
			for(int i=0;i<n;i++){
				clist[i]=new C(new P(sc.nextDouble(),sc.nextDouble()),1);
			}
			int max=1;
			for(int i=0;i<n;i++)for(int j=i+1;j<n;j++){
				ArrayList<P> sec=C.intersectionCC(clist[i],clist[j]);
				for(P secp:sec){
					int c=0;
					for(int k=0;k<n;k++){
						if(Math.abs(P.norm(secp,clist[k].p)-clist[k].r)<=P.EPS)c++;
					}
					max=Math.max(c,max);
				}
			}
			ln(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}

class P {
	double x;
	double y;
	static final double EPS=1e-10;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}

	public P a(P a){
		return new P(x+a.x,y+a.y);
	}
	public P s(P a){
		return new P(x-a.x,y-a.y);
	}
	public P scale(double a){
		return new P(x*a,y*a);
	}

	public P m(P a){//複素数積
		return new P(x*a.x-y*a.y,x*a.y+y*a.x);
	}
	public P d(P a){
		return new P(x*a.x+y*a.y,y*a.x-x*a.y).scale(1/dist2(this,O));
	}


	public static  final P Xunit=new P(1,0);
	public static  final P Yunit=new P(0,1);
	public static  final P O=new P(0,0);

	public static double norm(P a,P b){
		return Math.sqrt(dist2(a,b));
	}
	public double norm(){
		return norm(this,O);
	}
	public double dist2(P a){
		return dist2(this,a);
	}
	public static double dist2(P a,P b){
		return (a.x-b.x)*(a.x-b.x)+(a.y-b.y)*(a.y-b.y);
	}

	public String toString(){
		return "("+x+","+y+")";
	}
}

class C {
	P p;
	double r;
	static final double EPS=1e-10;
	C(P _p,double _r){
		p=_p;
		r=_r;
	}
	public static  final C Unit=new C(P.O,1);
	public static ArrayList<P> intersectionCC(C a,C b){
		ArrayList<P> res=new ArrayList<P>();
 		double d=P.norm(a.p, b.p);
		P diff=b.p.s(a.p).scale(1/d);
		if(a.r+b.r<d-EPS){//離れていて交点0

		}else if(d<EPS && Math.abs(a.r-b.r)<EPS){//同じ

		}else if(Math.abs(a.r-b.r)>d+EPS){//内側に含む

		}else if(Math.abs(a.r+b.r-d)<EPS){//外側で接する
			res.add(a.p.a(diff.scale(a.r)));
		}else if(Math.abs(Math.abs(a.r-b.r)-d)<EPS){//内側で接する
			res.add(a.p.a(diff.scale(a.r)));
		}else{//2点で交わる
			double rc=(d*d+a.r*a.r-b.r*b.r)/(2*d);
			double rs=Math.sqrt(a.r*a.r-rc*rc);
			res.add(a.p.a(diff.m(new P(rc,rs))));
			res.add(a.p.a(diff.m(new P(rc,-rs))));
		}
		return res;
	}
	public String toString(){
		return "P:"+p+"r:"+r;
	}
}