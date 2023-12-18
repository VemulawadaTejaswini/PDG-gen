import java.util.*;
import static java.lang.Math.*;

public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1245();
	}
	
	class AOJ1245{
		final int OFFSET=200, MAX=OFFSET*2, INF=Integer.MAX_VALUE/4;
		final int[] vx={0,1,1,0,-1,-1,0},	vy2={1,0,-1,-1,-1,0,0},
											vy1={1,1,0,-1,0,1,0};
		AOJ1245(){
			int sx=sc.nextInt()+OFFSET, sy=sc.nextInt()+OFFSET,
				gx=sc.nextInt()+OFFSET, gy=sc.nextInt()+OFFSET,
				N=sc.nextInt();
			int[] x=new int[N],y=new int[N];
			for(int i=0; i<N; i++){
				x[i]=sc.nextInt()+OFFSET;
				y[i]=sc.nextInt()+OFFSET;
			}
			int LX=sc.nextInt(),LY=sc.nextInt();
			boolean[][] b=new boolean[MAX][MAX];
			for(int i=0; i<N; i++)	b[x[i]][y[i]]=true;
			
			PriorityQueue<State1> open=new PriorityQueue<State1>();
			open.add(new State1(sx,sy,0,0));
			int[][][] close=new int[MAX][MAX][6];
			for(int i=0; i<MAX; i++)for(int j=0; j<MAX; j++)for(int k=0; k<6; k++)close[i][j][k]=INF;
			close[sx][sy][0]=0;
			
			int ans=INF;
			while(!open.isEmpty()){
				State1 now=open.poll();
				//System.out.println(now);
				if(now.x==gx && now.y==gy){
					ans=now.cost;
					break;
				}
				int d=(abs(now.x-OFFSET)*abs(now.y-OFFSET)*now.step)%6;
				for(int i=0; i<7; i++){
					int xx=now.x+vx[i], yy=now.y+(now.x%2==0? vy2[i]: vy1[i]);
					if(abs(xx-OFFSET)>LX || abs(yy-OFFSET)>LY)	continue;
					if(b[xx][yy])	continue;
					int next=now.cost+(d==i? 0: 1);
					if(close[xx][yy][(now.step+1)%6]<=next)	continue;
					open.add(new State1(xx,yy,(now.step+1)%6,next));
					close[xx][yy][(now.step+1)%6]=next;
				}
			}
			System.out.println(ans>=INF? -1: ans);
		}
		class State1 implements Comparable<State1>{
			int x,y,step,cost;
			State1(int x,int y,int step,int cost){
				this.x=x;	this.y=y;	this.step=step;	this.cost=cost;
			}
			@Override public int compareTo(State1 o){
				return (this.cost!=o.cost? this.cost-o.cost: this.step-o.step);
			}
			@Override public String toString(){
				return x+","+y+" "+cost+" "+step+"steps";
			}
		}
	}
}