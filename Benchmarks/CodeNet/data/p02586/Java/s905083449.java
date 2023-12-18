import java.util.*;
import java.io.*;
public class Main {
    
    static long a[][][] = new long[3001][3001][4];
    static int r,c;
    static long val[][];
    
    static long recur(int x, int y, int tot)
    {
        if(x >= r || y >= c)     
            return 0;
        if(a[x][y][tot] != -1)  
            return a[x][y][tot];
        long tempa = 0;
        if(tot >= 3)
        {
            tempa = Math.max(recur(x+1,y,0), recur(x,y+1,tot));
        }
        else
        {
            tempa = Math.max(recur(x+1,y,0), recur(x,y+1,tot));
            tempa = Math.max(tempa, Math.max(val[x][y]+recur(x+1,y,0), val[x][y]+recur(x,y+1,tot+1)));
        }
        a[x][y][tot] = tempa;
        return a[x][y][tot];
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      r = sc.nextInt();
      c = sc.nextInt();
      val = new long[3001][3001];
      int x = 0, y = 0;
      int n = sc.nextInt();
      for(int i = 0; i < n; i++)
      {
          x = sc.nextInt()-1;
          y = sc.nextInt()-1;
          val[x][y] = sc.nextInt();
      }
      for(int i = 0; i < 3001; i++)
      {
          for(int j = 0; j < 3001; j++)
          {
              Arrays.fill(a[i][j],-1L);
          }
      }
      long fin_ans = recur(0,0,0);
      w.println(fin_ans);
      w.close();
    }
}