import java.util.*;
import static java.lang.Math.*;
public class Main {
	final Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		final long STACK_SIZE=8*1024*1024;
		new Thread(null, new AOJ2137(), "RUN!", STACK_SIZE).start();
	}
	
	// Time Trial
	class AOJ2137 implements Runnable{
		AOJ2137(){}
		@Override public void run(){
			while(sc.hasNext()){
				W=sc.nextInt();
				H=sc.nextInt();
				if((W|H)==0)	break;
				solve();
			}
		}
		
		int W,H;
		final int[] vx={0,1,0,-1},vy={-1,0,1,0};
		int[] sq;
		int[][] map,mapToID;
		
		void solve(){
			map=new int[W][H];
			mapToID=new int[W][H];
			int sx=-1,sy=-1,stidx=0,stqidx=0,midx=1;
			int[] st=new int[3];
			sq=new int[3];
			
			for(int y=0; y<H; ++y){
				String line=sc.next();
				for(int x=0; x<W; ++x){
					char c=line.charAt(x);
					if(c=='#'){
						map[x][y]=-1;
						continue;
					}
					
					if(c=='_'){
						sq[stqidx]=midx;
						++stqidx;
						map[x][y]=1;
					}else if(c=='@'){
						sx=x;
						sy=y;
					}else if(c=='*'){
						st[stidx]=midx;
						++stidx;
					}
					
					mapToID[x][y]=midx;
					++midx;
				}
			}
			
			//System.out.println(Arrays.toString(st));
			//System.out.println(Arrays.toString(sq));
			
			
			State init=new State(sx,sy,0,st);
			init.verify();
			
			PriorityQueue<State> open=new PriorityQueue<Main.AOJ2137.State>();
			open.add(init);
			
			int[][][][] closed=new int[midx+1][midx+1][midx+1][midx+1];
			for(int i=0; i<=midx; ++i)for(int j=0; j<=midx; ++j)for(int k=0; k<=midx; ++k)for(int l=0; l<=midx; ++l)closed[i][j][k][l]=1<<29;
			closed[mapToID[sx][sy]][init.st[0]][init.st[1]][init.st[2]]=0;
			
			int ans=-1;
			while(!open.isEmpty()){
				State now=open.poll();
				if(now.rock>=3){
					ans=now.step;
					break;
				}
				
				for(int i=0; i<4; ++i){
					int xx=now.x+vx[i], yy=now.y+vy[i];
					
					if(!(0<=xx && xx<W && 0<=yy && yy<H))	continue;
					if(map[xx][yy] < 0)	continue;
					
					int ridx=now.isRock(xx, yy);
					State next=null;
					
					if(ridx<0){
						
						next=new State(xx,yy,now.step,now.rock,now.st);
						++next.step;
						
					}else{
						
						int xxx=xx+vx[i], yyy=yy+vy[i];
						if(!(0<=xxx && xxx<W && 0<=yyy && yyy<H))	continue;
						if(map[xxx][yyy] < 0)	continue;
						if(now.isRock(xxx, yyy) >= 0)	continue;
						
						next=new State(xx,yy,now.step,now.rock,now.st.clone());
						++next.step;
						next.st[ridx]=mapToID[xxx][yyy];
						if(map[xx][yy]>0)	--next.rock;
						if(map[xxx][yyy]>0)	++next.rock;
						
					}
					
					if(closed[mapToID[xx][yy]][next.st[0]][next.st[1]][next.st[2]] <= next.step)	continue;
					
					if(next.rock >= 3){
						ans=next.step;
						open.clear();
						break;
					}
					
					closed[mapToID[xx][yy]][next.st[0]][next.st[1]][next.st[2]] = next.step;
					open.add(next);
				}
			}
			
			System.out.println(ans);
			
		}
		
		class State implements Comparable<State>{
			int x,y,step,rock;
			int[] st;
			State(int x,int y,int step,int[] st){
				this.x=x;
				this.y=y;
				this.step=step;
				this.st=st;
			}
			State(int x,int y,int step,int rock,int[] st){
				this.x=x;
				this.y=y;
				this.step=step;
				this.rock=rock;
				this.st=st;
			}
			int verify(){
				int ret=0;
				for(int i=0; i<3; ++i){
					for(int j=0; j<3; ++j){
						if(st[i]==sq[j]){
							++ret;
						}
					}
				}
				this.rock=ret;
				return ret;
			}
			@Override public int compareTo(State s){
				return this.step!=s.step? this.step-s.step : s.rock-this.rock;
			}
			int isRock(int x,int y){
				for(int i=0; i<3; ++i)if(st[i]==mapToID[x][y])	return i;
				return -1;
			}
			@Override public String toString(){
				return "("+x+","+y+") step:"+step+" r:"+rock+" "+Arrays.toString(st);
			}
		}
		
		class Pair{
			int x,y;
			Pair(int x,int y){
				this.x=x;
				this.y=y;
			}
			@Override public String toString(){
				return "("+x+","+y+")";
			}
		}
	}
}