import java.awt.Point;
import java.util.Scanner;

public class Main{
	static Scanner s=new Scanner(System.in);
	
	//ldru
	static int[] dx={-1,0,1,0},dy={0,-1,0,1};
	public static void main(String[] __){
		while(true){
			int n=s.nextInt();
			if(n==0) return;
			
			Point[] ps=new Point[n];
			ps[0]=new Point(0,0);
			int u=0,d=0,l=0,r=0;
			for(int i=1;i<n;i++){
				ps[i]=(Point)ps[s.nextInt()].clone();
				int dir=s.nextInt();
				ps[i].translate(dx[dir],dy[dir]);
				
				u=Math.max(u,ps[i].y);
				d=Math.min(d,ps[i].y);
				r=Math.max(r,ps[i].x);
				l=Math.min(l,ps[i].x);
			}
			
			System.out.printf("%d %d\n",r-l+1,u-d+1);
		}
	}
}