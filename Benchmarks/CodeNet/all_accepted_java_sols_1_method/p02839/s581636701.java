import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int h=sc.nextInt();
    int w=sc.nextInt();
    int[][] a=new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        a[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        a[i][j]-=sc.nextInt();
      }
    }
    boolean[][][] dp=new boolean[h][w][25600];
    //0->12800
    dp[0][0][12800+a[0][0]]=true;
    dp[0][0][12800-a[0][0]]=true;
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        for(int k=0;k<25600;k++){
          if(dp[i][j][k]){
            if(j<w-1){
              dp[i][j+1][k+a[i][j+1]]=true;
              dp[i][j+1][k-a[i][j+1]]=true;
            }
            if(i<h-1){
              dp[i+1][j][k+a[i+1][j]]=true;
              dp[i+1][j][k-a[i+1][j]]=true;
            }
          }
        }
      }
    }
    int ans=Integer.MAX_VALUE;
    for(int i=12800;i<25600;i++){
      if(dp[h-1][w-1][i]){
        ans=i-12800;
        break;
      }
    }
    for(int i=12800;i>=0;i--){
      if(dp[h-1][w-1][i]){
        ans=Math.min(12800-i,ans);
        break;
      }
    }
    System.out.println(ans);
  }
}