import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	final int[] vvx={0,1,0,-1,-1,1,1,-1}, vvy={-1,0,1,0,-1,-1,1,1};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){	return (min<=x&&x<X)&&(min<=y&&y<Y);}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ1160();
	}
	
	void AOJ1160(){
		while(sc.hasNext()){
			int W=sc.nextInt(),H=sc.nextInt();
			if((W|H)==0)	break;
			boolean[][] b=new boolean[W][H];
			for(int y=0; y<H; y++){
				for(int x=0; x<W; x++)	b[x][y]=(sc.nextInt()==1);
			}
			boolean[][] close=new boolean[W][H];
			LinkedList<Point> open=new LinkedList<Point>();
			int ans=0;
			for(int x=0; x<W; x++){
				for(int y=0; y<H; y++){
					if(b[x][y]&&!close[x][y]){
						open.add(new Point(x,y));
						ans++;
						while(!open.isEmpty()){
							Point now=open.poll();
							for(int i=0; i<8; i++){
								int xx=now.x+vvx[i],yy=now.y+vvy[i];
								if(!Point.ok(xx, yy, W, H))	continue;
								if(!b[xx][yy])	continue;
								if(close[xx][yy])	continue;
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			out.println(ans);
		}
	}
	
	void A(){
		
	}
}