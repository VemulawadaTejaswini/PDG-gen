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
         int K = Integer.parseInt(st.nextToken());
         HashSet<Integer> set = new HashSet<Integer>();
         st = new StringTokenizer(infile.readLine());
         while(K-->0)
            set.add(Integer.parseInt(st.nextToken()));
         matcha:for(int res=N; res <= 99999; res++)
         {
            int temp = res;
            while(temp > 0)
            {
               int d = temp%10;
               if(set.contains(d))
                  continue matcha;
               temp /= 10;
            }
            System.out.println(res);
            return;
         }
      }
   }