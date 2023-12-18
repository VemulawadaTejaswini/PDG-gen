import java.util.*;


class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			P p1=new P(sc.nextDouble(),sc.nextDouble());
			P p2=new P(sc.nextDouble(),sc.nextDouble());
			P p3=new P(sc.nextDouble(),sc.nextDouble());
			P p4=new P(sc.nextDouble(),sc.nextDouble());

			P p5=new P(Math.max(p1.x,p3.x),Math.max(p1.y,p3.y));
			P p6=new P(Math.min(p2.x,p4.x),Math.min(p2.y,p4.y));

			ln((p5.x<=p6.x && p5.y<=p6.y)?"YES":"NO");
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
}