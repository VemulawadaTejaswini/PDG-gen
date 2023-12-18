import java.util.*;
import java.awt.geom.*;

import static java.lang.Math.*;
public class Main {
	final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main().init();
	}
	void init(){
		new AOJ1174();
	}
	class AOJ1174{
		AOJ1174(){
			while(sc.hasNext()){
				H=sc.nextInt();
				W=sc.nextInt();
				C=sc.nextInt();
				if((H|(W|C))==0)	break;
				solve();
			}
		}
		int H,W,C;
		int[][][] b;
		final int[] vx={0,-1,0,1},vy={-1,0,1,0};
		void solve(){
			b=new int[6][W][H];
			for(int h=0; h<H; ++h)for(int w=0; w<W; ++w)	b[0][w][h]=sc.nextInt();
			System.out.println(dfs(b,0,b[0][0][0]));
		}
		int dfs(int[][][] b,int depth,int last){
			if(depth>=4)	return cnt(change(depth, C));
			int ret=0;
			for(int c=1; c<=6; ++c){
				if(c==last)	continue;
				change(depth, c);
				ret=max(ret, dfs(b, depth+1, c));
			}
			return ret;
		}
		int[][] change(int d,int target){
			for(int w=0; w<W; ++w)for(int h=0; h<H; ++h)	b[d+1][w][h]=b[d][w][h];
			LinkedList<Pair> open=new LinkedList<Pair>();
			open.add(new Pair(0,0));
			b[d+1][0][0]=target;
			while(!open.isEmpty()){
				Pair now=open.poll();
				for(int v=0; v<4; ++v){
					int xx=now.x+vx[v], yy=now.y+vy[v];
					if(!(0<=xx&&xx<W && 0<=yy&&yy<H))	continue;
					if(b[d][xx][yy]!=b[d][0][0])	continue;
					if(b[d+1][xx][yy]==target)	continue;
					b[d+1][xx][yy]=target;
					open.add(new Pair(xx,yy));
				}
			}
			return b[d+1];
		}
		int cnt(int[][] a){
			LinkedList<Pair> open=new LinkedList<Pair>();
			open.add(new Pair(0,0));
			boolean[][] closed=new boolean[W][H];
			closed[0][0]=true;
			int cnt=1;
			while(!open.isEmpty()){
				Pair now=open.poll();
				for(int v=0; v<4; ++v){
					int xx=now.x+vx[v], yy=now.y+vy[v];
					if(!(0<=xx&&xx<W && 0<=yy&&yy<H))   continue;
					if(a[xx][yy]!=a[0][0])  continue;
					if(closed[xx][yy])  continue;
					open.add(new Pair(xx,yy));
					closed[xx][yy]=true;
					++cnt;
				}
			}
			return cnt;
		}
		class Pair{
			int x,y;
			Pair(int x,int y){
				this.x=x;
				this.y=y;
			}
		}
	}
}