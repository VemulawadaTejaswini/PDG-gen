import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
	Scanner sc=new Scanner(System.in);

	int n,turn;
	int[] board;

	void run(){
		for(;;){
			n=sc.nextInt();
			turn=sc.nextInt();
			int lose=sc.nextInt();
			int back=sc.nextInt();
			if(n==0){
				break;
			}
			board=new int[200];
			for(int i=0;i<lose;i++){
				board[sc.nextInt()]=1;
			}
			for(int i=0;i<back;i++){
				board[sc.nextInt()]=2;
			}
			solve();
		}
	}

	void solve(){
		int[] dp1=new int[400];
		int[] dp2=new int[400];
		dp1[0]=1;
		for(int i=0;i<turn;i++){
			System.arraycopy(dp1,0,dp2,0,400);
			Arrays.fill(dp1,0);
			//dp2ツづヲツづィdpツづーツ古」ツ進
			for(int x=0;x<400;x++){
				if(dp2[x]==0){
					continue;
				}
				if(x==n){
					dp1[x]+=dp2[x]*6;
					continue;
				}
				if(x>=200){
					dp1[x-200]+=dp2[x]*6;
					continue;
				}
				for(int d=1;d<=6;d++){
					int nx=x+d;
					if(nx>n){
						int over=nx-n;
						nx-=over*2;
					}
					if(board[nx]==1){
						nx+=200;
					}
					else if(board[nx]==2){
						nx=0;
					}
					dp1[nx]+=dp2[x];
				}
			}
			System.out.println("dp1");
			for(int k=0;k<=n;k++){
				System.out.print(dp1[k]+",");
			}
			System.out.println();
			for(int k=0;k<=n;k++){
				System.out.print(dp1[200+k]+",");
			}
			System.out.println("");
		}
		long sum=0;
		for(int i=0;i<400;i++){
			sum+=dp1[i];
		}
		double ans=(double)dp1[n]/sum;
		System.out.println(""+ans);
	}

	public static void main(String[] args){
		new Main().run();
	}
}