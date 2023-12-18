import java.util.*;
import java.util.regex.*;
import static java.lang.Math.*;
import static java.lang.System.out;

// AOJ
public class Main {
	final Scanner sc=new Scanner(System.in);
	final int[] vx={0,1,0,-1}, vy={-1,0,1,0};
	static class Point{
		int x, y;
		Point(int x, int y){	this.x=x;	this.y=y;}
		Point(){	this.x=0; this.y=0;}
		@Override public String toString(){	return "("+this.x+","+this.y+")";}
		static boolean ok(int x,int y,int X,int Y,int min){
			return (min<=x&&x<X && min<=y&&y<Y)?true:false;
		}
		static boolean ok(int x,int y,int X,int Y){	return ok(x,y,X,Y,0);}
	}
	public static void main(String[] args) {
		new Main().AOJ2013();
	}
	
	void AOJ2013(){
		while(sc.hasNext()){
			int n=sc.nextInt();
			if(n==0)	break;
			LinkedList<Integer> start=new LinkedList<Integer>();
			LinkedList<Integer> end=new LinkedList<Integer>();
			for(int i=0; i<n; i++){
				Scanner sc2=new Scanner(sc.next()).useDelimiter(":");
				start.add(sc2.nextInt()*3600+sc2.nextInt()*60+sc2.nextInt());
				sc2=new Scanner(sc.next()).useDelimiter(":");
				end.add(sc2.nextInt()*3600+sc2.nextInt()*60+sc2.nextInt());
			}
			Collections.sort(start);
			Collections.sort(end);
			int temp=0,ans=0;
			while(!start.isEmpty() || !end.isEmpty()){
				int s=(start.isEmpty()?Integer.MAX_VALUE:start.getFirst()), e=(end.isEmpty()?-1:end.getFirst());
				if(s<e){
					start.removeFirst();
					temp++;
				}else if(e<s){
					end.removeFirst();
					temp--;
				}else{
					start.removeFirst();
					end.removeFirst();
				}
				//out.println("S"+s+" E"+e+" TEMP"+temp+" ANS"+ans);
				ans=max(ans,temp);
			}
			out.println(ans);
		}
	}
	
	void AOJ2015c(){
		int ans=0;
		while(sc.hasNext()){
			int H=sc.nextInt(), W=sc.nextInt();
			if((W|H)==0)	break;
			for(int x=0; x<W; x++)	sc.nextInt();
			for(int y=0; y<H; y++)	sc.nextInt();
			ans++;
		}
		out.println(ans+"Cases");
	}
	void AOJ2015(){
		int C=0, Cases=56;
		while(sc.hasNext()){
			C++;
			int H=sc.nextInt(), W=sc.nextInt();
			if((H|W)==0)	break;
			Point[][] road=new Point[W+1][H+1];
			
			for(int x=0; x<=W; x++){
				for(int y=0; y<=H; y++){
					road[x][y]=new Point();
				}
			}
			
			for(int h=1; h<=H; h++){
				int temp=sc.nextInt();
				for(int x=0; x<=W; x++)	road[x][h].y=road[x][h-1].y+temp;
			}
			for(int w=1; w<=W; w++){
				int temp=sc.nextInt();
				for(int y=0; y<=H; y++)	road[w][y].x=road[w-1][y].x+temp;
			}
			
			// TODO debug
			//D2015(road,W,H);
			int ans=0;
			for(int i=0; i<=W; i++){
				for(int j=0; j<=H; j++){
					int k=1,l=1;
					while(i+k<=W && j+l<=H){
						int xx=(road[i+k][j+l].x-road[i][j].x), yy=(road[i+k][j+l].y-road[i][j].y);
						if(xx==yy){
							ans++;
							k++;	l++;
						}else if(xx>yy)	l++;
						else	k++;
					}
					/*
					for(int k=i+1; k<=W; k++){
						if(road[i][H].y-road[i][j].y<road[W][0].x-road[k][0].x)	break;
						for(int l=j+1; l<=H; l++){
							int xx=(road[k][l].x-road[i][j].x), yy=(road[k][l].y-road[i][j].y);
							if(xx==yy)	ans++;
							if(yy>xx)	break;
						}
					}
					*/
				}
			}
			out.println(ans);
			System.err.println(ans+" ("+C+"/"+Cases+")");
		}
	}
	void D2015(Point[][] road, int W, int H){
		for(int y=0; y<H+1; y++){
			for(int x=0; x<W+1; x++)	out.print(road[x][y]+" ");
			out.println();
		}
		out.println("----------------");
	}
	
	
	void AOJ2014(){
		while(sc.hasNext()){
			int W=sc.nextInt(), H=sc.nextInt();
			if((W|H)==0)	break;
			char[][] c=new char[W+2][H+2];
			for(int i=0; i<W+2; i++){
				c[i][0]='A';
				c[i][H+1]='A';
			}
			for(int i=0; i<H+2; i++){
				c[0][i]='A';
				c[W+1][i]='A';
			}
			for(int y=0; y<H; y++){
				String line=sc.next();
				for(int x=0; x<W; x++){
					c[x+1][y+1]=line.charAt(x);
				}
			}
			
			// TODO debug
			//D2014(c,W,H);
			
			boolean[][] b=new boolean[W+2][H+2];
			boolean[][] w=new boolean[W+2][H+2];
			
			// B
			for(int x=1; x<W+1; x++){
				for(int y=1; y<H+1; y++){
					if(c[x][y]!='B')	continue;
					LinkedList<Point> open=new LinkedList<Point>();
					boolean[][] close = new boolean[W+2][H+2];
					open.add(new Point(x,y));
					while(!open.isEmpty()){
						Point now=open.poll();
						close[now.x][now.y]=true;
						b[now.x][now.y]=(c[now.x][now.y]=='.'?true:false);
						for(int i=0; i<4; i++){
							int xx=now.x+vx[i], yy=now.y+vy[i];
							if(!(0<xx&&xx<W+2 && 0<yy&&yy<H+2))	continue;
							if(c[xx][yy]=='.' && !b[xx][yy] && !close[xx][yy]){
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			
			// W
			for(int x=1; x<W+1; x++){
				for(int y=1; y<H+1; y++){
					if(c[x][y]!='W')	continue;
					LinkedList<Point> open=new LinkedList<Point>();
					boolean[][] close = new boolean[W+2][H+2];
					open.add(new Point(x,y));
					while(!open.isEmpty()){
						Point now=open.poll();
						close[now.x][now.y]=true;
						w[now.x][now.y]=(c[now.x][now.y]=='.'?true:false);
						for(int i=0; i<4; i++){
							int xx=now.x+vx[i], yy=now.y+vy[i];
							if(!(0<xx&&xx<W+2 && 0<yy&&yy<H+2))	continue;
							if(c[xx][yy]=='.' && !w[xx][yy] && !close[xx][yy]){
								open.add(new Point(xx,yy));
								close[xx][yy]=true;
							}
						}
					}
				}
			}
			
			// TODO debug
			//D2014(b,W,H);
			//D2014(w,W,H);
			
			int ansB=0, ansW=0;
			for(int x=0; x<W+2; x++){
				for(int y=0; y<H+2; y++){
					if(b[x][y] && !w[x][y])	ansB++;
					if(!b[x][y] && w[x][y])	ansW++;
				}
			}
			out.println(ansB+" "+ansW);
		}
	}
	void D2014(boolean[][] c, int W, int H){
		out.println("\n\n");
		for(int y=0; y<H+2; y++){
			for(int x=0; x<W+2; x++){
				out.print(c[x][y]?"T":".");
			}
			out.println();
		}
	}
	void D2014(char[][] c, int W, int H){
		out.println("\n-------------");
		for(int y=0; y<H+2; y++){
			for(int x=0; x<W+2; x++){
				out.print(c[x][y]);
			}
			out.println();
		}
		out.println("\n-------------");
	}
	
	void AOJ2012(){
		while(sc.hasNext()){
			int e=sc.nextInt(), ans=Integer.MAX_VALUE;
			if(e==0)	break;
			for(int i=0; i*i*i<=e; i++){
				for(int j=0; j*j+i*i*i<=e; j++){
					int k=e-(i*i*i+j*j);
					if(i*i*i+j*j+k==e)	ans=min(ans,i+j+k);
				}
			}
			out.println(ans);
		}
	}
}