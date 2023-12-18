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
		new AOJ0079();
	}
		
	class AOJ0079{
		public AOJ0079() {
			Point2D list[] =new Point2D[20];
			int s;
			for(s=0;in.hasNext();s++){
				String input[] = in.next().split(",");
				list[s] = new Point2D.Double(Double.parseDouble(input[0]),Double.parseDouble(input[1]));
			}
			double sum=0;
			double nagasa[] = new double[s];
			for(int i=1;i<s;i++){
				nagasa[i-1] = list[i-1].distance(list[i]);
				sum+=nagasa[i-1];
			}
			nagasa[s-1]=list[0].distance(list[s-1]);
			double a = 0;
			for(int i=0;i<s;i++)a+=list[i].getX()*list[(i+1)%s].getY()-list[(i+1)%s].getX()*list[i].getY();
			System.out.println(Math.abs(a/2));
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