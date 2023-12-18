import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[][] arr=new int[n][3];
    for(int i=0;i<n;i++){
      arr[i][0]=s.nextInt();
      arr[i][1]=s.nextInt();
      arr[i][2]=s.nextInt();
    }
    int[][] dp=new int[n][3];
    for(int i=0;i<n;i++){
      for(int j=0;j<3;j++){
        if(i==0){
          dp[i][j]=arr[i][j];
        }
        else{
          if(j==0)
            dp[i][j]=Math.max(dp[i-1][1],dp[i-1][2])+arr[i][j];
          else if(j==1)
            dp[i][j]=Math.max(dp[i-1][0],dp[i-1][2])+arr[i][j];
          else
            dp[i][j]=Math.max(dp[i-1][0],dp[i-1][1])+arr[i][j];
        }
      }
    }
      int max=Integer.MIN_VALUE;
      for(int i=0;i<3;i++){
        max=Math.max(dp[n-1][i],max);
      }
      System.out.println(max);
    }
  }
  
        
    