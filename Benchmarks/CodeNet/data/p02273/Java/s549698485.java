import java.util.*;

class Main
{
    //Point class
    static class Point
    {
	public double x;
	public double y;

	public Point(double x, double y)
	{
	    this.x=x;
	    this.y=y;
	}

	public Point(Point p)
	{
	    x=p.x;
	    y=p.y;
	}

	public void printPoint()
	{
	    System.out.printf("%.8f %.8f\n", x, y);
	}
    }



    //main
    public static void main(String[] args)
    {
	Scanner read = new Scanner(System.in);
	int n;
	Point zero = new Point(0, 0);
	Point hyaku = new Point(100, 0);
	int i, j, k;

	//read n
	n=read.nextInt();
	read.close();

	//do methods
	zero.printPoint();
	divisionPoint(zero, hyaku, n);
	hyaku.printPoint();
    }

    //methods
    static void divisionPoint(Point p1, Point p2, int n)
    {
	double x = p2.x-p1.x;
	double y = p2.y-p1.y;

	Point s = new Point((x/3)+p1.x, (y/3)+p1.y);
	Point t = new Point(2*(x/3)+p1.x, 2*(y/3)+p1.y);
	Point u = new Point(getKoch(s, t));

	//p1.printPoint();
	if(n>0)
	   {
	       divisionPoint(p1, s, n-1);
	       s.printPoint();

	       divisionPoint(s, u, n-1);
	       u.printPoint();

	       divisionPoint(u, t, n-1);
	       t.printPoint();

	       divisionPoint(t, p2, n-1);       
	   }
    }
    
    static Point getKoch(Point s, Point t)
    {
	double x = t.x - s.x;
	double y = t.y - s.y;

	double moveX = (Math.cos(Math.PI/3)*x - Math.sin(Math.PI/3)*y)+s.x;
	double moveY = (Math.sin(Math.PI/3)*x + Math.cos(Math.PI/3)*y)+s.y;

	Point u = new Point(moveX, moveY);
	return u;
    }
    
}