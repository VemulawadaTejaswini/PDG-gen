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
300IQ as writer = Sad!
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
         int K = Integer.parseInt(st.nextToken());
         char[][] grid = new char[N][M];
         for(int i=0; i < N; i++)
            grid[i] = infile.readLine().toCharArray();
         int res = 0;
         for(int mask1=0; mask1 < (1<<N); mask1++)
            for(int mask2=0; mask2 < (1<<M); mask2++)
            {
               int cnt = 0;
               for(int r=0; r < N; r++)
                  for(int c=0; c < M; c++)
                     if(grid[r][c] == '#' && (mask1&(1<<r)) == 0 && (mask2&(1<<c)) == 0)
                        cnt++;
               if(cnt == K)
                  res++;
            }
         System.out.println(res);
      }
   }