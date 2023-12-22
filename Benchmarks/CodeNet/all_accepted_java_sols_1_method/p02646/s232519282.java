/*
If you want to aim high, aim high
Don't let that studying and grades consume you
Just live life young
******************************
What do you think? What do you think?
1st on Billboard, what do you think of it
Next is a Grammy, what do you think of it
However you think, I’m sorry, but shit, I have no fucking interest
*******************************
Higher, higher, even higher, to the point you won’t even be able to see me
https://www.a2oj.com/Ladder16.html
*******************************
300IQ as writer = Sad!
*/
import java.util.*;
import java.io.*;
import java.math.*;

   public class Main
   {
      public static void main(String omkar[]) throws Exception
      {
         BufferedReader infile = new BufferedReader(new InputStreamReader(System.in));  
         StringTokenizer st = new StringTokenizer(infile.readLine());
         int A = Integer.parseInt(st.nextToken());
         int V = Integer.parseInt(st.nextToken());
         st = new StringTokenizer(infile.readLine());
         int B = Integer.parseInt(st.nextToken());
         int W = Integer.parseInt(st.nextToken());
         int T = Integer.parseInt(infile.readLine());
         //solve
         int dist = Math.abs(A-B);
         if(V <= W)
            System.out.println("NO");
         else
         {
            int speed = V-W;
            double time = 1.0*dist/speed;
            if(time <= T)
               System.out.println("YES");
            else
               System.out.println("NO");
         }
      }
   }