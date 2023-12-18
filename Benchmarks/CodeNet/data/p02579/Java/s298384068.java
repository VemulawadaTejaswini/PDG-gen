import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args) throws IOException {
    PrintWriter out = new PrintWriter(System.out);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st  = new StringTokenizer(br.readLine());

    int h = Integer.parseInt(st.nextToken());
    int w = Integer.parseInt(st.nextToken());
    
    st  = new StringTokenizer(br.readLine());

    int cx = Integer.parseInt(st.nextToken())-1;
    int cy = Integer.parseInt(st.nextToken())-1;

    st  = new StringTokenizer(br.readLine());

    int dx = Integer.parseInt(st.nextToken())-1;
    int dy = Integer.parseInt(st.nextToken())-1;


    char[][] grid = new char[h][w];

    for (int i=0; i<h; i++) {
      String s  = (br.readLine());
      for (int j=0; j<w; j++) {
        grid[i][j] = s.charAt(j);
      }
    }

    int[][] dist = new int[h][w];
    for (int i=0; i<h; i++) {
      Arrays.fill(dist[i], Integer.MAX_VALUE);
    }

    Deque<Integer> dq = new LinkedList();

    dq.addFirst(cy);
    dq.addFirst(cx);
    dist[cx][cy] = 0;

    int[][] dirs = new int[][]{{0,1}, {0,-1}, {-1,0}, {1,0}};

    while (!dq.isEmpty()) {
      int curx = dq.removeFirst(), cury = dq.removeFirst();
      for (int[] dir: dirs) {
        int newx = curx + dir[0], newy = cury + dir[1];
        if (!isLegal(h,w,newx,newy)) {
          continue;
        }
        if (grid[newx][newy]=='.') {
          if (dist[newx][newy]>dist[curx][cury]) {
            dist[newx][newy] = dist[curx][cury];
            dq.addFirst(newy);
            dq.addFirst(newx);
          }
        }
      }

      for (int i=curx-2; i<=curx+2; i++) {
        for (int j=cury-2; j<=cury+2; j++) {
          if (!isLegal(h,w,i,j)) {
            continue;
          }
          if (grid[i][j]=='.') {
            if (dist[i][j]>dist[curx][cury]+1) {
              dist[i][j] = dist[curx][cury]+1;
              dq.addLast(i);
              dq.addLast(j);
            }
          }
        }
      }
    }

    if (dist[dx][dy]==Integer.MAX_VALUE) {
      out.println(-1);
    }
    else
      out.println(dist[dx][dy]);


    out.close();
  }

  public static boolean isLegal(int h, int w, int i, int j) {
    if (i>=0 && i<h && j>=0 && j<w) {
      return true;
    }
    return false;
  }



  
}








