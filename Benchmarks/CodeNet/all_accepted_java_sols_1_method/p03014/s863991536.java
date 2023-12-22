import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int w = sc.nextInt();
    char[][] g = new char[h][];
    for(int i=0;i<h;i++)g[i]=sc.next().toCharArray();
    int[][] l = new int[h][w];
    int[][] r = new int[h][w];
    int[][] u = new int[h][w];
    int[][] d = new int[h][w];
    for(int i=0;i<h;i++){
      for(int j=0;j<w;j++){
        if(g[i][j]=='#')l[i][j]=0;
        else if(j==0)l[i][j]=1;
        else l[i][j]=l[i][j-1]+1;
      }
    }
    for(int i=0;i<h;i++){
      for(int j=w-1;j>=0;j--){
        if(g[i][j]=='#')r[i][j]=0;
        else if(j==w-1)r[i][j]=1;
        else r[i][j]=r[i][j+1]+1;
      }
    }
    for(int j=0;j<w;j++)
      for(int i=0;i<h;i++){
        if(g[i][j]=='#')u[i][j]=0;
        else if(i==0)u[i][j]=1;
        else u[i][j]=u[i-1][j]+1;
      }
    for(int j=0;j<w;j++)
      for(int i=h-1;i>=0;i--){
        if(g[i][j]=='#')d[i][j]=0;
        else if(i==h-1)d[i][j]=1;
        else d[i][j]=d[i+1][j]+1;
      }
    int max = 0;
    for(int i=0;i<h;i++)
      for(int j=0;j<w;j++)max = Math.max(max,l[i][j]+r[i][j]+u[i][j]+d[i][j]-3);
    System.out.println(max);
  }
}