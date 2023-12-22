import java.util.Scanner;
public class Main{
	public static void main(String args[]){
    	Scanner sc=new Scanner(System.in);
      	int n=sc.nextInt();
      	int k=sc.nextInt();
      	int arr[]=new int[n];
      	for(int i=0;i<n;i++) arr[i]=sc.nextInt();
      
      	long dp[]=new long[n];
      	dp[0]=0;
      	dp[1]=Math.abs(arr[1]-arr[0]);
      	for(int i=2;i<n;i++){
          	long min=Long.MAX_VALUE;
        	for(int j=i-1;j>=0&&j>=i-k;j--){
            	long temp=dp[j]+Math.abs(arr[i]-arr[j]);
              	if(temp<min) min=temp;
            }
         	dp[i]=min;
        }
      	System.out.println(dp[n-1]);
    }
}