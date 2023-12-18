import java.util.*;
import java.io.*;

public class Main{

	private static final long mod =(long)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);

	   int n=sc.nextInt();
	   if(n==1) {
	     System.out.println(0);
	   }else if(n==2) {
	     System.out.println(2);
	   }else {
	     System.out.println(((pow(10,n)%mod-2l*pow(9,n)%mod+pow(8,n)%mod)+mod)%mod);
	   }
	}


	static boolean vis[]=new boolean[10001];
	      static long gcd(long a, long b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 

static long nCr(int n,int r) {
  int dp[][]=new int[1000001][3];
  for(int i=0;i<3;i++) {
    dp[0][i]=0;
  }
  for(int i=0;i<1000001;i++) {
    dp[i][0]=1;
  }
  for(int i=1;i<1000001;i++) {
    for(int j=0;j<3;j++) {
      if(i==j||j==0) {
        dp[i][j]=1;
      }else {
        dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
      }
    }
  }
  return dp[n][r];
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