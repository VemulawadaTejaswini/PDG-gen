import java.lang.annotation.Retention;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0203();
	}
	//一番最後の行に2が来ている時のケースを考える。

	class AOJ0203{
		int x,y;
		int[][] map;
		HashMap<String,Integer> memo;
		int dfs(int sx,int sy,int before_x){
			//			System.out.println(sx+" "+sy+" "+before_x);
			if(memo.containsKey(sx+" "+sy+" "+before_x))return memo.get(sx+" "+sy+" "+before_x);
			int result = 0;
			if(sy>=y-1){
				if(sy==y-1){
					if(map[sy][sx]==1){
						memo.put(sx+" "+sy+" "+before_x,0);
						return 0;
					}else if(map[sy][sx]==2&&before_x!=sx)return 0;
				}
				memo.put(sx+" "+sy+" "+before_x,1);
				return 1;
			}
			if(map[sy][sx]==1){
				memo.put(sx+" "+sy+" "+before_x, 0);
				return 0;
			}
			else if(map[sy][sx]==2){
				if(before_x!=sx){
					memo.put(sx+" "+sy+" "+before_x,0);
					return 0;
				}else{
					memo.put(sx+" "+sy+" "+before_x,dfs(sx,sy+2,sx));
					return memo.get(sx+" "+sy+" "+before_x);
				}
			}else if(map[sy][sx]==0){
				for(int i=-1;i<=1;i++){
					int nx=i+sx, ny=sy+1;
					if(nx<0||nx>=x||ny<0)continue;
					result+=dfs(nx, ny,sx);
				}
			}
			memo.put(sx+" "+sy+" "+before_x,result);
			return result;
		}


		public AOJ0203() {
			while(true){
				memo = new HashMap<String, Integer>();
				x = in.nextInt();
				y = in.nextInt();
				if(x==0&&y==0)break;
				map = new int[y+1][x];
				for(int i=0;i<y;i++)for(int s=0;s<x;s++)map[i][s] = in.nextInt();
				int result = 0;
				for(int i=0;i<x;i++)result += dfs(i,0,-1);
				System.out.println(result);
			}
		}
	}
}