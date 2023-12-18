import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		while(true){
			int h=sc.nextInt();
			int w=sc.nextInt();
			if(h==0&&w==0)break;
			char[][] table=new char[h][w];
			checked=new boolean[h][w];
			for(int i=0;i<h;i++){
				table[i]=sc.next().toCharArray();
				//#,*,@
			}
			int count=0;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(!checked[i][j]){
						dfs(table,j,i,w,h);
						count++;
					}
				}
			}
			System.out.println(count);
		}
	}
	int[] dx={1,-1,0,0};
	int[] dy={0,0,-1,1};
	boolean[][] checked;
	void dfs(char[][] table,int x,int y,int w,int h){
		for(int i=0;i<4;i++){
			int nextx=x+dx[i];
			int nexty=y+dy[i];
			if(nextx<0||nextx>w-1||nexty<0||nexty>h-1)continue;
			if(table[y][x]==table[nexty][nextx]&&!checked[nexty][nextx]){
				checked[nexty][nextx]=true;
				dfs(table,nextx,nexty,w,h);
			}
		}
	}
}