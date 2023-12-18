import java.util.Scanner;
class Main{
    
    static class Point{
	double x,y;
	public Point(double x,double y){
	    this.x = x;
	    this.y = y;
	}
    }
	
    public static void main(String[] args){
	try(Scanner sc = new Scanner(System.in)){
	int n = sc.nextInt();
	System.out.println("0.00000000"+" "+"0.00000000");
	koch(n,new Point(0.0,0.0),new Point(100.0,0.0));
	System.out.println("100.00000000"+" "+"0.00000000");
	}
    }
    
    public static void koch(int n,Point p1,Point p2){
	if(n == 0) return;
	Point s = new Point(0.0,0.0);
	Point t = new Point(0.0,0.0);
	Point u = new Point(0.0,0.0);
	
	s.x = (2.0*p1.x+p2.x)/3.0;
	s.y = (2.0*p1.y+p2.y)/3.0;
	t.x = (p1.x+2.0*p2.x)/3.0;
	t.y = (p1.y+2.0*p2.y)/3.0;
	u.x = (t.x - s.x) / 2.0 - (t.y - s.y) * Math.sqrt(3.0)/2.0 +s.x;;
	u.y = (t.x - s.x) * Math.sqrt(3.0)/2.0 + (t.y - s.y)/2.0 +s.y;
	
	koch(n-1, p1, s);
	System.out.printf("%.8f %.8f\n",s.x,s.y);
	koch(n-1, s, u);
	System.out.printf("%.8f %.8f\n",u.x,u.y);
	koch(n-1, u, t);
	System.out.printf("%.8f %.8f\n",t.x,t.y);
	koch(n-1, t, p2);
    }
}


