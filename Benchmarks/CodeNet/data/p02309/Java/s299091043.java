import java.util.*;
//円と円の交点
public class Main{
	public static void cross_cl(Circle c, Line l){
		if(l.x1 == l.x2){
			double ans1 = (double)c.y - Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.x1-c.x),2));
			double ans2 = (double)c.y + Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.x1-c.x),2));
			System.out.printf("%.8f %.8f %.8f %.8f\n",l.x1,ans1,l.x1,ans2);
		}
		else if(l.y1 == l.y2){
			double ans1 = (double)c.x - Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.y1-c.y),2));
			double ans2 = (double)c.x + Math.sqrt(Math.pow((double)c.r,2)-Math.pow((double)(l.y1-c.y),2));
			System.out.printf("%.8f %.8f %.8f %.8f\n",ans1,l.y1,ans2,l.y1);
		}
		else{
			double a = (l.y2 - l.y1) / (l.x2 - l.x1);
			double ans1 = 1.0 + Math.pow(a,2);
			double ans2 = (double)c.x + a * a * l.x1 + a * c.y - a * l.y1;
			double ans3 = (double)(c.x * c.x) + Math.pow(a* l.x1 + (double)(c.y - l.y1),2) - (double)(c.r * c.r);
			double ansx1 = (ans2 - Math.sqrt(Math.pow(ans2,2)- ans1 * ans3))/ans1;
			double ansx2 = (ans2 + Math.sqrt(Math.pow(ans2,2)- ans1 * ans3))/ans1;
			double ansy1 = (ansx1 - l.x1) * a + l.y1;
			double ansy2 = (ansx2 - l.x1) * a + l.y1;
			System.out.printf("%.8f %.8f %.8f %.8f\n",ansx1,ansy1,ansx2,ansy2);
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Circle c1 = new Circle(sc.nextLong(),sc.nextLong(),sc.nextLong());
		Circle c2 = new Circle(sc.nextLong(),sc.nextLong(),sc.nextLong());
		Line l = new Line(0.0,0.0,0.0,0.0);
		if(c1.x == c2.x){
			l.x1 = 0.0;
			l.x2 = 1.0;
			l.y1 = l.y2 = (c1.y + c2.y)/2.0 - (c1.r*c1.r - c2.r*c2.r)/(2.0*(c1.y - c2.y));
		}
		else if(c1.y == c2.y){
			l.y1 = 0.0;
			l.y2 = 1.0;
			l.x1 = l.x2 = (c1.x + c2.x)/2.0 - (c1.r*c1.r - c2.r*c2.r)/(2.0*(c1.x - c2.x));
		}
		else{
			l.x1 = 0.0;
			l.y1 = (c1.x*c1.x - c2.x*c2.x + c1.y*c1.y - c2.y*c2.y + c2.r*c2.r - c1.r*c1.r) / (2.0 * (c1.y - c2.y));
			l.x2 = (c1.x*c1.x - c2.x*c2.x + c1.y*c1.y - c2.y*c2.y + c2.r*c2.r - c1.r*c1.r) / (2.0 * (c1.x - c2.x));
			l.y2 = 0.0;
		    if(l.x1 == l.y1 && l.x2 == l.y2){
		        l.x1 = 1.0;
		        l.y1 = (c1.x*c1.x - c2.x*c2.x + c1.y*c1.y - c2.y*c2.y + c2.r*c2.r - c1.r*c1.r) / (2.0 * (c1.y - c2.y)) - (double)(c1.x-c2.x)/(c1.y-c2.y);
		    }
		}
		cross_cl(c1,l);
	}
}
class Circle{
	long x;
	long y;
	long r;
	Circle(long x, long y, long r){
		this.x = x;
		this.y = y;
		this.r = r;
	}
}
class Line{
	double x1;
	double y1;
	double x2;
	double y2;
	Line(double x1, double y1, double x2, double y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
}
