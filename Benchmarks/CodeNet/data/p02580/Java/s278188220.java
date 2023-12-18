import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    int c=sc.nextInt();
    int k=sc.nextInt();
    int row[]=new int[r];
    int col[]=new int[c];
    int g[][]=new int[r][c];
    for(int i=0;i<k;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      x--;
      y--;
      g[x][y]=1;
      row[x]++;
      col[y]++;
    }
    int max=0;
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        int sum=row[i]+col[j];
        if(g[i][j]==1)
        sum--;
        max=Math.max(max,sum);
      }
    }
    System.out.println(max);
  }
}