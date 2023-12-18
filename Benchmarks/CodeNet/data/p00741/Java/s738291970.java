import java.util.*;
public class Main {
	Scanner stdin=new Scanner(System.in);
	int w,h;
	int[][] field;
	int[] dx={-1,-1,-1,0,0,1,1,1};
	int[] dy={-1,0,1,1,-1,-1,0,1};
	
	int count;
	
	
	
	
	public void Solve(){
		h=1;
		while(true){
			if(h==0) break;
			
			
			count=0;
			w=stdin.nextInt();
			h=stdin.nextInt();
			field=new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					field[i][j]=stdin.nextInt();
				}
			}
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(field[i][j]==1){
						dfs(i,j);
						count++;
					}
					
				}
			}
			System.out.println(count);
		}
		
		
		
	}
	
	public void dfs(int x,int y){
		//System.out.println(x+","+y);
		field[x][y]=0;
		for(int i=0;i<8;i++){
			int xx=x+dx[i];
			int yy=y+dy[i];
			if(xx>=0&&xx<h&&yy>=0&&yy<w){
				if(field[xx][yy]==1) dfs(xx,yy);
			}
		}
	}
	
	
	public static void main(String args[]){
		Main m =new Main();
		m.Solve();
		
	}
}