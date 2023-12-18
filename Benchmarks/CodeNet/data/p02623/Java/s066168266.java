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
         int T = Integer.parseInt(st.nextToken());
         int[] arr = readArr(N, infile, st);
         int[] brr = readArr(M, infile, st);
         int res = 0;
         ArrayDeque<Integer> q1 = new ArrayDeque<Integer>();
         for(int x: arr)   q1.add(x);
         ArrayDeque<Integer> q2 = new ArrayDeque<Integer>();
         for(int x: brr)   q2.add(x);
         while(q1.size()+q2.size() > 0)
         {
            if(q1.size() == 0)
            {
               int val = q2.peekFirst();
               if(val > T)
                  break;
               T -= val;
               val++;
               q2.poll();
            }
            else if(q2.size() == 0)
            {
               int val = q1.peekFirst();
               if(val > T)
                  break;
               T -= val;
               val++;
               q1.poll();
            }
            else if(q1.peekFirst() > q2.peekFirst())
            {
               int val = q2.peekFirst();
               if(val > T)
                  break;
               T -= val;
               val++;
               q2.poll();
            }
            else
            {
               int val = q1.peekFirst();
               if(val > T)
                  break;
               T -= val;
               val++;
               q1.poll();
            }
            res++;
         }
         System.out.println(res);
      }
      public static int[] readArr(int N, BufferedReader infile, StringTokenizer st) throws Exception
      {
         int[] arr = new int[N];
         st = new StringTokenizer(infile.readLine());
         for(int i=0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());
         return arr;
      }
   }