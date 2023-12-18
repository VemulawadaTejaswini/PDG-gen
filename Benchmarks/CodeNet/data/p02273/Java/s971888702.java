
import java.util.Scanner;

public class Main {

	static class Point{
		double x=0.0;
		double y=0.0;
		public Point(double x,double y){
			this.x=x;
			this.y=y;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		
		System.out.println("0.00000000 "+"0.00000000");
		koch(n,new Point(0.0,0.0),new Point(100.0, 0.0));
		System.out.println("100.00000000 "+"0.00000000");
	}
	private static void koch(int n, Point point1, Point point2) {
		// TODO Auto-generated method stub
		if(n==0)
			return;
		double degree=60;
		double dr=Math.toRadians(degree);
		Point s=new Point((2*point1.x+point2.x)/3,(2*point1.y+point2.y)/3 );
		Point t=new Point((point1.x+2*point2.x)/3,(point1.y+2*point2.y)/3 );
		Point u=new Point((t.x-s.x)*Math.cos(dr)-(t.y-s.y)*Math.sin(dr)+s.x,(t.x-s.x)*Math.sin(dr)+(t.y-s.y)*Math.cos(dr)+s.y);

		koch(n-1,point1 , s);
		System.out.format("%.8f %.8f\n", s.x,s.y);
		
		koch(n-1,s , u);
		System.out.format("%.8f %.8f\n", u.x,u.y);
		
		koch(n-1,u , t);
		System.out.format("%.8f %.8f\n", t.x,t.y);
		
		koch(n-1,t, point2);
	
	}

}

