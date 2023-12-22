import java.util.*;

public class Main{
  public static int dp[]=new int[100001];
  public static int go(int a[],int i){
    if(i==a.length-1)
    {
      return 0;
    }
    if(i>a.length-1)
    {
      return 100000;
    }
    if(dp[i]!=-1)
    return dp[i];
    int one=10000,two=10000;
    if(i+1<=a.length-1)
    one=Math.abs(a[i]-a[i+1])+go(a,i+1);
    if(i+2<=a.length-1)
    two=Math.abs(a[i]-a[i+2])+go(a,i+2);
    dp[i]=Math.min(one,two);
    return dp[i];
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
    dp[i]=-1;
    a[i]=sc.nextInt();
    }
    dp[n]=-1;
    System.out.print(go(a,0));
  }
}