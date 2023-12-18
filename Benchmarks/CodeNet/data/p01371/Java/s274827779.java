import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main(){
		new AOJ2254().doIt();
	}
	
	class AOJ2254{
		int n;
		int INF = Integer.MAX_VALUE/2;
		int data[][];//stage stageごとの装備
		int[][] memo;
		int[] kihon;
		int goal;
		int dfs(int stage,int bit,int cost){
			int result = INF;	
			int ncost = kihon[stage];
			for(int i=0;i<n;i++)if((bit>>i)%2==1)ncost = Math.min(ncost, data[stage][i]);
			ncost += cost;
//			System.out.println(stage +" "+ Integer.toBinaryString(bit)+" "+ncost);
			bit+=(1<<stage);
			if(bit == goal)return ncost;
			if(memo[stage][bit]<=ncost)return INF;
			for(int i=0;i<n;i++)if((bit>>i)%2==0){
				result = Math.min(result, dfs(i, bit, ncost));
			}
			return memo[stage][bit] = result;
		}
		
		void doIt(){
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				data = new int[n][n];
				kihon = new int[n];
				for(int i=0;i<n;i++){
					kihon[i] = in.nextInt();
					for(int s=0;s<n;s++)data[i][s] = in.nextInt();
				}
				goal = 0;
				for(int i=0;i<n;i++)goal += (1 << i);
				memo = new int[n][1 << 17];
				for(int i=0;i<n;i++)Arrays.fill(memo[i], INF);
				int min = Integer.MAX_VALUE;
				for(int i=0;i<n;i++){
//					System.out.println("-------------------");
					min = Math.min(min, dfs(i,0,0));
				}
				System.out.println(min);
			}
		}
	}
	
}