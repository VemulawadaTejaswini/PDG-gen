import java.io.*;

public class Main {
	public static Point third(Point a,Point b){
		Point d=new Point(b.x-a.x,b.y-a.y);
		double x=d.x*0.5-d.y*(Math.sqrt(3)*0.5);
		double y=d.y*0.5+d.x*(Math.sqrt(3)*0.5);
		Point c=new Point(a.x+x,a.y+y);
		return c;
	}
	public static void carve(Point start,Point end,int n){
		if (n==0){
			end.print();
		}else{
			Point p1=new Point((end.x/3+start.x/3*2),(end.y/3+start.y/3*2));
			Point p3=new Point((start.x/3+end.x/3*2),(start.y/3+end.y/3*2));
			Point p2=third(p1,p3);
			carve(start,p1,n-1);
			carve(p1,p2,n-1);
			carve(p2,p3,n-1);
			carve(p3,end,n-1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Point s=new Point(0.0,0.0);
		Point e=new Point (100,0);
		s.print();
		carve(s,e,n);
	}
}

class Point{
	double x,y;
	public Point(double px,double py){
		this.x=px;
		this.y=py;
	}
	public void print(){
		System.out.println(x+" "+y);
	}
}