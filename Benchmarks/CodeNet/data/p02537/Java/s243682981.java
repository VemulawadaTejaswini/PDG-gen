import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class Main {

static int mod=(int)1e9+7;
 public static void main(String[] $) {

   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextInt();
   int a[]=new int[n];
   for(int i=0;i<n;i++)
     a[i]=sc.nextInt();
  
   int dp[][]=new int[n+1][n+1];
   for(int i=0;i<=n;i++) {
     for(int j=0;j<=n;j++) {
       dp[i][j]=-1;
     }
   }
   System.out.println(solve(dp,a,n,a[n-1],k));
}
static int msb(int a){
   int k=(int)(Math.log(a)/Math.log(2));
   return k;
}
static int solve(int dp[][],int a[],int n,int prev,int k) {
  if(n==0) {
    return 0;
  }
  if(dp[n][prev]!=-1) {
    return dp[n][prev];
  }
  if(Math.abs(a[n-1]-prev)<=k) {
    return dp[n][prev]=Math.max(1+solve(dp,a,n-1,a[n-1],k),solve(dp,a,n-1,prev,k));
  }else {
    return dp[n][prev]=solve(dp,a,n-1,prev,k);
  }
}
static int CeilIndex(int A[], int l, int r, int key) 
{ 
    while (r - l > 1) { 
        int m = l + (r - l) / 2; 
        if (A[m] >= key) 
            r = m; 
        else
            l = m; 
    } 

    return r; 
}

static long pow(long x,long y) {
  long res=1l;
  while(y!=0) {
    if(y%2==1) {
      res=x*res%mod;
    }
    y/=2;
    x=x*x%mod;
  }
  return res;
}

}
class pair{
  int x,y;
  pair(int x,int y){
    this.x=x;
    this.y=y;
  }
}