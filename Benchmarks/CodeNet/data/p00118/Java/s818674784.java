import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0118().doIt();
	}
	
	class AOJ0118{
		int w,h;
		char[][] map;
		boolean sw[][];
		int sx[],sy[];
		void dfs(int x,int y,char f){
			LinkedList<Integer> q = new LinkedList<Integer>();
			q.add(x);q.add(y);
			while(q.size()>0){
				int ax = q.remove();
				int ay = q.remove();
				sw[ay][ax]=true;
				for(int i=0;i<4;i++){
					int nx = ax+sx[i];
					int ny = ay+sy[i];
					if(nx<0||nx>=w||ny<0||ny>=h)continue;
					if(sw[ny][nx]||map[ny][nx]!=f)continue;
					q.add(nx);q.add(ny);
				}
			}
		}
		
		int solve(){
			int result = 0;
			for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(!sw[i][s]){
//				System.out.println(s+" "+i);
				result++;
				dfs(s,i,map[i][s]);
//				print();
			}
			return result;
		}
		
		void doIt(){
			sx = new int[4];
			sy = new int[4];
			sx[0]=1;sx[1]=0;sx[2]=-1;sx[3]=0;
			sy[0]=0;sy[1]=1;sy[2]=0;sy[3]=-1;
			while(true){
				h = in.nextInt();
				w = in.nextInt();
				if(h==0&&w==0)break;
				map = new char[h][w];
				sw = new boolean[h][w];
				for(int i=0;i<h;i++)map[i] = in.next().toCharArray();
				System.out.println(solve());
			}
		}
	}
	
}