import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static int x,y,z;
	static int[][] board;
	static int[] v;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			x = sc.nextInt();
			y = sc.nextInt();
			z = sc.nextInt();
			if(x+y+z==0)break;
			ans=0.0;
			v=new int[x];
			for(int i=0;i<x;i++){
				v[i]=sc.nextInt();
			}
			 board=new int[y+1][2];
			for(int i=0;i<z;i++){
				int n = sc.nextInt();
				int e = sc.nextInt();
				int a = sc.nextInt();
				if(e==3)a*=-1;
				board[n][0]=e;
				board[n][1]=a;
				
			}
			double[][] dp=new double[y+1][10000];
			for(int i=0;i<y+1;i++){
				Arrays.fill(dp[i], 0);
			}
			dp[0][0]=1.0;
			for(int i=0;i<y;i++){
				int e = board[i][0];
				int a = board[i][1];
				for(int j=0;j<dp[i].length;j++){
					for(int k=0;k<x;k++){
						int next=i+v[k];
						if(next>=y)next=y;
						double p =dp[i][j]/(double)x; 
						if(e==0){
							dp[next][j]+=p;
						}
						else if(e==1){
							next+=a;
							if(next>=y)next=y;
							dp[next][j]+=p;
						}
						else{
							int m = j+a;
							if(m>=10000)m=9999;
							if(m<0)m=0;
							dp[next][m]+=p;
						}
						
					}
				}
			}
//			rec(0,0,1.0);
			for(int i=0;i<101;i++){
				ans += dp[dp.length-1][i] * i;
//				System.out.println(i+" "+dp[dp.length-1][i]);
			}

//			System.out.println(dp[1][0]+" "+1.0/x);
			System.out.println((int)(ans+0.000000001));
		}
			
	}
	static double ans = 0.0;

	public static void rec(int a,int b,double kakuritu){
		if(a>=y){
			ans+=(double)b*kakuritu;
			return;
		}
		for(int i=0;i<x;i++){
			int next=a+v[i];
			double p = 1.0/x;
			
			if(board[a][0]==0){
				rec(next,b,kakuritu*p);
			}
			else if(board[a][0]==1){
				rec(next+board[a][1],b,kakuritu*p);
			}
			else{
				rec(next,Math.max(0,b+board[a][1]),kakuritu*p);
			}
			
		}
		return;
		
	}
}