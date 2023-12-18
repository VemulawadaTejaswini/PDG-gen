import java.util.*;
import java.io.*;

public class Main{
	class data{
		int x;
		int y;
		int c;

		data(int x,int y,int c){
			this.x=x;
			this.y=y;
			this.c=c;
		}
	}
	public int bfs(int w,int h,int[][] w_x,int[][] w_y){
		int[] sx={0,1,0,-1};
		int[] sy={1,0,-1,0};
		int res=0;
		int[][] fie;
		fie=new int[w+1][h+1];
		for(int i=0;i<w+1;i++)for(int j=0;j<h+1;j++)fie[i][j]=w*h;
		Queue<data> q=new LinkedList<data>();
		q.add(new data(0,0,0));
		fie[0][0]=0;
		while(!q.isEmpty()){
			data d=q.poll();
			for(int i=0;i<4;i++){
				int nx=d.x+sx[i];
				int ny=d.y+sy[i];
				if(nx==w-1 && ny==h)return d.c+1;
				if(nx>=0 && nx<w && ny>=0 && ny<h){
					if(fie[nx][ny]!=w*h)continue;
					if(i==0 && w_y[d.x][d.y]==1)continue;
					if(i==1 && w_x[d.x][d.y]==1)continue;
					if(i==2 && w_y[d.x][d.y-1]==1)continue;
					if(i==3 && w_x[d.x-1][d.y]==1)continue;
					fie[nx][ny]=d.c+1;
					q.add(new data(nx,ny,d.c+1));
				}
			}
		}
		return 0;
	}
	public void run(){
		Scanner sc=new Scanner(System.in);
		while(1>0){
			int w=sc.nextInt();
			int h=sc.nextInt();
			if(w+h==0)break;
			int[][] w_x,w_y;
			w_x=new int[w][h];
			w_y=new int[w][h];
			for(int i=0;i<h-1;i++){
				for(int j=0;j<w-1;j++)w_x[j][i]=sc.nextInt();
				for(int j=0;j<w;j++)w_y[j][i]=sc.nextInt();
			}
		for(int j=0;j<w-1;j++)w_x[j][h-1]=sc.nextInt();
			System.out.printf("%d\n",bfs(w,h,w_x,w_y));
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}