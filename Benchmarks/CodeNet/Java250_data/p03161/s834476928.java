import java.util.Scanner;
public class Main{
	
	
	private static Scanner sc=new Scanner(System.in);
	private static int dp[];
	public static int findMinCost(int arr[],int n,int k){
		if(n>=arr.length)
			return Integer.MAX_VALUE;
		if(n==arr.length-1)
			return 0;
		
		if(dp[n]!=Integer.MAX_VALUE)
			return dp[n];
		
		int cost=Integer.MAX_VALUE;
		
		for(int i=1;i<=k;i++){
			if(n+i>=arr.length)
				break;
			cost=Math.min(cost,findMinCost(arr,n+i,k)+Math.abs(arr[n+i]-arr[n]));			
		}
		dp[n]=cost;
		return cost;
	}
	
	public static void main(String []args){
		int n=sc.nextInt();
		int k=sc.nextInt();
		int arr[]=new int[n];
		dp=new int[arr.length];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			dp[i]=Integer.MAX_VALUE;
		}
		System.out.println(findMinCost(arr,0,k));
		// for(int i=0;i<n;i++)
		 	// System.out.print(dp[i]+" ");
		
	}
}