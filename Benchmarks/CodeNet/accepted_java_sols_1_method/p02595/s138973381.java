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
         int D = Integer.parseInt(st.nextToken());
         int res = 0;
         while(N-->0)
         {
            st = new StringTokenizer(infile.readLine());
            double X = Double.parseDouble(st.nextToken());
            double Y = Double.parseDouble(st.nextToken());
            double dist = Math.sqrt(X*X+Y*Y);
            if(dist <= D)
            res++;
         }
         System.out.println(res);
      }
   }