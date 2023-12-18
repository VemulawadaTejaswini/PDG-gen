import java.awt.geom.*;
import java.util.*;
import static java.lang.Math.*;
public class Main{
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1166();
	}
	
	class AOJ1166{
		AOJ1166(){
			while(sc.hasNext()){
				int w=sc.nextInt(),
					h=sc.nextInt();
				if((w|h)==0)	break;
				solve(w,h);
			}
		}
		final int INF=1<<29;
		int[] vx={0,1,0,-1},vy={-1,0,1,0};
		void solve(int w,int h){
			w*=2; h*=2;
			--w; --h;
			boolean[][] wall=new boolean[w][h];
			// input
			for(int y=0; y<h; ++y){
				if(y%2==0){
					for(int x=1; x<w; x+=2)	wall[x][y]=(sc.nextInt()==1);
				}else{
					for(int x=0; x<w; x+=2)	wall[x][y]=(sc.nextInt()==1);
					for(int x=1; x<w; x+=2)	wall[x][y]=true;
				}
			}
			
			LinkedList<Pair> open=new LinkedList<Pair>();
			open.add(new Pair(0,0,0));
			
			int[][] closed=new int[w][h];
			for(int i=0; i<w; ++i)for(int j=0; j<h; ++j)closed[i][j]=INF;
			
			int ans=0;
			while(!open.isEmpty()){
				Pair now=open.poll();
				if(now.x==w-1&&now.y==h-1){
					ans=now.s;
					break;
				}
				for(int i=0; i<4; ++i){
					int xx=now.x+vx[i],yy=now.y+vy[i];
					if(!(0<=xx&&xx<w && 0<=yy&&yy<h))	continue;
					if(wall[xx][yy])	continue;
					if(closed[xx][yy]<=now.s+1)	continue;
					open.add(new Pair(xx,yy,now.s+1));
					closed[xx][yy]=now.s+1;
				}
			}
			System.out.println(ans>0? ans/2+1: 0);
		}
		class Pair{
			int x,y,s;
			Pair(int x,int y,int s){
				this.x=x;
				this.y=y;
				this.s=s;
			}
		}
	}
}