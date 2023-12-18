/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fcking interest
*******************************
I'm standing on top of my Monopoly board
That means I'm on top of my game and it don't stop
til my hip don't hop anymore
https://www.a2oj.com/Ladder16.html
*******************************
300iq as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String hi[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int N = Integer.parseInt(st.nextToken());
         int M = Integer.parseInt(st.nextToken());
         st = new StringTokenizer(infile.readLine());
         int sx = Integer.parseInt(st.nextToken())-1;
         int sy = Integer.parseInt(st.nextToken())-1;
         st = new StringTokenizer(infile.readLine());
         int ex = Integer.parseInt(st.nextToken())-1;
         int ey = Integer.parseInt(st.nextToken())-1;
         char[][] label = new char[N][M];
         for(int i=0; i < N; i++)
            label[i] = infile.readLine().toCharArray();
         int[][] grid = new int[N][M];
         for(int i=0; i < N; i++)
            Arrays.fill(grid[i], Integer.MAX_VALUE);
         ArrayDeque<Integer> q = new ArrayDeque<Integer>();
         q.add(sx);  q.add(sy);
         grid[sx][sy] = 0;
         while(q.size() > 0)
         {
            int R = q.poll();
            int C = q.poll();
            //normal moves
            if(R > 0 && grid[R-1][C] > grid[R][C] && label[R-1][C] == '.')
            {
               grid[R-1][C] = grid[R][C];
               q.addFirst(C); q.addFirst(R-1);
            }
            if(C > 0 && grid[R][C-1] > grid[R][C] && label[R][C-1] == '.')
            {
               grid[R][C-1] = grid[R][C];
               q.addFirst(C-1);  q.addFirst(R);
            }
            if(R+1 < N && grid[R+1][C] > grid[R][C] && label[R+1][C] == '.')
            {
               grid[R+1][C] = grid[R][C];
               q.addFirst(C); q.addFirst(R+1);
            }
            if(C+1 < M && grid[R][C+1] > grid[R][C] && label[R][C+1] == '.')
            {
               grid[R][C+1] = grid[R][C];
               q.addFirst(C+1);  q.addFirst(R);
            }
            //magic
            for(int dx=-2; dx <= 2; dx++)
               for(int dy=-2; dy <= 2; dy++)
               {
                  int newx = R+dx;
                  int newy = C+dy;
                  if(Math.min(newx,newy) < 0 || newx >= N || newy >= M || label[newx][newy] == '#')
                     continue;
                  if(grid[newx][newy] > grid[R][C]+1)
                  {
                     grid[newx][newy] = grid[R][C]+1;
                     q.add(newx);   q.add(newy);
                  }
               }
         }
         int res = grid[ex][ey];
         if(res == Integer.MAX_VALUE)
            res = -1;
         System.out.println(res);
      }
   }