import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=s.nextInt();
    }
    int[] dp=new int[n];
    dp[0]=0;
    
    for(int i=1;i<n;i++){
      int a=Math.max(0,i-k);
      dp[i]=Integer.MAX_VALUE;
      for(int j=a;j<i;j++){
      dp[i]=Math.min(Math.abs(arr[i]-arr[j])+dp[j],dp[i]);
      }
    }
    System.out.println(dp[n-1]);
  }
    
}
