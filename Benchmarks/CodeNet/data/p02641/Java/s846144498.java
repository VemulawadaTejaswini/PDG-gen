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
         int X = Integer.parseInt(st.nextToken());
         int N = Integer.parseInt(st.nextToken());
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         HashSet<Integer> set = new HashSet<Integer>();
         for(int x: arr)
            set.add(x);
         if(!set.contains(X))
            System.out.println(X);
         else
         {
            for(int d=1; d <= 1000; d++)
            {
               int val = X-d;
               if(!set.contains(val))
               {
                  System.out.println(val);
                  return;
               }
               val = X+d;
               if(!set.contains(val))
               {
                  System.out.println(val);
                  return;
               }
            }
         }
      }
   }