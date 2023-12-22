import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int n=sc.nextInt();
    int[] dp=new int[h+1];
    int[] at=new int[n];
    int[] mp=new int[n];
    for(int i=0;i<n;i++){
      at[i]=sc.nextInt();
      mp[i]=sc.nextInt();
    }
    Arrays.fill(dp,Integer.MAX_VALUE);
    dp[0]=0;
    for(int i=0;i<=h;i++){
      if(dp[i]!=Integer.MAX_VALUE){
        for(int j=0;j<n;j++){
          dp[Math.min(i+at[j],h)]=
            Math.min(
              dp[i]+mp[j],
              dp[Math.min(i+at[j],h)]
            );
        }
      }
    }
    System.out.println(dp[h]);
  }
}