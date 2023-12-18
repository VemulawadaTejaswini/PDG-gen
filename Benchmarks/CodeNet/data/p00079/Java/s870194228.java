import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		ArrayList<P> plist=new ArrayList<P>();
		while(sc.hasNext()){
			String[] str=sc.next().split(",");
			plist.add(new P(Double.parseDouble(str[0]),Double.parseDouble(str[1])));
		}
		P o1=plist.get(0);
		plist.remove(0);
		P prev=plist.get(0);
		plist.remove(0);
		double S=0;
		for(P p:plist){
			S+=getS(o1,prev,p);
			prev=p;
		}
		ln(S);
	}

	public double getS(P a,P b,P c){
		double sc=a.s(b).norm();
		double sa=b.s(c).norm();
		double sb=c.s(a).norm();
		double s=(sa+sb+sc)/2;
		return Math.sqrt(s*(s-sa)*(s-sb)*(s-sc));
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

class P implements Comparable<P>{
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}

	public static  final P Xunit=new P(1,0);
	public static  final P Yunit=new P(0,1);

	//:問題によって変える。
	@Override
	public int compareTo(P o) {
		if(x>o.x){
			return 1;
		}else if(x<o.x){
			return -1;
		}
		return y>o.y?1:y<o.y?-1:0;
	}

	public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
	}
	public static  double cross(P a,P b){
		return a.x*b.y-a.y*b.x;
	}
	public static boolean isParallel(P a1,P a2,P b1,P b2){
		return Math.abs(cross(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}
	public static boolean isVertical(P a1,P a2,P b1,P b2){
		return Math.abs(dot(a2.s(a1),b2.s(b1)))<Double.MIN_NORMAL;
	}

	public P a(P a){
		return new P(x+a.x,y+a.y);
	}
	public P s(P a){
		return new P(x-a.x,y-a.y);
	}

	public double norm(){
		return Math.sqrt(x*x+y*y);
	}
	public double arg(){
		double s=Math.acos(x/norm());
		return y>0?s:2*Math.PI-s;
	}

	public P rotate(double t){
		return new P(Math.cos(t)*this.x-Math.sin(t)*this.y,Math.sin(t)*this.x+Math.cos(t)*this.y);
	}

	public static int ccw(P a,P b,P c){
		if(P.cross(b.s(a),c.s(a))>Double.MIN_NORMAL){
			return 1;
		}
		if(P.cross(b.s(a),c.s(a))<-Double.MIN_NORMAL){
			return -1;
		}
		if(P.dot(b,c)<-Double.MIN_NORMAL)return 2;
		if(b.norm()<c.norm()-Double.MIN_NORMAL)return -2;
		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof P){
			P p=(P)obj;
			return x==p.x && y==p.y;
		}
		return false;
	}
	public String toString(){
		return "("+x+","+y+")";
	}
}