import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long mod = 1000000007;
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] path = new char[h][w];
    for(int i=0;i<h;i++)path[i]=sc.next().toCharArray();
    long[][] cost = new long[h][w];
    cost[0][0]=1;
    for(int i=1;i<h;i++){
      if(path[i][0]=='.')cost[i][0]=cost[i-1][0];
      else cost[i][0]=0;
    }
    for(int i=1;i<w;i++){
      if(path[0][i]=='.')cost[0][i]=cost[0][i-1];
      else cost[0][i]=0;
    }
    for(int i=1;i<h;i++){
      for(int j=1;j<w;j++){
        if(path[i][j]=='.')cost[i][j]=(cost[i-1][j]+cost[i][j-1])%mod;
        else cost[i][j]=0;
      }
    }
    System.out.println(cost[h-1][w-1]);
  }
}