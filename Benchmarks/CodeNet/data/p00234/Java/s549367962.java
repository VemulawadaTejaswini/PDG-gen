import java.util.Scanner;

//Aizu Buried Treasure
public class Main{

	int w, h, f, m, o;
	int[][] a;
	int[][][][] dp;
	
	
	int get(int i, int j, int s, int rest){
		if(i==h)return 0;
		if(dp[i][j][s][rest]!=-1)return dp[i][j][s][rest];
		if(rest<1)return dp[i][j][s][rest] = 1<<30;
		int x = 0;
		int nr = rest;
		int ns = s;
		if((s&(1<<j))!=0){
			ns -= 1<<j;
			if(a[i][j]<0)x = -a[i][j];
			else nr = Math.min(m, nr+a[i][j]);
		}
		int min = 1<<30;
		min = Math.min(min, x+get(i+1,j,(1<<w)-1,nr-1));
		if(j>0)min = Math.min(min, x+get(i,j-1,ns,nr-1));
		if(j<w-1)min = Math.min(min, x+get(i,j+1,ns,nr-1));
		return dp[i][j][s][rest] = min;
	}
	
	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h)==0)break;
			f = sc.nextInt();
			m = sc.nextInt();
			o = sc.nextInt();
			a = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)a[i][j]=sc.nextInt();
			dp = new int[h][w][1<<w][m+1];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)for(int k=0;k<1<<w;k++)for(int l=0;l<=m;l++)dp[i][j][k][l]=-1;
			int min = 1<<30;
			for(int j=0;j<w;j++)min = Math.min(min, get(0,j,(1<<w)-1,o-1));
			System.out.println(min==1<<30||f<min?"NA":min);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}