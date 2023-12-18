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
         long X = Math.abs(Long.parseLong(st.nextToken()));
         long K = Long.parseLong(st.nextToken());
         long D = Long.parseLong(st.nextToken());
         if(X >= K*D)
            System.out.println(X-K*D);
         else
         {
            long used = X/D;
            long pos = X-used*D;
            long neg = pos-D;
            K -= used;
            if(K%2 == 0)
               System.out.println(pos);
            else
               System.out.println(Math.abs(neg));
         }
      }
   }