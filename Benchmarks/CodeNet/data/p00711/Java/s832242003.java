import java.util.Scanner;


public class Main {
	int w,h;
	int[][] field;
	int sx,sy;
	Scanner stdin=new Scanner(System.in);
	int[] dx={-1,0,1,0};
	int[] dy={0,-1,0,1};
	int count;
	
	
	
	public void Solve(){
		w=1;
		while(true){
			
			count=0;
			w=stdin.nextInt();
			h=stdin.nextInt();
			if(w==0&&h==0)break;
			field=new int [h][w];
			
			for(int i=0;i<h;i++){
				String str=stdin.next();
				for(int j=0;j<w;j++){
					char c=str.charAt(j);
					if(c=='.') field[i][j]=1;
					if(c=='#') field[i][j]=0;
					if(c=='@'){
						field[i][j]=1;
						sx=i;
						sy=j;
					}
				}
			}
			//System.out.println(sx+"s"+sy);
			dfs(sx,sy);
			System.out.println(count);
			
			
			
		}
		
		
		
		
	}
	public void dfs(int x,int y){
		count++;
		field[x][y]=0;
		for(int i=0;i<4;i++){
			int xx=x+dx[i];
			int yy=y+dy[i];
			
			
			if(xx>=0&&xx<h&&yy>=0&&yy<w){
				if(field[xx][yy]==1){
					//System.out.println(xx+ " "+yy);
					dfs(xx,yy);
				}
			}
		}
		
	}
	
	
	
	public static void main(String args[]){
		Main m=new Main();
		m.Solve();
	}
}