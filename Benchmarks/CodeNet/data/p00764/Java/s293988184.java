
import java.lang.reflect.Array;
import java.util.*;
import java.util.Map.Entry;


import static java.lang.Math.*;
import static java.lang.System.*;

class Main {
	public static Random rand=new Random();

	static class P{
		static Comparator<P> comp=new Comparator<P>(){
			public int compare(P p1, P p2) {
				return p1.x!=p2.x?signum(p1.x-p2.x):signum(p1.y-p2.y);
			}
		};

		//geo
		static final double EPS=1e-10;
		static int signum(double x){
			return x<-EPS?-1:x>EPS?1:0;
		}
		public static  final P
			Xunit=new P(1,0),
			Yunit=new P(0,1),
			O=new P(0,0);

		double x,y;
		P(double _x,double _y){
			x=_x;
			y=_y;
		}

		//x+yi x-yi
		P conj(){
			return new P(x,-y);
		}
		P add(P a){
			return new P(x+a.x,y+a.y);
		}
		P sub(P a){
			return new P(x-a.x,y-a.y);
		}
		P mul(P a){
			return new P(x*a.x-y*a.y,x*a.y+y*a.x);
		}
		P div(P a){
			double d2=a.dist2(O);
			return new P(dot(a,this)/d2,cross(a,this)/d2);
		}
		//a・b=|a||b|cosθ=a.x*b.x+a.y*b.y
		static double dot(P a,P b){
			return  a.x*b.x+a.y*b.y;
		}
		//a×b=|a||b|sinθ=a.x*b.y-a.y*b.x
		static double cross(P a,P b){
			return  a.x*b.y-a.y*b.x;
		}
		//二乗距離
		double dist2(P p){
			return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y);
		}
		//a,b間の距離
		double dist(P p){
			return sqrt(dist2(p));
		}
		public double norm(){
			return dist(O);
		}
		//oからみたaの角度
		static double arg(P a,P o){
			P dir=a.sub(o);
			double s=acos(dir.x/dir.norm());
			return dir.y>0?s:2*PI-s;
		}
		P rotate(P o,double arg){//oを中心に回転
			return this.add(this.sub(o).mul(new P(cos(arg),sin(arg))));
		}
		static P polar(double abs,double arg){//絶対値と偏角から複素数取得
			return new P(abs*cos(arg),abs*sin(arg));
		}
		static int ccw(P a,P b,P c){// a→b→cと進むときの向き
			b=b.sub(a);c=c.sub(a);
			if(cross(b,c)>EPS)return 1;//counter clockwise
			if(cross(b,c)<-EPS)return -1;//clockwise
			if(dot(b,c)<-EPS)return 2;//c--a--b on line
			if(b.norm()<c.norm()-EPS)return -2;//a--b--c on line
			return 0;//a--c--b on line (or b==c)
		}
		//→AO,→BOの面積の2倍
		static double S2(P a,P b,P o){
			return cross(a.sub(o),b.sub(o));
		}
		static double S(P a,P b,P o){
			return S2(a,b,o)/2;
		}
		// ?
		static P proj(P p,P o){
			return o.mul(new P(dot(p,o)/o.norm(),0));
		}
		public boolean equals(Object obj) {
			if(obj instanceof P){
				P p=(P)obj;
				return signum(x-p.x)==0 && signum(y-p.y)==0;
			}
			return false;
		}
		public String toString(){
			return "("+x+","+y+")";
		}
	}

	static class C {
		//geo
		static final double EPS=1e-10;
		static int signum(double x){
			return x<-EPS?-1:x>EPS?1:0;
		}
		P p;
		double r;
		C(P _p,double _r){
			p=_p;
			r=_r;
		}
		static  final C Unit=new C(P.O,1);
		//二円の交点
		static ArrayList<P> intersection(C c1,C c2){
			ArrayList<P> res=new ArrayList<P>();
	 		double d=c1.p.dist(c2.p);
			if(d<EPS && abs(c1.r-c2.r)<EPS){//重なる
			}else if(abs(c1.r+c2.r-d)<EPS){//円が接する
				P diff=c2.p.sub(c1.p).div(new P(d,0));
				res.add(c1.p.add(diff.mul(new P(c1.r,0))));
			}else if(d<c1.r+c2.r){//二円が交差
				double rc=(d*d+c1.r*c1.r-c2.r*c2.r)/(2*d);
				double rs=Math.sqrt(c1.r*c1.r-rc*rc);
				P diff=c2.p.sub(c1.p).div(new P(d,0));
				res.add(c1.p.add(diff.mul(new P(rc,rs))));
				res.add(c1.p.add(diff.mul(new P(rc,-rs))));
			}else{//交点なし
			}
			return res;
		}
	}
	//線分
	static class S extends AL{
		S(P _p1, P _p2) {super(_p1, _p2);}
		boolean isIntersect(P p){//|a-p|+|p-b|<=|a-b|
			return p1.sub(p).norm()+p2.sub(p).norm()<=p1.sub(p2).norm()+EPS;
		}
		boolean isIntersect(S l){
			return P.ccw(p1,p2,l.p1)*P.ccw(p1,p2,l.p2)<=0
			&& P.ccw(l.p1,l.p2,p1)*P.ccw(l.p1,l.p2,p2)<=0;
		}
		//線分と点
		double dist(P p){
			if(P.dot(p2.sub(p1),p.sub(p1))<EPS)return p.sub(p1).norm();
			if(P.dot(p1.sub(p2),p.sub(p2))<EPS)return p.sub(p2).norm();
			return abs(P.S(p2,p,p1))/p1.sub(p2).norm();
		}
		//線分と線分
		double dist(S l){
			if(isIntersect(l))return 0;
			return min(min(dist(l.p1),dist(l.p2)),min(l.dist(p1),l.dist(p2)));
		}
	}
	abstract static class AL{
		//geo
			static final double EPS=1e-10;
			static int signum(double x){
				return x<-EPS?-1:x>EPS?1:0;
			}
		public P p1,p2;
		AL(P _p1,P _p2){
			p1=_p1;
			p2=_p2;
		}
//		//交点 (交差判定なし)
//		static P intersection(AL l1,AL l2){
//			P dl1=l1.p2.sub(l1.p1),dl2=l2.p2.sub(l2.p1);
//			double a=P.cross(dl2,l2.p1.sub(l1.p1));
//			double b=P.cross(dl2,dl1);
//			if(abs(a)<EPS && abs(b) <EPS)return l1.p1;//same
//			return l1.p1.add(dl1.mul(new P(a/b,0.0)));
//		}


		public boolean equals(Object obj) {
			if(obj instanceof AL){
				AL l=(AL)obj;
				return this.p1.equals(l.p1) && this.p2.equals(l.p2);
			}
			return false;
		}
		public String toString(){
			return p1+"-"+p2;
		}
	}



	public void run() {
		Case:while(true){
			int n=sc.nextInt();
			if(n==0)return;
			C[] cs=new C[n];

			for(int i=0;i<n;i++){
				cs[i]=new C(new P(sc.nextInt(),sc.nextInt()),sc.nextInt());
			}
			double[] dp=new double[2*n];
			Arrays.fill(dp,Double.MAX_VALUE);

			//先頭++二円の交点 2*(n-1)個++最後
			P[] ips=new P[2*n];
			ips[0]=cs[0].p;ips[2*n-1]=cs[n-1].p;
			for(int i=0;i<n-1;i++){
				//i-1とiの円の交点を計算
				List<P> ip=C.intersection(cs[i],cs[i+1]);
				ips[2*i+1]=ip.get(0);ips[2*i+2]=ip.get(1);
			}

			//通過線分
			S[] ss=new S[n-1];
			for(int i=0;i<n-1;i++)ss[i]=new S(ips[2*i+1],ips[2*i+2]);

			//初期点からのdp
			dp[0]=0;
			for(int i=0;i<2*n;i++){//dp
				for(int j=i+1;j<2*n;j++){
					int slen=(j-1)/2;
					//全てリンクしてるかチェック
					boolean isIn=true;
					for(int k=(i-1)/2;k<slen;k++){
						if(!ss[k].isIntersect(new S(ips[j],ips[i]))){
							isIn=false;break;
						}
					}
					if(isIn)dp[j]=min(dp[j],dp[i]+ips[i].dist(ips[j]));
				}
			}
			ln(dp[2*n-1]);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}

	// from this
//		static BufferedReader in;
//		static PrintWriter out;
//		static {
//	    	try {
//				in =new BufferedReader(new FileReader("file.in")); Project/file.in
//				out=new PrintWriter(new BufferedWriter(new FileWriter("file.out")));
//	    	} catch (IOException e) {
//				e.printStackTrace();
//			}
	//  }
	// end

	static Scanner sc=new Scanner(in);

	//output lib
	static final String br=System.getProperty("line.separator");
	static final String[] asep=new String[]{""," ",br,br+br};
	static String str(boolean o){
		return o?"YES":"NO";
	}
	static <K,V> String str(Map<K, V> map){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(Entry<K,V> set:map.entrySet()){
			if(!isFirst)sb.append(br);
			sb.append(str(set.getKey())).append(":").append(str(set.getValue()));
			isFirst=false;
		}
		return sb.toString();
	}
	static <E> String str(Collection<E> list){
		StringBuilder sb=new StringBuilder();
		boolean isFirst=true;
		for(E e:list){
			if(!isFirst)sb.append(" ");
			sb.append(str(e));
			isFirst=false;
		}
		return sb.toString();
	}
	static String str(Object o){
		int depth=_getArrayDepth(o);
		if(depth>0)return _strArray(o,depth);
		return o.toString();
	}
	static int _getArrayDepth(Object o){
		if(!o.getClass().isArray() || Array.getLength(o)==0) return 0;
		return 	1+_getArrayDepth(Array.get(o,0));
	}
	//depth ex A[10]…1 A[10][10]…2 exception A[0]…0 A[10][0]…1 A[0][0]…0
	static String _strArray(Object o,int depth){
		if(depth==0) return str(o);
		StringBuilder sb=new StringBuilder();
		for(int i=0,len=Array.getLength(o);i<len;i++){
			if(i!=0)sb.append(asep[depth]);
			sb.append(_strArray(Array.get(o,i),depth-1));
		}
		return sb.toString();
	}
	static void pr(Object... os){
		boolean isFirst=true;
		for(Object o:os){
			if(!isFirst)out.print(" ");
			out.print(o);
			isFirst=false;
		}
	}
	static void ln(){
		out.println();
	}
	static void ln(Object... os){
		for(Object o:os){
			pr(o);ln();
		}
	}
}