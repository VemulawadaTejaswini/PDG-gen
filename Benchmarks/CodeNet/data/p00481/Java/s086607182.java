import java.util.ArrayDeque;
import java.util.Scanner;
public class Main{
	public static void main(String[] args)throws Exception{
		new Main().solve();
	}
	void solve(){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		char[][] table=new char[h][w];
		for(int i=0;i<h;i++){
			table[i]=sc.next().toCharArray();
		}
		int[][] to=find(table, n);
		int d=0;
		for(int i=0;i<n;i++){
			d+=bfs(to[i][0],to[i][1],to[i+1][0],to[i+1][1],table);
		}
		System.out.println(d);
		
	}
	int[] dx={1,-1,0,0};
	int[] dy={0,0,1,-1};
	int bfs(int sx,int sy,int gx,int gy,char[][] table){
		ArrayDeque<P> stack=new ArrayDeque<P>();
		stack.add(new P(sx,sy,0));
		boolean[][] arrived=new boolean[table.length][table[0].length];
		arrived[sy][sx]=true;
		while(!stack.isEmpty()){
			P p=stack.poll();
			if(p.x==gx&&p.y==gy)return p.count;
			for(int i=0;i<4;i++){
				int nx=p.x+dx[i];
				int ny=p.y+dy[i];
				if(nx<0||nx>table[0].length-1||
						ny<0||ny>table.length-1){
					continue;
				}
				if(arrived[ny][nx])continue;
				if(table[ny][nx]=='X')continue;
				stack.add(new P(nx,ny,p.count+1));
				arrived[ny][nx]=true;
			}
		}
		return -1;
	}
	class P{
		int x;
		int y;
		int count;
		P(int x,int y,int count){
			this.x=x;
			this.y=y;
			this.count=count;
		}
	}
	int[][] find(char[][] table,int n){
		int[][] re=new int[n+2][2];
		for(int i=0;i<table.length;i++){
			for(int j=0;j<table[0].length;j++){
				if(table[i][j]=='.'||table[i][j]=='X')continue;
				else if(table[i][j]=='S'){
					re[0][0]=j;re[0][1]=i;
				}else{
					re[Integer.parseInt(table[i][j]+"")][0]=j;re[Integer.parseInt(table[i][j]+"")][1]=i;
				}
			}
		}
		return re;
	}
	
}