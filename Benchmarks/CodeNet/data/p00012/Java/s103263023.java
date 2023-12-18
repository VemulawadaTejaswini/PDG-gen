import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);
    Line line;

    void run(){
	while(sc.hasNext()){
	    line = new Line();
	    solve();
	}
    }

    void solve(){
	boolean ans = true;
	double dis1, dis2;
      
	boolean a = line.crossX(1);
	boolean b = line.crossX(2);
	boolean c = line.crossX(3);

	ans = a && b && c;

	if(ans) System.out.println("YES");
	else System.out.println("NO");
    }

    class Point{
	double x;
	double y;
	Point(double x, double y){
	    this.x = x;
	    this.y = y;
	}
	double getX(){ return x; }
	double getY(){ return y; }
    }

    class Line{
	Point k1, k2, k3, p;
	Line(){
	    k1 = new Point(sc.nextDouble(), sc.nextDouble());
	    k2 = new Point(sc.nextDouble(), sc.nextDouble());
	    k3 = new Point(sc.nextDouble(), sc.nextDouble());
	    p = new Point(sc.nextDouble(), sc.nextDouble());
	}
	boolean cross(Point p1, Point p2, Point p3, Point p4){
	    double a = (p1.getX()-p2.getX()) * (p3.getY()-p1.getY());
	    double b = (p1.getY()-p2.getY()) * (p1.getX()-p3.getX());
	    double c = (p1.getX()-p2.getX()) * (p4.getY()-p1.getY());
	    double d = (p1.getY()-p2.getY()) * (p1.getX()-p4.getX());
	    double cr = (a+b)*(c+d);

	    //System.out.println(cr); 
	    if(cr<=0) return false;
	    else return true;
	}

	boolean crossX(int i){
	    if(i==1)
		return cross(k2, k3, p, k1);
	    if(i==2)
		return cross(k1, k3, p, k2);
	    if(i==3)
		return cross(k1, k2, p, k3);
	    return true;
	}
    }
}