import java.util.*;
class Main{
 
  public static void main(String[]args){
    
       
Scanner s=new Scanner(System.in);

int n=s.nextInt();
int arr[]=new int[n+1];
for(int i=1;i<=n;i++) {
	arr[i]=s.nextInt();
}

System.out.println(frog1(n,arr));
  }
  
  public static int frog1(int n,int arr[]) {
	 
	 int dp[]=new int[n+1];
	 dp[1]=0;
	 dp[2]=Math.abs(arr[2]-arr[1]);
	 for(int i=3;i<=n;i++) {
		 int option1=Math.abs(arr[i]-arr[i-2])+dp[i-2];
		 int option2=Math.abs(arr[i]-arr[i-1])+dp[i-1];
		 dp[i]=Math.min(option1,option2);
		 }
	 return dp[n];
	 
 }
  
}
 
  
  
  
  
  
  
