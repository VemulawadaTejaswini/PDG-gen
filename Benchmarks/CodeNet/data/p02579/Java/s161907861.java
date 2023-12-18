import java.util.*;
import java.io.*;
public class Main {
    
    static int r,c;
    static char[][] a;
    static boolean canMove(int x, int y)
    {
        if(x < 0 || y < 0 || x >= r || y >= c || a[x][y] == '#' )
        {
            return false;
        }
        return true;
    }
    
    static class Pair
    {
        int x, y;
        Pair(int w, int z)
        {
            this.x = w;
            this.y = z;
        }
        public String toString()
        {
            return "("+this.x+","+this.y+")";
        }
    }
    
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      PrintWriter w = new PrintWriter(System.out);
      
      r = sc.nextInt(); c = sc.nextInt(); int sx = sc.nextInt()-1,sy = sc.nextInt()-1,ex = sc.nextInt()-1, ey = sc.nextInt()-1;
      a = new char[r][c];
      for(int i = 0; i < r; i++)
      {
          a[i] = sc.next().toCharArray();
      }
      
      
      int dist[][] = new int[r][c];
      for(int i = 0; i < r; i++)    Arrays.fill(dist[i],Integer.MAX_VALUE);
      dist[sx][sy] = 0;
      Deque<Pair> dq = new LinkedList<>();
      dq.addFirst(new Pair(sx,sy));
      int dx[] = new int[]{-1,1,0,0};
      int dy[] = new int[]{0,0,-1,1};
      while(!dq.isEmpty())
      {
          Pair temp = dq.removeFirst();
          int cx = temp.x, cy = temp.y;
          for(int i = 0; i < 4; i++)
          {
              int nx = cx + dx[i], ny = cy + dy[i];
              if(canMove(nx, ny))
              {
                  if(dist[nx][ny] > dist[cx][cy])
                  {
                      dist[nx][ny] = dist[cx][cy];
                      dq.addFirst(new Pair(nx, ny));
                  }
              }
          }
          for(int i = cx-2; i <= cx+2; i++)
          {
              for(int j = cy-2; j <= cy+2; j++)
              {
                  if(canMove(i,j))
                  {
                      if(dist[i][j] > (dist[cx][cy] + 1))
                      {
                          dist[i][j] = dist[cx][cy]+1;
                          dq.addLast(new Pair(i,j));
                      }
                  }
              }
          }
      }
      w.println(dist[ex][ey]==Integer.MAX_VALUE?-1:dist[ex][ey]);
      w.close();
    }
}