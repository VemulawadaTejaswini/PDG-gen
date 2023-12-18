import java.util.*;
public class Main {
	int[][] land,looked;
	int sx,sy,w,h,count;
	int[] dx={-1,1,0,0},dy={0,0,-1,1};
	
	Scanner stdin =new Scanner(System.in);
	Queue qx=new LinkedList();Queue qy=new LinkedList();
	
	
	void Solve(){
		
		while(true){
			w=stdin.nextInt();
			h=stdin.nextInt();
			if(w==0&&h==0) break;
			land=new int[h][w];
			looked=new int[h][w];
			count=1;
			
			for(int i=0;i<h;i++){
				String s=stdin.next();
				for(int j=0;j<w;j++){
					if(s.charAt(j)=='.') land[i][j]=1;
					else if(s.charAt(j)=='@'){
						land[i][j]=0;
						sx=i;
						sy=j;
					}else land[i][j]=0;
				}
			}
			looked=land.clone();
			//System.out.println(land[5][8]);
			bfs(sx,sy);
			System.out.println(count);
			
			
		}
		
		
		
		
		
	}
	
	void bfs(int sx,int sy){
		//System.out.println(sx+" "+sy);
		looked[sx][sy]=0;
		for(int i=0;i<4;i++){
			int xx=sx+dx[i];
			int yy=sy+dy[i];
			if(0<=xx&&xx<h&&0<=yy&&yy<w){
				if(land[xx][yy]==1){
					if(looked[xx][yy]==1)count++;
					bfs(xx,yy);
				}
			}
		}
	}
	
	public static void main(String args[]){
		Main m=new Main();
		m.Solve();
	}
}