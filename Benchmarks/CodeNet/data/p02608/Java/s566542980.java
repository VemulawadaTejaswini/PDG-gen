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
         //lmao
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int max = 100;
        int[] res = new int[N+1];
        for(int x=1; x <= max; x++)
          for(int y=1; y <= max; y++)
            for(int z=1; z <= max; z++)
            {
             	int v = x*x+y*y+z*z+x*z+y*z+x*y;
                if(v <= N) res[v]++;
            }
         for(int i=1; i <= N; i++)
           System.out.println(res[i]);
      }
   }