import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[][] map=new int[3][n+1];
    int cnt=0;
    int max=0;
    for(int i=1;i<3;i++)
      for(int j=1;j<=n;j++)
        map[i][j]=sc.nextInt();
    int kari=map[1][1];
    for(int tate=1;tate<=n;tate++){
      cnt=1;
      for(int j=1;j<=n;j++){
        if(tate==j) {
          cnt=2;
          if(tate!=1&&cnt==2) kari+=map[1][j];
        }
        kari+=map[cnt][j];
      }
      if(kari>max) max=kari;
      kari=0;
    }
    if(max>kari) System.out.println(max);
    else System.out.println(kari);
  }
}