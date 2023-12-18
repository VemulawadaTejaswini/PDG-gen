import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] path = new int[n+1][n+1];
    if(n%2==1){
      int cnt = 0;
      for(int i=1;i<=n;i++)Arrays.fill(path[i],1);
      for(int i=1;i<=n-1;i++)path[i][n-i]=0;
      for(int i=1;i<=n;i++)path[i][i]=0;
      for(int i=1;i<=n;i++)
        for(int j=i+1;j<=n;j++)
          if(path[i][j]==1)cnt++;
      System.out.println(cnt);
      for(int i=1;i<=n;i++)
        for(int j=i+1;j<=n;j++)
          if(path[i][j]==1)System.out.println(i+" "+j);
    }
    else{
      int cnt = 0;
      for(int i=1;i<=n;i++)Arrays.fill(path[i],1);
      for(int i=1;i<=n;i++)path[i][n+1-i]=0;
      for(int i=1;i<=n;i++)path[i][i]=0;
      for(int i=1;i<=n;i++)
        for(int j=i+1;j<=n;j++)
          if(path[i][j]==1)cnt++;
      System.out.println(cnt);
      for(int i=1;i<=n;i++)
        for(int j=i+1;j<=n;j++)
          if(path[i][j]==1)System.out.println(i+" "+j);
    }
  }
}