import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ0594().doIt();
	}
	
	class AOJ0594{
		int w,h,n;
		int[] list;
		int[][] map;
		
		int bfs(int ax,int ay,int bx,int by){
			int result = 0;
			map = new int[h][w];
			for(int i=0;i<h;i++)Arrays.fill(map[i],Integer.MIN_VALUE);
			LinkedList<Integer> q = new LinkedList<Integer>();
			q.add(ax);q.add(ay);q.add(0);
			while(q.size()>0){
				int x = q.remove();
				int y = q.remove();
				int cost = q.remove();
				if(map[y][x]!=Integer.MIN_VALUE&&map[y][x]<=cost)continue;
				map[y][x] = cost;
				if(x==bx&&y==by){
					result = cost;break;
				}
				for(int i=-1;i<2;i++)for(int s=-1;s<2;s++)if(!(i==-1&&s==1))if(!(i==1&&s==-1)){
					int nx = x+i,ny = y+s;
					if(nx<0||nx>=w||ny<0||ny>=h)continue;
					q.add(nx);q.add(ny);q.add(cost+1);
				}
			}
			return result;
		}
		
		void doIt(){
			w = in.nextInt();h = in.nextInt();n = in.nextInt();
			list = new int[n];map = new int[h][w];
			int sx = in.nextInt()-1,sy = in.nextInt()-1;
			int result = 0;
			for(int i=1;i<n;i++){
				int ax = in.nextInt()-1;
				int ay = in.nextInt()-1;
				result += bfs(sx,sy,ax,ay);
				sx = ax; sy = ay;
			}
			System.out.println(result);
		}
	}
	
}