import java.awt.geom.Point2D;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.*;

public class Main {	
	Scanner in = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){		
		new AOJ0205();
	}

	class AOJ0205{
		public AOJ0205() {
			while(true){
				int[] janken = new int[5];
				int[] result = new int[5];
				int a = in.nextInt();
				if(a==0)break;
				janken[0]=a;
				boolean g=false,t=false,p=false;
				if(janken[0]==1)g=true;
				else if(janken[0]==2)t=true;
				else if(janken[0]==3)p=true;
				for(int i=1;i<5;i++){
					janken[i]=in.nextInt();
					if(janken[i]==1)g=true;
					else if(janken[i]==2)t=true;
					else if(janken[i]==3)p=true;
				}
				if((g&&t&&p)||(g&&!t&&!p)||(!g&&t&&!p)||(!g&&!t&&p))for(int i=0;i<5;i++)result[i]=3;//あいこ
				else if(g&&t&&!p)for(int i=0;i<5;i++){
					if(janken[i]==1)result[i]=1;
					else result[i]=2;
				}else if(g&&!t&&p)for(int i=0;i<5;i++){
					if(janken[i]==3)result[i]=1;
					else result[i]=2;
				}else if(!g&&t&&p)for(int i=0;i<5;i++){
					if(janken[i]==2)result[i]=1;
					else result[i]=2;
				}
				for(int i=0;i<5;i++)System.out.println(result[i]);
			}
			
			
		}
	}

	class AOJ2503{
		int MAX = 0;
		public AOJ2503() {
			Scanner in = new Scanner(System.in);
			int n = in.nextInt();
			int m = in.nextInt();

			int[][] cost = new int[n][n];

			int[] dp = new int[n];
			for(int i=0;i<n*n;i++){
				cost[i/n][i%n]=MAX;
			}
			for(int i=0;i<m;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				cost[a][b]=in.nextInt();
			}	
			//			TODO 一番大きいパスを0のポイントからn-1のポイントまでの

			for(int s=1;s<n;s++){
				for(int i=0;i<=s;i++){
					if(cost[i][s]==MAX)continue;
					dp[s]=Math.max(dp[s],dp[i]+cost[i][s]);
				}
			}
			for(int s=0;s<n;s++)for(int i=0;i<n;i++){
				if(cost[s][i]==MAX)continue;
				dp[i]=Math.max(dp[s]+cost[s][i],dp[i]);
			}
			for(int i=0;i<n;i++)System.out.print(dp[i]+" ");
			System.out.println();
			System.out.println(dp[n-1]);
		}
	}
}