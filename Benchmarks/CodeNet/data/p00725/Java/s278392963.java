import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ1144().doIt();
	}
	
	class AOJ1144{
		int w,h;
		int[][] map;
		int[] sx = {0,1,0,-1};
		int[] sy = {-1,0,1,0};
		Point2D nextPoint(int x,int y,int muki){
			Point2D result = new Point2D.Double(-1,-1);
			int ax = x+sx[muki],ay = y+sy[muki];
			if(ax<0||ax>=w||ay<0||ay>=h)return result;
			if(map[ay][ax]==1)return result;
			for(;x>=0&&x<w&&y>=0&&y<h;){
				if(map[y][x]==3||map[y][x]==1){
					result = new Point2D.Double(x, y);break;
				}
				x+=sx[muki];y+=sy[muki];
			}
			return result;
		}
		
		int dfs(int x,int y,int cost){
//			System.out.println(x+" "+y+" "+cost);
			int result = Integer.MAX_VALUE;
			if(cost>10)return Integer.MAX_VALUE;
			if(map[y][x]==3)return cost;
			for(int i=0;i<4;i++){
				Point2D np = nextPoint(x, y, i);
//				System.out.println(nx+" "+ny);
//				System.out.println(np);
				if(np.getX()<0&&np.getY()<0)continue;
				int nx = (int)np.getX(),ny = (int)np.getY();
				if(map[ny][nx]==1){
					map[ny][nx] = 0;
					result = Math.min(result, dfs(nx-sx[i], ny-sy[i], cost+1));
					map[ny][nx] = 1;
				}else{
					result = Math.min(result, dfs(nx, ny, cost+1));
				}
			}
			return result;
		}
		
		void solve(){
			Point2D start = new Point2D.Double();
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(map[i][s]==2){
				start = new Point2D.Double(s,i);break;
			}
			int result = dfs((int)start.getX(), (int)start.getY(), 0);
			System.out.println(result==Integer.MAX_VALUE? "-1":result);
		}
		
		void doIt(){
			while(in.hasNext()){
				w = in.nextInt();
				h = in.nextInt();
				if(w+h==0)break;
				map = new int[h][w];
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)map[i][s] = in.nextInt();
				solve();
			}
		}
	}
	
}