import java.awt.geom.Point2D;
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0515().doIt();
	}
	
	class AOJ0515{
		void doIt(){
			while(true){
				int w = in.nextInt();
				int h = in.nextInt();
				if(w+h==0)break;
				int n = in.nextInt();
				boolean[][] kouji = new boolean[h][w];
				for(int i=0;i<h;i++)Arrays.fill(kouji[i],true);
 				for(int i=0;i<n;i++){
 					int x = in.nextInt()-1;
 					int y = in.nextInt()-1;
 					kouji[y][x] = false;
 				}
				int[][] dp = new int[h][w];
				dp[0][0]=1;				
				for(int i=0;i<h;i++)for(int s=0;s<w;s++)if(kouji[i][s]){
						for(int t=0;t<2;t++)for(int r=0;r<2;r++)if(t!=r){
							int nx = s+t;
							int ny = i+r;
							if(nx<0||nx>=w||ny<0||ny>=h)continue;
							dp[ny][nx]+=dp[i][s];
						}
				}
				System.out.println(dp[h-1][w-1]);
			}
		}
	}
}