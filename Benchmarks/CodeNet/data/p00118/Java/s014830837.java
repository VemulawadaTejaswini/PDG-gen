
import java.util.Scanner;

public class Main{
	private static final int MAX_N=105;
	private static int count=0;
	private static char[][] field=new char[MAX_N][MAX_N];
	private static int W;
	private static int H;
	private static int[] dx=new int[]{1,0,-1,0};
	private static int[] dy=new int[]{0,1,0,-1};
	static void dfs(int x,int y,char seed){
		field[x][y]='X';
		for(int i=0;i<4;i++){
			int nx=x+dx[i];
			int ny=y+dy[i];
			if(0<=nx&&nx<H&&0<=ny&&ny<W&&field[nx][ny]==seed) dfs(nx,ny,seed);
		}
		return;
	}
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		while(true){
			count=0;	
			H=scan.nextInt();
			W=scan.nextInt();
			if(W==0||H==0){scan.close();return;}
			scan.nextLine();
			for(int i=0;i<H;i++){
				String ss=scan.nextLine();
				for(int j=0;j<W;j++){
					field[i][j]=ss.charAt(j);
				}
			}
			for(int i=0;i<H;i++){
				for(int j=0;j<W;j++){
					if(field[i][j]!='X'){ dfs(i,j,field[i][j]); count++;}
				}
			}
			System.out.println(count);
		}
	}
}