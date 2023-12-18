import java.util.*;

class Main{
	static int c=0;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Point p1 = new Point(0, 0);
		Point p2 = new Point(100, 0);
		print(p1);
		kock(n, p1, p2);
		print(p2);
	}
	static void kock(int n, Point p1, Point p2){
		if(n == 0) return;

		Point s = new Point(
			p1.x<p2.x?	p1.x+(p2.x-p1.x)/3:
						p1.x-(p1.x-p2.x)/3,

			p1.y<p2.y?	p1.y+(p2.y-p1.y)/3:
			p1.y>p2.y?	p1.y-(p1.y-p2.y)/3:
						p1.y);

		Point u = new Point(
			(p1.x<p2.x&&p1.y<p2.y)||(p1.x>p2.x&&p1.y>p2.y)?	p1.x:
			(p1.x<p2.x&&p1.y>p2.y)||(p1.x>p2.x&&p1.y<p2.y)?	p2.x:
			p1.x<p2.x&&p1.y==p2.y?							p1.x+(p2.x-p1.x)/2:
															p1.x-(p1.x-p2.x)/2,

			p1.x<p2.x&&p1.y<p2.y?	p1.y+(p2.y-p1.y)/3*2:
			p1.x>p2.x&&p1.y<p2.y?	p1.y+(p2.y-p1.y)/3:
			p1.x<p2.x&&p1.y>p2.y?	p1.y-(p1.y-p2.y)/3:
			p1.x>p2.x&&p1.y>p2.y?	p1.y-(p1.y-p2.y)/3*2:
			p1.x<p2.x&&p1.y==p2.y?	p1.y+(p2.x-p1.x)/6*Math.tan(Math.PI/3):
									p1.y-(p1.x-p2.x)/6*Math.tan(Math.PI/3));

		Point t = new Point(
			p1.x<p2.x?	p1.x+(p2.x-p1.x)/3*2:
						p1.x-(p1.x-p2.x)/3*2,

			p1.y<p2.y?	p1.y+(p2.y-p1.y)/3*2:
			p1.y>p2.y?	p1.y-(p1.y-p2.y)/3*2:
						p1.y);

		kock(n-1, p1, s);
		print(s);
		kock(n-1, s, u);
		print(u);
		kock(n-1, u, t);
		print(t);
		kock(n-1, t, p2);
	}
	static void print(Point d){
		System.out.println(d.x+" "+d.y);
	}
}
class Point{
	double x;
	double y;
	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}
}