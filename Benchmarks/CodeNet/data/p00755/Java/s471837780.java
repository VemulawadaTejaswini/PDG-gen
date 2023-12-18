import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	static int h,w,c,max;
	static int[][] panel;
	static int[] v1={0,1,0,-1};
	static int[] v2={1,0,-1,0};
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			h=cin.nextInt();
			w=cin.nextInt();
			c=cin.nextInt();
			max=-1;
			if(h+w+c==0)break;
			panel=new int[h][w];
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					panel[i][j]=cin.nextInt();
				}
			}
			bt(0);
			System.out.println(max);
		}
	}
	static void bt(int depth){
		if(depth==5){
			int ans=0;
			if(panel[0][0]==c){
				for(int i=0;i<h;i++){
					for(int j=0;j<w;j++){
//						System.out.print(panel[i][j]+" ");
					}
//					System.out.println();
				}
				Queue<int[]> q=new LinkedList<int[]>();
				q.add(new int[]{0,0});
				while(!q.isEmpty()){
					
					int[] aaa=q.poll();
					int x=aaa[0];
					int y=aaa[1];
					if(panel[x][y]==-1)continue;
					panel[x][y]=-1;
					ans++;
					for(int j=0;j<4;j++){
						int xx=x+v1[j];
						int yy=y+v2[j];
						if(xx<0||yy<0||xx>=h||yy>=w)continue;
						if(panel[xx][yy]!=c)continue;
						q.add(new int[]{xx,yy});
					}
				}
//				System.out.println(ans);	
				max=Math.max(ans,max);
			
			}
			return;
		}
		for(int i=1;i<=6;i++){
			if(panel[0][0]==i)continue;
			int[][] cp = new int[h][w];
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					cp[k][j]=panel[k][j];
				}
			}
			int color=panel[0][0];
			Queue<int[]> q=new LinkedList<int[]>();
			q.add(new int[]{0,0});
			while(!q.isEmpty()){
				int[] aaa=q.poll();
				int x=aaa[0];
				int y=aaa[1];
				panel[x][y]=i;
				for(int j=0;j<4;j++){
					int xx=x+v1[j];
					int yy=y+v2[j];
					if(xx<0||yy<0||xx>=h||yy>=w)continue;
					if(panel[xx][yy]!=color)continue;
					q.add(new int[]{xx,yy});
				}
			}
			bt(depth+1);
			for(int k=0;k<h;k++){
				for(int j=0;j<w;j++){
					panel[k][j]=cp[k][j];
				}
			}
			
		}
	}
}