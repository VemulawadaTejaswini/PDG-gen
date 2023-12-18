import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			P p1=new P(sc.nextDouble(),sc.nextDouble());
			P p2=new P(sc.nextDouble(),sc.nextDouble());
			P p3=new P(sc.nextDouble(),sc.nextDouble());
			P p4=new P(sc.nextDouble(),sc.nextDouble());

			ln(P.isVertical(p1, p2, p3, p4)?"YES":"NO");
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
class P{
	double x;
	double y;
	P(double _x,double _y){
		x=_x;
		y=_y;
	}

	public static double dot(P a,P b){
			return a.x*b.x+a.y*b.y;
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
}